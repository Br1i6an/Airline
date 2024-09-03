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
public class NationalFlight extends Flight {

    private int personCapacity;

    public NationalFlight() {
    }

    public NationalFlight(int personCapacity, int flighId, String schedule, int price, Route route) {
        super(flighId, schedule, price, route);
        this.personCapacity = personCapacity;
    }

    public int getPersonCapacity() {
        return personCapacity;
    }

    public void setPersonCapacity(int personCapacity) {
        this.personCapacity = personCapacity;
    }

    @Override
    public String toString() {
        return "\nPerson Capacity: " + getPersonCapacity() + "\nFlight Id: " + getFlightId()
                + "\nSchedule: " + getSchedule() + "\nPrice: " + getPrice() + "\nDestination: "
                + getRoute().getDestination() + "\nOrigin: " + getRoute().getOrigin()
                + "\nRoute Id: " + getRoute().getRouteId() + "\nFlight Duration: " + getRoute().getFlightDuration();
    }

}
