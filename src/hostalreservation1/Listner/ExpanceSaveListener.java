
package hostalreservation1.Listner;

import hostalreservation1.Filing.ExpanceFile;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExpanceSaveListener implements ActionListener 
{
   public String productName;
   public String productPrice;

    public ExpanceSaveListener(String productName, String productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }
   
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        new ExpanceFile(productName,productPrice);
    }
    
}
