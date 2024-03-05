/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rest.json_p;

import java.io.StringReader;
import javax.json.Json;
import javax.json.stream.JsonParser;
import static javax.json.stream.JsonParser.Event.KEY_NAME;

/**
 *
 * @author ELCOT
 */
public class jsondata6 {
    
    private static String jsondata ="{"
                + "\"name\": \"xyz\""
                + ",\"sourceCode\": {\"url\": \"github.io/keesite/java\"}"
                + ", \"age\": 22"
                + ", \"city\": null" 
                + ", \"length\": \"10\""
                + ", \"hobbies\": [\"reading\", \"hiking\", \"painting\",\"dancing\"]"
                + ", \"released\": true "
                + ", \"complementryData\": [ {\"capter1\": \"restService1\"}, {\"capter2\": \"restService2\"}, {\"chapter3\": \"restService3\"} ]" 
                +"}";
    
    public static void main(String[]args){
    parseJsonString();
    }
    
    public static void parseJsonString(){
    
        JsonParser parser=Json.createParser(new StringReader(jsondata));
        
        while(parser.hasNext()){
        JsonParser.Event event=parser.next();
        
        
        switch(event){
            
            case START_ARRAY:
                break;
            case END_ARRAY:
                break;
            case START_OBJECT:
                break;
            case END_OBJECT:
                break;
            case VALUE_NULL:
                break;
            case VALUE_FALSE:
                break;
            case VALUE_TRUE:
                System.out.println(event.toString());
                break;
            case KEY_NAME:
                System.out.println(event.toString()+"-"+parser.getString()+"-");
                break;
            case VALUE_STRING:
                break;
            case VALUE_NUMBER:
                System.out.println(event.toString()+"-"+parser.getString());
                break;
              
        }
       }
        
        
    }
}
