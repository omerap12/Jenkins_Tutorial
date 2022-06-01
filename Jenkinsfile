pipeline{
    agent any
        parameters {
            string (name: "Input", defaultValue: "MrJenkins",description:"Input one word")
            booleanParam(name:"Print", description:"Print the input", defaultValue:true)
        }

        stages{
            stage("Build"){
                steps{
                    sh "gcc main.c"
                    echo "Build complete"
                }
            }
            stage("Test"){
                steps{
                    sh "./a.out ${params.Input}"
                    echo "Test complete"
                }
            }
                }
            }
        
