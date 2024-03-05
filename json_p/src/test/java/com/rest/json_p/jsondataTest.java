/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.rest.json_p;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonValue;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author ELCOT
 */
public class jsondataTest {
    
//    public jsondataTest() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    @Test
    public void testLoadJsonString() {
          
   jsondata data = new jsondata();

   JsonObject result = data.loadJsonString();   

     assertThat(result.getString("name")).isEqualTo("John");
     assertThat(result.getJsonArray("hobbies").size()).isEqualTo(3);
     assertThat(result.getBoolean("released")).isTrue();
     assertThat(result.getInt("age")).isEqualTo(30);
     assertThat(result.getJsonObject("sourceCode").getString("url")).isEqualTo("github.io/keesite");
     assertThat(result.getJsonArray("complementryData").getJsonObject(1).getString("capter2")).isEqualTo("restService2");
     assertThat(result.isNull("city")).isTrue();

//
// JsonArray result1 = data.loadJsonArray();  
//assertThat(result1.getValueType).isEqualTo(JsonValue.ValueType.ARRAY); 
//
//   
    }
}

   
//   AssertJ, not JUnit. AssertJ is a popular assertion library for Java that provides a fluent API for writing assertions in tests.
//   assertThat(result.getString("name") , is(equalTo("john")));
