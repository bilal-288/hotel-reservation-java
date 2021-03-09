/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostalreservation1.Filing;

import hostalreservation1.Listner.WorkerSaveBtnFile;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class SaveNewWorker {
   
    public SaveNewWorker(String name,String cnic) throws IOException
    {
        WorkerSaveBtnFile wsbf = new WorkerSaveBtnFile();
        wsbf.FileWriter(name, cnic);
    }
}
