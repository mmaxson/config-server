
Usage:
    curl root:marku@localhost:8888/encrypt -d mysecret
    curl root:marku@localhost:8888/decrypt --data-urlencode xxx


Patch location for Mac OSX unlimited strength JCE is
/Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/lib/security.

You need to copy the local_policy.jar and US_export_policy.jar to the patch location

Build:

    mvn clean package docker:build
    docker build -t marku/config-server target/docker
    docker push marku/config-server
    docker pull marku/config-server



Run:

    Local Env variables:
    ENCRYPT_KEY=jamIt;SPRING_PROFILES_ACTIVE=dev;SECURITY_USER_PASSWORD=marku;SERVER_PORT=8888


    AWS:
    docker run -d -p  80:80 -e 3306:3306   -e "LOG_APPENDER=Console-Appender" -e ENCRYPT_KEY=jamIt  -e SECURITY_USER_PASSWORD=marku -e SERVER_PORT=80 -e SPRING_PROFILES_ACTIVE=aws    marku/config-server --name config-server

