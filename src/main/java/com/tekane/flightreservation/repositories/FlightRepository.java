package com.tekane.flightreservation.repositories;

import com.tekane.flightreservation.beans.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight,Long> {
}
