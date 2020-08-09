package com.tekane.flightreservation.beans;

public class Reservation {
    private Long id;
    private boolean checkedIn;
    private String numberOfBags;
    private Passenger passenger;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public String getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(String numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    private Flight flight;

}
