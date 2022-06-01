def gv

pipeline{
    agent any
        parameters {
            choice(name: "Version",description:"Which version to check",choices:["1.0","1.1","1.2"])   
            booleanParam(name: "Use_SSL",description:"Use SSL",defaultValue:false)
        }
        stages{
            stage("build"){
                steps{
                    script{
                        gv.buildApp()
                    }
                }
            }
            stage ("test"){
                when {
                    expression{
                        params.Use_SSL == true
                    }
                }
                steps{
                    script{
                        gv.buildApp()
                    }
                }
            }
            stage ("deploy"){
                steps{
                    script{
                        gv.deployApp()
                    }
            }
        }
    }
}