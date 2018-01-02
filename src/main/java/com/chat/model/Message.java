package com.chat.model;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@ToString(includeFieldNames=true)
@Data
public class Message {

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }

    private MessageType type;
    private String content;
    private String sender;
    private List<String> currentUsers;
}
