def jobName="test pipeline docker agent"
pipelineJob(jobName) {
    definition {
        cps {
            script(readFileFromWorkspace('Jenkinsfile'))
            sandbox()
        }
    }

    queue(jobName)
}