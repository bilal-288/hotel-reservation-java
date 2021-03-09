
package hostalreservation1.Filing;

import hostalreservation1.logic.StudentFeesClass;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class StudentFeeFile 
{
    
    private  StudentFeesClass s;
     private ObjectOutputStream cin;
     private FileOutputStream file;
     public StudentFeeFile(String Name,String Fees)
     {
         s = new StudentFeesClass(Name,Fees);
         System.out.println("Name is "+Name);
         System.out.println("Fees  is "+Fees);
         try
         {
             file = new FileOutputStream("Studentfees.txt",true);
         } catch (FileNotFoundException ex) 
         {
            // Logger.getLogger(ExpanceFile.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("Student fees file not found");
         }
         try
         { 
             cin = new ObjectOutputStream(file);
         } catch (IOException ex) 
         {
             System.out.println("Student fees not Created");
         }
         try {
             cin.writeObject(s);
             cin.flush();
         } catch (IOException ex) {
             System.out.println("Student fees is not created or not sterilized");
         }
     }

   
}
