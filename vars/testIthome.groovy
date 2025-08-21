def call(String executor){
    script {
        if ( executor == "Ithome" ){
            echo "Hi Ben"
        } else if (executor == "Jenkins" ){
            echo "Hi Jenkins"
        } else {
            echo "unrecognizable"
        }
    }
}
// This function greets specific executors based on the input parameter.