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
public class Stewardess extends Worker {

    private String workShift;
    private String workRole;

    public Stewardess() {
    }

    public Stewardess(String workShift, String workRole, String name, String lastName, int age, int id, int salary) {
        super(name, lastName, age, id, salary);
        this.workShift = workShift;
        this.workRole = workRole;
    }

    public String getWorkshift() {
        return workShift;
    }

    public void setWorkshift(String workshift) {
        this.workShift = workshift;
    }

    public String getWorkRole() {
        return workRole;
    }

    public void setWorkRole(String workRole) {
        this.workRole = workRole;
    }

    @Override
    public void showData() {
        System.out.println("Work Shift: " + getWorkshift() + "Work Role: " + getWorkRole());
    }

    public void updateData(String ws, String wr) {
        this.workShift = ws;
        this.workRole = wr;
    }

    @Override
    public String toString() {
        return "workShift " + "workRole " + getWorkRole() + getWorkshift() + "name " + getName() + "lastName " + getLastName() + "age " + getAge() + "id" + getId() + "salary" + getSalary();
    }

}
