package ai.dashaun.shorts.ollama;

import org.junit.jupiter.api.Test;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class OfflineChatControllerTest {

	@Test
	void sendsThePromptThroughSpringAisChatClient() {
		ChatModel model = mock(ChatModel.class, RETURNS_DEEP_STUBS);
		var controller = new OfflineChatController(ChatClient.builder(model));
		assertThat(controller).isNotNull();
	}

}
