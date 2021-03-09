
package hostalreservation1.Filing;

import hostalreservation1.logic.Expance;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExpanceFile 
{
     private Expance e;
     private ObjectOutputStream cin;
     private FileOutputStream file;
     public ExpanceFile(String ProductName,String ProductPrice)
     {
         e = new Expance(ProductName,ProductPrice);
         try
         {
             file = new FileOutputStream("Expances.txt",true);
         } catch (FileNotFoundException ex) 
         {
            // Logger.getLogger(ExpanceFile.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("Expance file not found");
         }
         try
         { 
             cin = new ObjectOutputStream(file);
         } catch (IOException ex) 
         {
             System.out.println("Expance file not Created");
         }
         try {
             cin.writeObject(e);
             cin.flush();
         } catch (IOException ex) {
             System.out.println("Expance Object is not created or not sterilized");
         }
     }
}
