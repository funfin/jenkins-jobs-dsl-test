def jobName="test_pipeline_docker_agent"
pipelineJob(jobName) {
    definition {
        cps {
            script(readFileFromWorkspace('Jenkinsfile'))
            sandbox()
        }
    }

    queue(jobName)
}