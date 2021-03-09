/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostalreservation1.Listner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author 14007065242
 */
public class WorkerSaveBtnFile {
    
   private FileWriter fw;
   private  BufferedWriter bw;
   private  PrintWriter pr;
   
   public WorkerSaveBtnFile()
   {
        try                                                                     
        { 
        this.fw = new FileWriter("New Worker Admission.txt",true);
        bw = new BufferedWriter(fw);
        pr = new PrintWriter(bw);
        }catch(IOException e)
        {
            System.out.println(e);
        }
   }
  
  public void FileWriter(String name,String worker) throws IOException
  {
      pr.println(name);
      pr.println(worker);
      bw.close();
      pr.close();
  }
    
}
