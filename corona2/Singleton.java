
import static com.oracle.nio.BufferSecrets.instance;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sirak
 */
  
public class Singleton   {
     private static Singleton instance;
      
       
    
private Singleton(){

}

public static Singleton getInstance(){
    
    if(instance==null)
        instance=new Singleton();
         return instance;
    
    
}
/*public Singleton reader(){ // normalde bu methodu client classımızda çağırmalıyız 
    try{
    FileReader f = new FileReader("C:\\Users\\Public\\corona.txt");
            BufferedReader in = new BufferedReader(f);
            String[] line = new String[2];
    }catch(Exception e){
    
    
    }
    
         return instance;



}*/
}

    
  

