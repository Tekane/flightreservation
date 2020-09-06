package com.tekane.flightreservation.controllers.user;

import com.tekane.flightreservation.beans.User;
import com.tekane.flightreservation.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/register")
    public String showRegistrationPage() {
        return "login/registerUser";
    }

    @PostMapping("/registerUser")
    public String registerUser(@ModelAttribute("user") User user) {
        userRepository.save(user);
        return "login/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap model) {
        User userDetails = userRepository.findByEmail(email);
        if (userDetails.getPassword().equals(password)) {
            return "flights/findFlights";
        } else {
            model.addAttribute("msg","Invalid Username or password. Please try again!!!");
        }
        return "login/login";
    }
}
