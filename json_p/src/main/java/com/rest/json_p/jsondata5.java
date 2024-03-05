/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rest.json_p;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.json.Json;
import javax.json.JsonWriter;


/**
 *
 * @author ELCOT
 */
public class jsondata5 {
    
    public static void main(String...args) throws FileNotFoundException, IOException 
    {
        jsondata2 jd2=new jsondata2(); 
                
        File file=new File("jsonDataFile5.json");
        
        try(FileOutputStream fos = new FileOutputStream(file)){
        
            if(!file.exists()){
                  file.createNewFile();
            }
            JsonWriter jsonwrite = Json.createWriter(fos);
            jsonwrite.writeObject(jd2.buildJsonDocument());
            jsonwrite.close();
            fos.flush();
            fos.close();
            
        }
    }
}
