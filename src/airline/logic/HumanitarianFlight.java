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
public class HumanitarianFlight extends Flight {

    private String nationality;

    public HumanitarianFlight() {
    }

    public HumanitarianFlight(String nationality, int flightId, String schedule, int price, Route route) {
        super(flightId, schedule, price, route);
        this.nationality = nationality;

    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "\nPerson Nationality: " + getNationality() + "\nFlight Id: " + getFlightId()
                + "\nSchedule: " + getSchedule() + "\nPrice: " + getPrice() + "\nDestination: "
                + getRoute().getDestination() + "\nOrigin: " + getRoute().getOrigin()
                + "\nRoute Id: " + getRoute().getRouteId() + "\nFlight Duration: " + getRoute().getFlightDuration();

    }

}
