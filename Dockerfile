FROM eclipse-temurin:20-jdk-alpine

ADD target/DockerLearning-0.0.1-SNAPSHOT.jar .
#8000 - port dla aplikacji w kontenerze
EXPOSE 8000
#Komenda do uruchomienia obrazu
CMD java -jar DockerLearning-0.0.1-SNAPSHOT.jar