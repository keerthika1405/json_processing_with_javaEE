/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.rest.json_p;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ELCOT
 */
public class jsondata7Test {
    
//    public jsondata7Test() {
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
    public void testSomeMethod() {
        
            String jsonData = "{"
                + "\"name\": \"John\""
                + ",\"sourceCode\": {\"repository\": \"json Processing JavaEE\"},{\"url\": \"github.io/keesite\"}"
                + ", \"age\": 80"
                + ", \"city\": null" 
                + ", \"length\": \"130\""
                + ", \"hobbies\": [\"reading\", \"hiking\", \"painting\"]"
                + ", \"released\": true "
                + ", \"complementryData\": [ {\"capter1\": \"restService1\"}, {\"capter2\": \"restService2\"}, {\"chapter3\": \"restService3\"} ]" 
                +"}";

        
        jsondata7 data=new jsondata7();
        
        String result=data.writejsonStreamtoString();
        
        assertThat(result).isEqualTo(jsonData);
        
    }
    
}
