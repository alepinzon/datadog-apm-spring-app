# datadog-apm-spring-app
POC with the Datadog docker agent and a Springboot Application with the APM feature of DD.

## Datadog Configuration
- update the [docker-compose.yml](https://github.com/alepinzon/datadog-apm-spring-app/blob/main/docker-compose.yml#L7) file with your datadog api key `<YOUR-DATADOG-API-KEY>`

## Run the Java example
- Run `./gradlew build` (or `gradlew.bat` if on windows) to generate a .jar file.
- Run to build the docker image: `docker build -t dd-apm-spring-app .`
- Run the complete example with docker compose: `docker-compose up`


## See APM in Datadog
- Hit this web url locally to generate some APM metrics and traces:
    - http://localhost:8080/transaction
- Visit [Datadog APM env:demo](https://app.datadoghq.com/apm/services?env=demo) and the `dd-apm-spring-app` service should be listed.
