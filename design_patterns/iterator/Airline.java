/* 
 * Timothy Young
 */
import java.util.ArrayList;

/**
 * Represents an airline that holds a list of flights.
 */
public class Airline {
    private String title;
    private ArrayList<Flight> flights;

    /**
     * Constructs an Airline with the given title and loads flights from the FlightLoader.
     * 
     * @param title the title of the airline
     */
    public Airline(String title) {
        this.title = title;
        this.flights = FlightLoader.getFlights(); // Load flights from the file
    }

    /**
     * Gets the title of the airline.
     * 
     * @return the title of the airline
     */
    public String getTitle() {
        return title;
    }

    /**
     * Creates an iterator for flights matching the specified origin and destination airport codes.
     * 
     * @param fromCode the airport code of the origin
     * @param toCode   the airport code of the destination
     * @return an Iterator of Flight objects, or null if the codes are invalid
     */
    public Iterator<Flight> createIterator(String fromCode, String toCode) {
        Airport from = getValidAirport(fromCode);
        Airport to = getValidAirport(toCode);
        
        if (from == null || to == null) {
            System.out.println("Must enter valid airport codes");
            return null;
        }

        return new FlightIterator(flights, from, to);
    }

    /**
     * Validates the given airport code and returns the corresponding Airport enum.
     * 
     * @param code the airport code to validate
     * @return the Airport enum if valid, null otherwise
     */
    private Airport getValidAirport(String code) {
        try {
            return Airport.valueOf(code.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            return null; // Return null for invalid codes
        }
    }
}