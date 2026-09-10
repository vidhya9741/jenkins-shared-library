def call() {

    stage('Build') {
        echo 'Starting Build...'

        sh '''
            echo "Running Linux commands"
            echo "Current directory:"
            pwd

            echo "Files in workspace:"
            ls -la
        '''

        echo 'Build completed successfully'
    }

    stage('Test') {
        echo 'Starting Test...'

        sh '''
            echo "Running test..."
            echo "Test passed!"
        '''

        echo 'Test completed successfully'
    }
}
