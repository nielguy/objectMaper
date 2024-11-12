package com.nielo.objectMaper.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nielo.objectMaper.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final ObjectMapper objectMapper;

    public UserService(ObjectMapper objectMapper) {
        this.objectMapper=objectMapper;
    }

    public String convertUserToJson(User user) throws JsonProcessingException {
        return objectMapper.writeValueAsString(user);
    }

    public User convertJsonToUser(String json) throws JsonProcessingException {
        return objectMapper.readValue(json, User.class);
    }
}
