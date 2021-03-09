
package hostalreservation1.Listner;

import hostalreservation1.Filing.SaveNewWorker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class SaveWorkerBtnListener implements ActionListener {
    private String name,cnic;
    private JFrame fram;
    public SaveWorkerBtnListener(String name,String cnic,JFrame fram)
    {
        this.name = name;
        this.cnic = cnic;
        this.fram=fram;
        
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        try {
            new SaveNewWorker(name,cnic);
            fram.hide();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
