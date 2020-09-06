package com.tekane.flightreservation.controllers.reservation;

import com.tekane.flightreservation.beans.Flight;
import com.tekane.flightreservation.beans.Reservation;
import com.tekane.flightreservation.dto.ReservationRequest;
import com.tekane.flightreservation.repositories.FlightRepository;
import com.tekane.flightreservation.services.reservation.ReservationService;
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

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/showCompleteReservation")
    public String showCompleteReservation(@RequestParam("flightId") long flightId, ModelMap modelMap) {
        Flight flight = flightRepository.findById(flightId).get();
        modelMap.addAttribute("flight", flight);
        return "reservation/completeReservation";
    }

    @PostMapping("/completeReservation")
    public String completeReservation(ReservationRequest request,ModelMap modelMap) {
        Reservation reservation = reservationService.bookFlight(request);
        modelMap.addAttribute("msg","Reservation created successfully and the id is "+reservation.getId());
        return "reservation/reservationConfirmation";
    }
}
