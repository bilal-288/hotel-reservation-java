/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostalreservation1.Filing;

import java.io.*;

/**
 *
 * @author sajid
 */
public class ReservedVacencyFile {
  //  File vacency = new File("Reserved Vacency.txt");
    FileWriter fw;
    BufferedWriter bw;
    PrintWriter pr;
   // SaveReservedVacencyListner srv;
    public ReservedVacencyFile() {
        try
        { 
          
        this.fw = new FileWriter("Reserved Vacency.txt",true);
        bw = new BufferedWriter(fw);
        pr = new PrintWriter(bw);
        }catch(IOException e)
        {
            System.out.println(e);
        }
    }

    public void WriteOnfile(String field_fname,String  field_lname,String  field_Age,String  field_Address,String  field_num,String  field_cnic,String  field_Religion,String  field_Nationality,String  field_Gander) throws IOException {
     
        this.pr.println(field_fname);
        this.pr.println(field_lname);
        this.pr.println(field_Age);
        this.pr.println(field_Address);
        this.pr.println(field_num);
        this.pr.println(field_cnic);
        this.pr.println(field_Religion);
        this.pr.println(field_Nationality);
        this.pr.println(field_fname);
        this.pr.println(field_Gander);
    }
    
    public void CloseFile() throws IOException
    {
        //bw.flush();
        bw.close();
        pr.close();
    }
    
}
