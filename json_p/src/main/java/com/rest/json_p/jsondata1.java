/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rest.json_p;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author ELCOT
 */



//here instead of creating a stringReader like in jsonobject class ,, we create a file reader

public class jsondata1 {
    
    private final String jsonData =  Utils.ROOT  + "\\" + "jsonDataFile.json";
    
    public JsonObject loadJsonString() throws FileNotFoundException{
        
      JsonReader jsonread = Json.createReader(new FileReader(jsonData));
      JsonObject jsonobj = jsonread.readObject();
      jsonread.close();
     
      return jsonobj;
    }
}
