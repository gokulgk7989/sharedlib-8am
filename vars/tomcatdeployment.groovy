def call(){
    sh "scp -o StrictHostKeyChecking=no target/*.war ec2-user@172.31.42.56:/opt/tomcat9/webapps"
    sh "ssh ec2-user@172.31.42.56 /opt/tomcat9/bin/shutdown.sh"
    sh "ssh ec2-user@172.31.42.56 /opt/tomcat9/bin/startup.sh"
}
