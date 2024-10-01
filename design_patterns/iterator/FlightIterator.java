/* 
 * Timothy Young
 */

import java.util.Arraylist;
import java.util.Iterator;

/**
 * An iterator for filtering and iterating over flights based on origin and destination
 */

 public class FlightIterator implements Iterator<Flight> {
    private ArrayList<Flight> flights;
    private int position = 0;
    private Airport from;
    private Airport to;

    /**
     * Constructs a FlightIterator with the list of flights and specified origin
     * @param flights the list of flights to iterate over
     * @param from the origin airport
     * @param to the destination airport
     */

    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = new ArrayList<>();
        this.from = from;
        this.to = to;

        for(Flight flight : flights) {
            if(flight.getFrom() == from && flight.getTo() == to) {
                this.fligts.add(flight);
            }
        }
    }

    /**
     * Checks if there are more flights to iterate over
     */

     public boolean hasNext() {
        return position < flights.size();
     }

     /**
      * Returns the next flight in the iteration
      */
      @Override

      public Flight next() {
        is(hasNext()) {
            return flights.get(position++);
        }
        return null;
      }


 }