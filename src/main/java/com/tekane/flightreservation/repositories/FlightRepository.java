package com.tekane.flightreservation.repositories;

import com.tekane.flightreservation.beans.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight,Long> {
    @Query("From Flight as fl where fl.departureCity=:departureCity and fl.arrivalCity =:arrivalCity and fl.dateOfDeparture=:dateOfDeparture")
    List<Flight> findFlight(@Param("departureCity") String from ,@Param("arrivalCity") String to ,@Param("dateOfDeparture") Date date);
}
