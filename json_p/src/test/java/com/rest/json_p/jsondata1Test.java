/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.rest.json_p;

import static org.assertj.core.api.Assertions.assertThat;

import javax.json.JsonObject;
import javax.json.JsonValue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ELCOT
 */
public class jsondata1Test {
    
//    public jsondata1Test() {
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
    public void testLoadJsonString() throws Exception {
        
        jsondata1 data = new jsondata1();
        JsonObject result=data.loadJsonString();
        
        assertThat(result.getValueType()).isEqualTo(JsonValue.ValueType.OBJECT);
    }
    
}
