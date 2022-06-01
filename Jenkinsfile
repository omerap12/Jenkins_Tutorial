pipeline{
    agent any
        parameters {
            choice(name: "Version",description:"Which version to check",choices:["1.0","1.1","1.2"])   
            booleanParam(name: "Use_SSL",description:"Use SSL",defaultValue:false)
        }
        stages{
            stage("build"){
                steps{
                    echo "In build"
                }
            }
            stage ("test"){
                when {
                    expression{
                        params.Use_SSL == true
                    }
                }
                steps{
                    echo "In test"
                }
            }
            stage ("deploy"){
                steps{
                    echo "In deploy ${params.Version}"
            }
        }
    }
}
