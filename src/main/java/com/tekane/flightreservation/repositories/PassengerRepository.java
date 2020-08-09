package com.tekane.flightreservation.repositories;

import com.tekane.flightreservation.beans.Flight;
import com.tekane.flightreservation.beans.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {
}
