
package hostalreservation1.Filing;

import hostalreservation1.logic.StudentFeesClass;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ShowTotalStudentFee
{
   private FileInputStream file;
   private ObjectInputStream output;
   private StudentFeesClass fs;
   public ShowTotalStudentFee() throws FileNotFoundException, IOException, ClassNotFoundException
   {
       file=new FileInputStream("Studentfees.txt");
       ObjectInputStream in=new ObjectInputStream(file);
       fs = new StudentFeesClass(" "," ");
       
       
           try 
           {
              
               while(true)
               {
                  fs = (StudentFeesClass)in.readObject();    
                  System.out.println("Name is  "+fs.getName());
                  System.out.println("Fees is  "+fs.getFees());
               }
           } catch (EOFException ex) 
           {
               System.out.println("File is Ended"); 
           }
       
   }
}
