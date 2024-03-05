/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rest.json_p;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonString;
import javax.json.JsonValue;

/**
 *
 * @author ELCOT
 */

//traverse based on value type
public class jsondata3 {
    
    private static final String jsonData =  Utils.ROOT  + "\\" + "jsonDataFile.json";
   
    public static void main(String[]args) throws FileNotFoundException
    {            
    navigateJsonStructure(loadJsonString(),null);   
    }
    
    public static JsonObject loadJsonString() throws FileNotFoundException{
        
      JsonReader jsonread = Json.createReader(new FileReader(jsonData));
      JsonObject jsonobj = jsonread.readObject();
      jsonread.close();
     
      return jsonobj;
    }
    
    public static void navigateJsonStructure(JsonValue jsonval, String key){
    
        if(key!=null)
        printkey(key);
        
        switch( jsonval.getValueType())
        {
            case OBJECT:
            
                JsonObject jsonobj=(JsonObject)jsonval;
                for(String name: jsonobj.keySet()){
                navigateJsonStructure(jsonobj.get(name),name);
                }
            break;
            
            case ARRAY:
            for(JsonValue val:(JsonArray)jsonval)
                navigateJsonStructure(val,null);
            break;
            
            case STRING:
            printvalue(((JsonString)jsonval).getString());
            break;
            
            case NUMBER:
            printvalue(jsonval.toString());
            break;
            
            case TRUE:
            
            break;
            
            case FALSE:
                
            break;
            
            case NULL:
                
            break;
        }
        }
    
    private static void printkey(String key){
        System.out.print(key+ ": ");
    }
    private static void printvalue(String x){
        System.out.println(x);
    }
            
 
}
