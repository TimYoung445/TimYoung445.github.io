/* 
 * Timothy Young
 */
import java.time.LocalTime;

/**
 * Represents a flight with details such as flight number, origin, destination, and timings.
 */
public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    /**
     * Constructs a Flight with the specified parameters.
     * 
     * @param flightNum   the flight number
     * @param from        the origin airport
     * @param to          the destination airport
     * @param startTime   the start time of the flight
     * @param endTime     the end time of the flight
     * @param numTransfers the number of transfers for the flight
     */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

    /**
     * Gets the origin airport of the flight.
     * 
     * @return the origin airport
     */
    public Airport getFrom() {
        return from;
    }

    /**
     * Gets the destination airport of the flight.
     * 
     * @return the destination airport
     */
    public Airport getTo() {
        return to;
    }

    /**
     * Returns a string representation of the flight details.
     * 
     * @return formatted string containing flight information
     */
    @Override
    public String toString() {
        long duration = java.time.Duration.between(startTime, endTime).toMinutes();
        long hours = duration / 60;
        long minutes = duration % 60;

        String transferInfo = numTransfers == 0 ? "Direct Flight" :
                              numTransfers == 1 ? "1 Stopover" :
                              numTransfers + " Transfers";
        
        return String.format(from, to, startTime, endTime, hours, minutes, transferInfo);
    }
}