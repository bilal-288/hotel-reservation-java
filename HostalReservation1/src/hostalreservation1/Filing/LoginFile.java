/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostalreservation1.Filing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;



public class LoginFile {
     
    FileReader fr;
    BufferedReader br;
    String name ,password;
    
    public LoginFile() throws IOException {
        fr = new FileReader("login.txt");
        br = new BufferedReader(fr);
        name = br.readLine();
        password = br.readLine();
    }
   
    public String getName()
    {
        return name;
    }
    public String getPassword()
    {
        return password;
    }


}
