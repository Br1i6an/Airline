/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.logic;

/**
 *
 * @author ADMIN
 */
public class InternationalFlight extends Flight {

    private int Capacity;

    public InternationalFlight() {
    }

    public InternationalFlight(int Capacity, int flighId, String schedule, int price, Route route) {
        super(flighId, schedule, price, route);
        this.Capacity = Capacity;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    @Override
    public String toString() {
        return "\nCapacity: " + getCapacity() + "\nFlight Id: " + getFlightId()
                + "\nSchedule: " + getSchedule() + "\nPrice: " + getPrice() + "\nDestination: "
                + getRoute().getDestination() + "\nOrigin: " + getRoute().getOrigin()
                + "\nRoute Id: " + getRoute().getRouteId() + "\nFlight Duration: " + getRoute().getFlightDuration();
    }

}
