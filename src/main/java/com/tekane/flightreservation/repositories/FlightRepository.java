package com.tekane.flightreservation.repositories;

import com.tekane.flightreservation.beans.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface FlightRepository extends JpaRepository<Flight,Long> {
    Flight findFlight(String from , String to , Date date);
}
