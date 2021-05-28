package com.example.demo;

import com.example.demo.lab2.EquationSample;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alaha
 */
@SpringBootTest
public class Lab2Test {

    @Autowired
        EquationSample equationSample;
    
    @Test
    void test1() {
        assertEquals(3,equationSample.solve(1, 1, 1, 1, 1));
        assertEquals(6,equationSample.solve(2, 2, 2, 2, 2));
    }

    

 
}
