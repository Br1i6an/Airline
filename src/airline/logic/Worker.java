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
public class Worker {

    private String name;
    private String lastName;
    private int age;
    private int id;
    private int salary;

    public Worker() {
    }

    public Worker(String name, String lastName, int age, int id, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void showData() {
        System.out.println("Name: " + getName() + "Last Name: " + getLastName() + "Id: " + getId() + "Age: " + getAge() + "Salary:" + getSalary());
    }

    public void updateData() {

    }

}
