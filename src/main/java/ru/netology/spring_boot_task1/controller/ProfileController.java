package ru.netology.spring_boot_task1.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.spring_boot_task1.profile.SystemProfile;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class ProfileController {

    private SystemProfile profile;

    public ProfileController(SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping()
    public String getProfile() {
        return profile.getProfile();
    }
}