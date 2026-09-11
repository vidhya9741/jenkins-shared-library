def call(String environment) {

    echo "Deploying application to ${environment}"

    sh """
        echo "Deployment started"
        echo "Environment: ${environment}"
        echo "Deployment completed"
    """
}
