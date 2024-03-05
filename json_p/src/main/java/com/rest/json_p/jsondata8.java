/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rest.json_p;

import java.io.StringReader;
import javax.json.Json;
import javax.json.stream.JsonParser;
import static javax.json.stream.JsonParser.Event.VALUE_NUMBER;
import static javax.json.stream.JsonParser.Event.VALUE_STRING;

/**
 *
 * @author ELCOT
 */
public class jsondata8 {
 
    public String retrieveValue(final String key,final String json){
        
        JsonParser parser=Json.createParser(new StringReader(json));
        
          
        while(parser.hasNext()){
        JsonParser.Event event=parser.next();
    
        switch(event){
            
            case KEY_NAME:
                if(parser.getString().equalsIgnoreCase(key)){
                    event=parser.next();
                }
                if(event==VALUE_STRING|| event==VALUE_NUMBER){
                    
                    return parser.getString();
                }
        }
       break;
    
    }
        return null;
}
   
}
