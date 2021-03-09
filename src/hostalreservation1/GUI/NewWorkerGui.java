
package hostalreservation1.GUI;

import hostalreservation1.Listner.SaveWorkerBtnListener;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

public class NewWorkerGui {
    private JFrame fram;
    private JPanel panel,defalt,panelLabel;
    private JLabel workerLabel,name,cnic;
    private JTextField field_name,field_cnic;
    private JComboBox type;
    private GridBagConstraints c;
    private JButton saveBtn;
    public NewWorkerGui()
    {
        fram = new JFrame();
        panel = new JPanel(new GridBagLayout());
       
        defalt = new JPanel();
        panelLabel = new JPanel();
        panelLabel.setSize(130, 30);
        panelLabel.setLocation(300, 150);
        workerInfoPanel();
        workerLabel = new JLabel(" Enter Worker Data ");
        panelLabel.add(workerLabel);
        panel.setSize(300, 200);
        panel.setLocation(300,200);
        panelLabel.setBackground(Color.red);
        defalt.add(new JLabel(new ImageIcon("Worker data image.jpg")));
        panel.setBackground(Color.red);
        
        fram.add(panelLabel);
        fram.add(panel);
        fram.add(defalt);
        fram.setSize(1400, 1400);
        fram.setDefaultCloseOperation(3);
        fram.setVisible(true);
    }
    void workerInfoPanel()
    {
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        name = new JLabel("Name    ");
        panel.add(name,c);
        c.gridx++;
        field_name = new JTextField(15);
        panel.add(field_name,c);
        c.gridy+=1;
        c.gridx = 0;
        cnic = new JLabel("CNIC    ");
        panel.add(cnic,c);
        c.gridx++;
        field_cnic = new JTextField(15);
        panel.add(field_cnic,c);
        c.gridy++;
        //c.gridx++;
        saveBtn = new JButton("Save");
        panel.add(saveBtn,c);
        saveBtn.addActionListener(new SaveWorkerBtnListener(name.getText(),cnic.getText(),fram));
        
    }
    
}
