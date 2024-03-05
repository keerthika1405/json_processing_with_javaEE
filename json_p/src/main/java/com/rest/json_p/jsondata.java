/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rest.json_p;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringReader;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author ELCOT
 */
public class jsondata {
    
       String jsonData = "{"
                + "\"name\": \"John\""
                + ",\"sourceCode\": {\"url\": \"github.io/keesite\"}"
                + ", \"age\": 30"
                + ", \"city\": null" 
                + ", \"length\": \"130\""
                + ", \"hobbies\": [\"reading\", \"hiking\", \"painting\"]"
                + ", \"released\": true "
                + ", \"complementryData\": [ {\"capter1\": \"restService1\"}, {\"capter2\": \"restService2\"}, {\"chapter3\": \"restService3\"} ]" 
                +"}";

       
       public JsonObject loadJsonString()  {
          
    //read json object
           JsonReader jsonread = Json.createReader(new StringReader(jsonData));//creating a json factory with jsonReader  by reading with string reader
           JsonObject jsonobj = jsonread.readObject();
           jsonread.close();
           
         return jsonobj;
         
         
         //read json array
//          public JsonObject loadJsonArray() throws FileNotFoundException{
//           JsonReader jsonread1 = Json.createReader(new FileReader(jsonData));
//           JsonArray jsonobj1 = jsonread.readArray();
//           jsonread.close();
//           return jsonobj1;
//          }
       }
}

