
package hostalreservation1.GUI;

import hostalreservation1.Listner.ExpanceListener;
import hostalreservation1.Listner.HvrExitBtnListener;
import hostalreservation1.Listner.NewStudentBtnListener;
import hostalreservation1.Listner.NewWorkerListener;
import hostalreservation1.Listner.ReservedVacencyListner;
import hostalreservation1.Listner.SportSocietyListener;
import hostalreservation1.Listner.btnRoomStatusListner;
import hostalreservation1.Listner.litractureSocietyListner;
import hostalreservation1.listner.btnVisitListner;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;

public class HostalVisitReserve1 {
    private JFrame Frame ;
    private JPanel panelimg;
    private JPanel panelinfo;
    private JLabel mainImag;
    private JLabel reservation;
    private JLabel club_society,Warden,facilities,rules;
    private JButton btnvisit;
    private JButton btnroomstatus;
    private JButton btnReserveRoom;
    private JButton btnCheckVacency;
    private JButton newStudent,newWorker,expances,exit,sportSociety,litractureSociety;                  //
    public HostalVisitReserve1()
    {
      createPage();
    }

    public void createPage()
    {
        try
        {    
        Frame = new JFrame();
        Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Frame.setUndecorated(true);
        
        panelimg = new JPanel();
        mainImag = new JLabel(new ImageIcon("login 2.jpg")); 
        panelimg.add(mainImag);
        panelimg.setSize(0, 0);
        
        panelinfo = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(15,15,15,15);
        reservation = new JLabel("Reservation");
        Font font = new Font("Courier",Font.BOLD,18); 
        reservation.setFont(font);
        reservation.setBackground(new Color(166,166,180));
        reservation.setOpaque(true);
        c.gridx=0;
        c.gridy=0;
        panelinfo.add(reservation,c);                            //adding button 
        btnvisit = new JButton("Hostal Visit ");
        c.gridy=1;
        btnvisit.addActionListener(new btnVisitListner());
        panelinfo.add(btnvisit,c);
        btnroomstatus = new JButton(" Room Status ");
        c.gridy = 2;
        btnroomstatus.addActionListener(new btnRoomStatusListner());
        panelinfo.add(btnroomstatus,c);
        btnReserveRoom = new JButton(" Reserve Room ");
        c.gridy = 3;
        btnReserveRoom.addActionListener(new ReservedVacencyListner());
        panelinfo.add(btnReserveRoom,c);
        
        
        Warden = new JLabel("  Warden   ");                                     //warden
        Warden.setFont(font);
        Warden.setBackground(new Color(166,166,180));
        Warden.setOpaque(true);
        c.gridx++;
        c.gridy=0;
        panelinfo.add(Warden,c);
        c.gridy++;
        newStudent = new JButton(" Student admission ");
        panelinfo.add(newStudent,c);
        newStudent.addActionListener(new NewStudentBtnListener());
        c.gridy++;
        newWorker = new JButton(" New Worker ");
        panelinfo.add(newWorker,c);
        c.gridy++;
        newWorker.addActionListener(new NewWorkerListener());
        expances = new JButton(" Expances ");
        panelinfo.add(expances,c);
        expances.addActionListener(new ExpanceListener());
        c.gridy++;
        c.gridx+=4;
        exit = new JButton(" Exit ");
        panelinfo.add(exit,c);
        exit.addActionListener(new HvrExitBtnListener());
        
        club_society = new JLabel("Club Society");
        club_society.setFont(font);
        club_society.setBackground(new Color(166,166,180));
        club_society.setOpaque(true);
        c.gridx=2;
        c.gridy=0;
        panelinfo.add(club_society,c);
        sportSociety = new JButton("Sport  "); //Club Society btn.....
        c.gridy++;
        panelinfo.add(sportSociety,c);
        sportSociety.addActionListener(new SportSocietyListener());
        litractureSociety = new JButton("literature  ");
        c.gridy++;
        panelinfo.add(litractureSociety,c);
        litractureSociety.addActionListener(new litractureSocietyListner());
        
        
//        facilities = new JLabel("Facilities"); 
//        facilities.setFont(font);
//        facilities.setBackground(new Color(166,166,180));
//        facilities.setOpaque(true);
//        c.gridx=3;
//        c.gridy=0;
//        panelinfo.add(facilities,c);
//        
//        rules = new JLabel("Rules and Regulation ");
//        rules.setFont(font);
//        rules.setBackground(new Color(166,166,180));
//        rules.setOpaque(true);
//        c.gridx=4;
//        c.gridy=0;
//        panelinfo.add(rules,c);
        
        panelinfo.setBounds(0, 0, 1300, 1000);
        panelinfo.setOpaque(false);
        Frame.add(panelinfo);
        Frame.add(panelimg); 
        Frame.setVisible(true);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        
    }
    
}
