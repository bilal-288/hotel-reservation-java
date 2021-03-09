/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostalreservation1.Listner;

import hostalreservation1.Filing.StudentFeeFile;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author sajid
 */
public class StudentFeeSaveListener implements ActionListener 
{
    private String name;
    private String fee;
    JTextField name1; JTextField fee1;
    public StudentFeeSaveListener(JTextField name,JTextField fee)
    {
        this.name1 = name;
        this.fee1 = fee;
    }
    public StudentFeeSaveListener(String name,String fee)
    {
        this.name = name;
        this.fee = fee;
        System.out.println(" Name is = "+name + "  Fee is  =  "+fee);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
           new StudentFeeFile(name1.getText(),fee1.getText());
           System.out.println(" Name is = "+name1.getText() + "  Fee is  =  "+fee1.getText());      
    }
    
}
