pipeline {
    agent any
    stages{
        stage('git scm') {
          steps {
            git 'https://github.com/Rajab-ali-logiciel/Hello-world.git'
                }
            }
        stage('build') {
          steps {
            bat '''dotnet restore
                    dotnet clean
                    dotnet build "Hello world.csproj"'''
          }
        }
    }
}
