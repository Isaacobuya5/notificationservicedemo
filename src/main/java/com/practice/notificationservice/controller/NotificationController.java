package com.practice.notificationservice.controller;

import com.practice.notificationservice.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @PostMapping("/notify")
    public void notifyUser(@RequestBody User user) {
        System.out.println("You are welcome to our application " + user.getFirstName() + " " + user.getLastName());
    }
}
