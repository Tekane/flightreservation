package com.tekane.flightreservation.services.reservation;

import com.tekane.flightreservation.beans.Flight;
import com.tekane.flightreservation.beans.Passenger;
import com.tekane.flightreservation.beans.Reservation;
import com.tekane.flightreservation.dto.ReservationRequest;
import com.tekane.flightreservation.repositories.FlightRepository;
import com.tekane.flightreservation.repositories.PassengerRepository;
import com.tekane.flightreservation.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation bookFlight(ReservationRequest request) {
        //Make Payment

        Long flightId = request.getFlightId();
        Flight flight = flightRepository.getOne(flightId);

        Passenger passenger = new Passenger();
        passenger.setFirstName(request.getPassengerFirstName());
        passenger.setLastName(request.getPassengerLastName());
        passenger.setPhone(request.getPassengerPhone());
        passenger.setEmail(request.getPassengerEmail());
        Passenger savedPassenger = passengerRepository.save(passenger);

        Reservation reservation = new Reservation();
        reservation.setFlight(flight);
        reservation.setPassenger(savedPassenger);
        reservation.setCheckedIn(false);

        Reservation savedReservation = reservationRepository.save(reservation);

        return savedReservation;
    }
}
