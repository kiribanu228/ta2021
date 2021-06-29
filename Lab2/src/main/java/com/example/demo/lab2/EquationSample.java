/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.lab2;

import org.springframework.stereotype.Component;

/**
 *
 * @author alaha
 */
@Component
public class EquationSample {  

    public float solve(float x, float d, float a,float b, float c){
        if(a*x*x+b*x+c == 0){return Integer.MAX_VALUE;}
        return d/a*x*x+b*x+c;        
    }
    
}
