package com.brucemelo.springaivaadin;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.InMemoryChatMemory;
import org.springframework.ai.ollama.api.OllamaModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatClientConfig {

    @Bean
    public ChatClient chatClient(ChatClient.Builder chatClientBuilder) {
        var ollamaOptions = OllamaOptions.builder().withModel(OllamaModel.LLAMA3_2).build();
        var messageChatMemoryAdvisor = new MessageChatMemoryAdvisor(new InMemoryChatMemory());
        return chatClientBuilder
                .defaultOptions(ollamaOptions)
                .defaultAdvisors(messageChatMemoryAdvisor)
                .build();
    }

}
