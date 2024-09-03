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
public class Pilot extends Worker {

    private Route route;

    public Pilot() {
        
    }

    public Pilot(Route route, String name, String lastName, int age, int id, int salary) {
        super(name, lastName, age, id, salary);
        this.route = route;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    @Override
    public void showData() {
        System.out.println("Route: " + getRoute());
    }

    public void updateData(Route ro) {
        this.route = ro;
    }

    @Override
    public String toString() {
        return "Route " + getRoute()  + "Name " + getName() + "Last Name " + getLastName() + "Age " + getAge() + "id" + getId() + "salary" + getSalary();
    }

}
