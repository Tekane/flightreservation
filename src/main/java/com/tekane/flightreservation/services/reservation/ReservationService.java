package com.tekane.flightreservation.services.reservation;

import com.tekane.flightreservation.beans.Reservation;
import com.tekane.flightreservation.dto.ReservationRequest;

public interface ReservationService {
     Reservation bookFlight(ReservationRequest request);
}
