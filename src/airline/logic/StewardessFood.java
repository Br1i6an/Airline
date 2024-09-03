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
public class StewardessFood extends Stewardess {

    private String foodType;
    private String dish;
    private String dishHour;

    public StewardessFood() {
    }

    public StewardessFood(String foodType, String dish, String dishHour, String workShift, String workRole, String name, String lastName, int age, int id, int salary) {
        super(workShift, workRole, name, lastName, age, id, salary);

        this.foodType = foodType;
        this.dish = dish;
        this.dishHour = dishHour;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public String getDishHour() {
        return dishHour;
    }

    public void setDishHour(String dishHour) {
        this.dishHour = dishHour;
    }

}
