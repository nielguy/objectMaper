package com.nielo.objectMaper.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.nielo.objectMaper.model.User;
import com.nielo.objectMaper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/to-json")
    public String convertToJson(@RequestBody User user) throws JsonProcessingException {
        return userService.convertUserToJson(user);
    }

    @PostMapping("/from-json")
    public User convertFromJson(@RequestBody String json) throws JsonProcessingException {
        return userService.convertJsonToUser(json);
    }
}
