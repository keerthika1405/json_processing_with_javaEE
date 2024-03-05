/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rest.json_p;

import javax.json.Json;
import javax.json.JsonObject;

/**
 *
 * @author ELCOT
 */

//use builder to construct a json object
public class jsondata2 {
    
    public JsonObject buildJsonDocument(){
           
        JsonObject jsonobj = (JsonObject) Json.createObjectBuilder()
                .add("title","json processing")
                .add("chapter", Json.createArrayBuilder()
                        .add("chpater1")
                        .add("chapter2")
                        .add("chapter3")
                        .add("chapter4")
                )
                .add("released", true)
                .add("length", 30)
                .add("sourceCode",Json.createObjectBuilder()
                        .add("repositoryname","json processing with JavaEE")
                        .add("url","githu.io/keesite")
                )
                .add("complementaryCourse",Json.createArrayBuilder()
                        .add(Json.createObjectBuilder()
                             .add("title","restfulService")
                             .add("length",120))
                        .add(Json.createObjectBuilder()
                              .add("title","Enterprises Edition")
                              .add("length",150))
                )
                .addNull("notes")
                .build();
        
        return jsonobj;
    }
}
