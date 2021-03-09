
package hostalreservation1.Listner;

import hostalreservation1.GUI.NewWorkerGui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWorkerListener implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) {
       new NewWorkerGui();       
    }
        
}
