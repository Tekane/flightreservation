package com.tekane.flightreservation.controllers.flight;

import com.tekane.flightreservation.beans.Flight;
import com.tekane.flightreservation.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class FlightController {
    @Autowired
    private FlightRepository flightRepository;

    @PostMapping("findFlights")
    public String findFlight(@RequestParam("departureCity") String from, @RequestParam("arrivalCity")
            String to, @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate, ModelMap model) {

        List<Flight> flights = flightRepository.findFlight(from, to, departureDate);
        if (flights.size() > 0)
            model.addAttribute("flights", flights);
        return "flights/displayFlights";
    }
}
