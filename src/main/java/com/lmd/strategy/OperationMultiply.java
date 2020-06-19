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
public class OperationMultiply implements IStrategy {

    @Override
    public Long doOperation(Long num1, Long num2) {
        
        return num1*num2;
    }
    
}
