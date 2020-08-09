package com.tekane.flightreservation.repositories;

import com.tekane.flightreservation.beans.Flight;
import com.tekane.flightreservation.beans.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
