package ai.dashaun.shorts.ollama;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.*;

@RestController
class OfflineChatController {

	private final ChatClient chat;

	OfflineChatController(ChatClient.Builder builder) {
		chat = builder.build();
	}

	@GetMapping("/explain")
	String explain(@RequestParam(defaultValue = "Spring Boot") String topic) {
		return chat.prompt("Explain " + topic + " in one sentence for a Java developer.").call().content();
	}

}
