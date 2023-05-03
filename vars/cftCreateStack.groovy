def call(Map params = [:]) {
    withCredentials([aws(accessKeyVariable: 'AWS_ACCESS_KEY_ID', secretKeyVariable: 'AWS_SECRET_ACCESS_KEY', credentialsId: "aws-access-cred")]) {
        sh "echo it works"
        // sh "aws cloudformation create-stack --stack-name ${params.stackName} --template-body ${params.templatePath}  --capabilities CAPABILITY_NAMED_IAM"
    }
}
