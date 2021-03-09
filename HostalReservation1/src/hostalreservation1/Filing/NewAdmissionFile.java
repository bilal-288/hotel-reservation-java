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
public class NewAdmissionFile {
    //File vacency = new File("New Students Admission.txt");
   private FileWriter fw;
   private  BufferedWriter bw;
   private  PrintWriter pr;
    //expances
   private  FileWriter fwe;
   private  BufferedWriter bwe;
   private  PrintWriter pre;
   // SaveReservedVacencyListner srv;
    public NewAdmissionFile()  {
        try                                                                     
        { 
        this.fw = new FileWriter("New Students Admission.txt",true);
        bw = new BufferedWriter(fw);
        pr = new PrintWriter(bw);
        //Expances   
        fwe = new FileWriter("Expances.txt",true);
        bwe = new BufferedWriter(fwe);
        pre = new PrintWriter(bwe);
        }catch(IOException e)
        {
            System.out.println(e);
        }
    }        
  
//        FileReader in = null;
//        BufferedReader br;
//        try {
//               in = new FileReader("Expances.txt");
//               br = new BufferedReader(in);
//               while (br.readLine() != null) {
//                        System.out.println(br.readLine());
//                    }
//            } catch (FileNotFoundException ex) 
//            {
//                 Logger.getLogger(NewAdmissionFile.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        finally
//        {
//            try {  
//                in.close();
//            } catch (IOException ex) {
//                System.out.println(ex);
//                //Logger.getLogger(NewAdmissionFile.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//
            //
 

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
        this.pre.println(10000);

    }
    
    public void CloseFile() throws IOException
    {
        //bw.flush();
        bw.close();
        pr.close();
        this.bwe.close();
        this.pre.close();
    }
    
}
