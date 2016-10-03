pipelineJob("sample-microservice") {
    description('Build the sample-microservice project')
    definition {
        cps {
            script '''
node ('java') {
    stage 'Checkout'
    git 'https://github.com/cplee/sample-microservice.git'

    stage 'Build'
    sh './gradlew build'
}
'''
        }
    }
}