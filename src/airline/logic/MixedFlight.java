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
public class MixedFlight extends Flight {

    private int Personweight;
    private int Cargoweight;

    public MixedFlight() {
    }

    public MixedFlight(int Personweight, int Cargoweight, int flighId, String schedule, int price, Route route) {
        super(flighId, schedule, price, route);
        this.Personweight = Personweight;
        this.Cargoweight = Cargoweight;
    }

    public int getPersonweight() {
        return Personweight;
    }

    public void setPersonweight(int Personweight) {
        this.Personweight = Personweight;
    }

    public int getCargoweight() {
        return Cargoweight;
    }

    public void setCargoweight(int Cargoweight) {
        this.Cargoweight = Cargoweight;
    }

    @Override
    public String toString() {
        return "\nPerson Weight: " + getPersonweight() + "\nCargo Weight: " + getCargoweight() + "\nFlight Id: " + getFlightId()
                + "\nSchedule: " + getSchedule() + "\nPrice: " + getPrice() + "\nDestination: "
                + getRoute().getDestination() + "\nOrigin: " + getRoute().getOrigin()
                + "\nRoute Id: " + getRoute().getRouteId() + "\nFlight Duration: " + getRoute().getFlightDuration();

    }
}
