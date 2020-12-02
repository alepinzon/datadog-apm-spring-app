FROM openjdk:8-jre-alpine3.9

WORKDIR /app
COPY build/libs/*.jar /app/app.jar

COPY agent/*.jar /app/dd-java-agent.jar

EXPOSE 8080

ENTRYPOINT java -javaagent:/app/dd-java-agent.jar -Ddd.service.name=$DD_SERVICE_NAME -Ddd.agent.host=$DD_AGENT_HOST -Ddatadog.slf4j.simpleLogger.defaultLogLevel=debug -jar /app/app.jar