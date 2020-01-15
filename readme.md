
安装arcface人脸识别包:
mvn install:install-file -DgroupId=com.arcsoft -DartifactId=arcface -Dversion=2.0 -Dfile=lib\\arcsoft-sdk-face-2.0.jar -Dpackaging=jar
mvn install:install-file -DgroupId=com.arcsoft -DartifactId=arcface -Dversion=2.1 -Dfile=lib\\arcsoft-sdk-face-2.1.jar -Dpackaging=jar

mvn install:install-file -DgroupId=com.alibaba -DartifactId=mydruid -Dversion=1.1.20 -Dfile=lib\\mydruid-1.1.20.jar -Dpackaging=jar

notes:
1、打包时不执行测试
    mvn clean package -DskipTests

2、部署到linux服务器时，需要把arcsoft的三个 so 文件放入 /usr/lib64 目录下

