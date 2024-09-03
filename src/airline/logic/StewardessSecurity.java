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
public class StewardessSecurity extends Stewardess{
    private String instructions;
    private String doorOperHour;
    private String doorCloseHour;

    public StewardessSecurity() {
    }

    public StewardessSecurity(String instructions, String doorOperHour, String doorCloseHour, String workShift, String workRole, String name, String lastName, int age, int id, int salary) {
        super(workShift, workRole, name, lastName, age, id, salary);
        this.instructions = instructions;
        this.doorOperHour = doorOperHour;
        this.doorCloseHour = doorCloseHour;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getDoorOperHour() {
        return doorOperHour;
    }

    public void setDoorOperHour(String doorOperHour) {
        this.doorOperHour = doorOperHour;
    }

    public String getDoorCloseHour() {
        return doorCloseHour;
    }

    public void setDoorCloseHour(String doorCloseHour) {
        this.doorCloseHour = doorCloseHour;
    }
    
    
    
}
