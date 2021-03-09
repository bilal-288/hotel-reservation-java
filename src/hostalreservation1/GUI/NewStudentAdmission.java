
package hostalreservation1.GUI;


import hostalreservation1.Listner.SaveNewStudentListener;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class NewStudentAdmission {
  JFrame fram;
  JLabel Hostal_name = new JLabel(" ABC ");
  JLabel pic1 = new JLabel();
  JLabel pic2 = new JLabel();
  JLabel defalt = new JLabel(" ");
  JLabel Fname = new JLabel("First Name       ");
  JTextField field_fname = new JTextField(15);
  JTextField ffield_fname = new JTextField(15);
  JLabel Lname = new JLabel("Last Name        ");
  JTextField field_lname = new JTextField(15);
  JLabel Age = new JLabel  ("Age                  ");
  String []ageString = {"18","19","20","21","22","23","24"};
  JComboBox field_Age = new JComboBox(ageString);
  JLabel Address = new JLabel("Address            ");
  JTextField field_Address = new JTextField(15);
  JLabel Phone_num = new JLabel("Phone number  ");
  JTextField field_num = new JTextField(15);
  JLabel cnic = new JLabel("CNIC               ");
  JTextField field_cnic = new JTextField(15);
  JLabel Religion = new JLabel("Relegion         ");
  String []religionString = {"Muslims","Hindus","Christians"};
  JComboBox field_Religion = new JComboBox(religionString);
  JLabel Nationality = new JLabel("Nationality     ");
  String nationalityString[] = {"Pakistan","India","USA"};
  JComboBox field_Nationality = new JComboBox(nationalityString);
  JLabel Gander = new JLabel("Gander            ");
  String genderString[] = {"Male"};
  JComboBox field_Gander = new JComboBox(genderString);
  JLabel admissionFee = new JLabel("Admission Fee");
  JTextField field_AdmissionFee = new JTextField(15);
  JButton save = new JButton("Save");
  JPanel panel1 ;  
  JPanel panel ;
  JPanel panel2 ;  
  String sfname,slname,scnic,sage,saddress,sphone,sreligion,snationality,sgander; 
   public NewStudentAdmission()
   {
       fram = new JFrame(" ");
       pic2 = new JLabel(( new ImageIcon("Login 2.jpg")));
       panel2 = new JPanel();
       panel2.add(pic2);
       panel2.setBounds(0, 200, 1370, 1000);
 
       pic1 = new JLabel(( new ImageIcon("Login page.jpg")));
       panel = new JPanel();
       panel.add(pic1);//name of hostal
       panel.setBounds(0, 0, 1370, 200);
       fram.add(panel); 
       
       panel1 = new JPanel(new GridBagLayout());
       panel1.setBackground(Color.blue);
       GridBagConstraints c = new GridBagConstraints();
       panel1.setOpaque(false);
       panel1.setBounds(0, 250, 1370, 1000);
       c.anchor = GridBagConstraints.NORTHWEST;
       c.gridx = 0;
       c.gridy = 0;
       
       
       c.ipady =10;
       panel1.add(defalt,c);                                                                          //defalt label for setting positions
       c.gridy+=1;
       panel1.add(Fname,c);
       c.gridx = 10;
       c.ipady =10;
       panel1.add(field_fname,c);
       c.gridx = 0;
       c.gridy++;
       panel1.add(Lname,c);
       c.gridx = 10;
       c.ipady =10;
       panel1.add(field_lname,c);
        c.gridx = 0;
       c.gridy++;
       panel1.add(Age,c);
       c.gridx = 10;
       c.ipady =10;
       panel1.add(field_Age,c);
        c.gridx = 0;
       c.gridy++;
       panel1.add(Gander,c);
       c.gridx = 10;
       c.ipady =10;
       panel1.add(field_Gander,c);
        c.gridx = 0;
        c.gridy++;
       panel1.add(Address,c);
       c.gridx = 10;
       c.ipady =10;
       panel1.add(field_Address,c);
        c.gridx = 0;
       c.gridy++;
       panel1.add(Phone_num,c);
       c.gridx = 10;
       c.ipady =10;
       panel1.add(field_num,c);
        c.gridx = 0;
       c.gridy++;
       panel1.add(cnic,c);
       c.gridx = 10;
       c.ipady =10;
       panel1.add(field_cnic,c);
        c.gridx = 0;
       c.gridy++;
       panel1.add(Religion,c);
       c.gridx = 10;
       c.ipady =10;
       panel1.add(field_Religion,c);
        c.gridx = 0;
       c.gridy++;
       panel1.add(Nationality,c);
       c.gridx = 10;
       c.ipady =10;
       panel1.add(field_Nationality,c);
        c.gridx = 0;
       c.gridy++;
       panel1.add(admissionFee,c);
       c.gridx = 10;
       c.ipady =10;
       panel1.add(field_AdmissionFee,c);
       c.gridx = 0;
       c.gridy++;
       JLabel space= new JLabel("  ");
       panel1.add(space,c);
        c.gridx = 10;
       c.gridy++;
       panel1.add(save,c);
       save.addActionListener(new SaveNewStudentListener(fram, field_fname,field_lname,field_Age,field_Address,field_num,field_cnic,field_Religion,field_Nationality,field_Gander ));
       
       fram.add(panel1);//work on panel1....
       
       fram.setSize(1500, 1500);
       fram.setVisible(true);
       fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
   }

    public String getField_Age() {
        return (field_Age.getSelectedObjects()).toString();
    }

    public String getField_Address() {
        return field_Address.getText();
    }

    public String getField_fname() {
        return field_fname.getText();
    }

    public JTextField getField_lname() {
        return field_lname;
    }

    public JTextField getField_num() {
        return field_num;
    }

    public JTextField getField_cnic() {
        return field_cnic;
    }

    public String getField_Religion() {
        return field_Religion.getSelectedItem().toString();
    }

    public String getField_Nationality() {
        return field_Nationality.getSelectedItem().toString();
    }

    public String getField_Gander() {
        return field_Gander.getSelectedItem().toString();
    }
    
}
