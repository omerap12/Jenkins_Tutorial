def buildApp(){
    echo 'Building app'
}
def testApp(){
    echo 'Testing app'
}

def deployApp(){
    echo "In deploy ${params.Version}"
}

return this