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
public class CargoFlight extends Flight {

    private String type;

    public CargoFlight() {
    }

    public CargoFlight(String type, int flighId, String schedule, int price, Route route) {
        super(flighId, schedule, price, route);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nCargo Type: " + getType() + "\nFlight Id: " + getFlightId()
                + "\nSchedule: " + getSchedule() + "\nPrice: " + getPrice() + "\nDestination: "
                + getRoute().getDestination() + "\nOrigin: " + getRoute().getOrigin()
                + "\nRoute Id: " + getRoute().getRouteId() + "\nFlight Duration: " + getRoute().getFlightDuration();
    }

}
