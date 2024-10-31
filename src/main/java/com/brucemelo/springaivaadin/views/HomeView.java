package com.brucemelo.springaivaadin.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.messages.MessageInput;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.ai.chat.client.ChatClient;

@Route("")
public class HomeView extends VerticalLayout {

    public HomeView(ChatClient chatClient) {
        add(new H1("Welcome to your new application - Chat with AI"));
        var messageList = new VerticalLayout();
        var messageInput = new MessageInput();
        messageInput.addSubmitListener(e -> {
            messageList.add(new Paragraph("You: " + e.getValue()));
            var content = chatClient.prompt(e.getValue()).call().content();
            messageList.add(new Paragraph("AI: " + content));
        });
        add(messageList, messageInput);
    }

}
