pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/username/flask-app.git'
            }
        }
        stage('Install Dependencies') {
            steps {
                sh 'pip install -r requirements.txt'
            }
        }
        stage('Run Tests') {
            steps {
                sh 'pytest' // Add tests if applicable
            }
        }
        stage('Build') {
            steps {
                sh 'python app.py &'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying application'
                // Add deployment steps, such as moving files to a production server
            }
        }
    }
}
