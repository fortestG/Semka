package ru.itis.semestralwork.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RootController {

    @GetMapping
    public String getRoot(Authentication authentication) {

        if (authentication != null) {
            return "redirect:/profile";
        } else {
            return "redirect:/signIn";
        }
    }

}
