package com.tekane.flightreservation.controllers;

import com.tekane.flightreservation.beans.User;
import com.tekane.flightreservation.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getRegister")
    public String showRegistrationPage() {
        return "login/registerUser";
    }

    @PostMapping("/registerUser")
    public String register(@ModelAttribute("user") User user) {
        if (user != null)
            userRepository.save(user);
        return "login/login";
    }

    @PostMapping("/login")
    public String userLogin(@PathParam("email") String email, @PathParam("password") String password, ModelMap modelMap) {
        User user = userRepository.findByEmail(email);
        if (user.getPassword().equals(password)) {
            return "login/findFlights";
        } else {
            modelMap.addAttribute("error", "Invalid user name or password , Please try again with correct information!");
        }
        return "login/login";
    }

}
