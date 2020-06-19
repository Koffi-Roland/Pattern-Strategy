/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.strategy;

/**
 *
 * @author HP
 */
public class Context {
    
    private final IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }
    
    public Long executeOperation(Long num1,Long num2){
        return this.strategy.doOperation(num1, num2);
    }
    
    
}
