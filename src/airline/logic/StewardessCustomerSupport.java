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
public class StewardessCustomerSupport extends Stewardess {

    private String hour;
    private String attentionType;

    public StewardessCustomerSupport() {
    }

    public StewardessCustomerSupport(String hour, String attentionType, String workShift, String workRole, String name, String lastName, int age, int id, int salary) {
        super(workShift, workRole, name, lastName, age, id, salary);
        this.hour = hour;
        this.attentionType = attentionType;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getAttentionType() {
        return attentionType;
    }

    public void setAttentionType(String attentionType) {
        this.attentionType = attentionType;
    }
    

}
