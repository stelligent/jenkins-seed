pipelineJob("microservice-exemplar") {
    description('Build the microservice-exemplar project')
    definition {
        cps {
            script '''
node ('java') {
    stage 'Checkout'
    git 'https://github.com/stelligent/microservice-exemplar.git'

    stage 'Build'
    sh './gradlew build'
}
'''
        }
    }
}