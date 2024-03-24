FROM eclipse-temurin:21-jre
ARG version=2.0.0
COPY target/blog-0.0.1.jar app.jar
COPY opentelemetry-javaagent.jar opentelemetry-javaagent.jar
# ADD --chmod=644 https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v$version/opentelemetry-javaagent.jar /opentelemetry-javaagent.jar
ENV JAVA_TOOL_OPTIONS=-javaagent:/opentelemetry-javaagent.jar
ENTRYPOINT ["java","-jar", "/app.jar"]
