/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostalreservation1.logic;

import java.io.Serializable;

/**
 *
 * @author sajid
 */
public class StudentFeesClass implements Serializable
{
    private String name,fees;    

    public StudentFeesClass(String name, String fees) {
        this.name = name;
        this.fees = fees;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }
}
