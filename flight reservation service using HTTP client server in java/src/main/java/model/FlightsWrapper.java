package model;

import java.util.Collections;
import java.util.List;

/**
 * @author Michael Pogrebinsky - www.topdeveloperacademy.com
 * Represents a wrapper around a list of  {@link Flight}s to make sure we do NOT return a
 * JSON ARRAY to the client (which is generally a bad practice)
 * DO NOT MODIFY THIS CLASS
 */
public class FlightsWrapper {
    private List<Flight> flights = Collections.EMPTY_LIST;

    public FlightsWrapper(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
