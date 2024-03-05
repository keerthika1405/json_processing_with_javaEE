/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rest.json_p;

import java.io.File;
import java.io.FileOutputStream;
import java.io.StringWriter;
import javax.json.Json;
import javax.json.JsonValue;
import javax.json.JsonWriter;
import javax.json.stream.JsonGenerator;


/**
 *
 * @author ELCOT
 */
public class jsondata7 {
    
    public String writejsonStreamtoString(){
    
        StringWriter write=new StringWriter();
        
        
        
        //store it in a flat file by creating new json object
//        
//          File file=new File("jsonDataFile8.json");
//              try(FileOutputStream fos = new FileOutputStream(file)){
//        
//            if(!file.exists()){
//                  file.createNewFile();
//            }
//copy the below code here
//              }
//    JsonWriter jsonwrite = Json.createWriter(fos);
//            jsonwrite.writeObject(jd2.buildJsonDocument());
//            jsonwrite.close();
//            fos.flush();
//            fos.close();


        
        JsonGenerator generate=Json.createGenerator(write);
        
        generate.writeStartObject()
                .write("name","John")
                .writeStartArray("chapter")
                        .write("chapter1")
                        .write("chapter2")
                        .write("chapter3")
                        .write("chapter4")
                .writeEnd()
                .write("realased",JsonValue.TRUE)
                .write("age",80)
                .writeStartObject("sourceCode")
                        .write("repository","json Processing JavaEE")
                        .write("url","github.com/keesite")
                .writeEnd()
                .writeStartArray("complementartCources")
                        .writeStartObject()
                        .write("title","java practicing 1")
                        .write("length",30)
                        .writeEnd()
                        .writeStartObject()
                        .write("title","java practicing 2")
                        .write("length",20)
                        .writeEnd()
                .writeEnd()
                .write("Notes",JsonValue.NULL)
                .writeEnd();
        generate.close();
                    
        return write.toString();
    }
}
