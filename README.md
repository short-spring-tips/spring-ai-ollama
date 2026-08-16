# Run Offline LLMs with Spring AI and Ollama

Java 25, Spring Boot 4.1.0, and Spring AI 2.0.0. Spring Boot discovers `compose.yml`, starts Dashaun's preloaded `phi4-mini` Ollama image, waits for readiness, and wires `ChatClient` to the local service.

```bash
./mvnw spring-boot:run
curl 'http://localhost:8080/explain?topic=Spring%20Boot'
```

The application sends no prompt to a cloud provider and needs no cloud API key.

Video: `https://youtube.com/shorts/{SHORT_ID}`
