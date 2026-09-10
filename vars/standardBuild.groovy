def call() {

    stage('Build') {

        echo 'Starting Maven Build'

        sh '''
            echo "Checking files..."
            ls -la

            echo "Running Maven build..."
            mvn clean package -DskipTests
        '''

        echo 'Maven build completed'
    }

    stage('Test') {

        echo 'Running Unit Tests'

        sh 'mvn test'

        echo 'Unit Tests completed'
    }
}
