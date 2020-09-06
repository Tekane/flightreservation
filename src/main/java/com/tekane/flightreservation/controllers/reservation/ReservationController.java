package com.tekane.flightreservation.controllers.reservation;

import com.tekane.flightreservation.beans.Flight;
import com.tekane.flightreservation.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReservationController {

    @Autowired
    private FlightRepository flightRepository;

    @GetMapping("/showCompleteReservation")
    public String showCompleteReservation(@RequestParam("flightId") long flightId , ModelMap modelMap) {
        Flight flight = flightRepository.findById(flightId).get();
        modelMap.addAttribute("flight",flight);
        return "reservation/completeReservation";
    }
}
