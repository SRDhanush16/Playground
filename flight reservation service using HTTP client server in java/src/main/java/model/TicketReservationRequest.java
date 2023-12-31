package model;

/**
 * @author Michael Pogrebinsky - www.topdeveloperacademy.com
 * Represents a request to book one or multiple tickets aboard a particular flight
 * DO NOT MODIFY THIS CLASS
 */
public class TicketReservationRequest {
    private int id;
    private String airlineName;
    private int numberOfTickets;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
