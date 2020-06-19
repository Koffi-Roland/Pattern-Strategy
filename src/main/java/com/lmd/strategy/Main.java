/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.strategy;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("================================");

        System.out.println("'   Menu du programme Design Pattern Strategy   '");

        System.out.println("================================");

        System.out.println(" 1- Option Strategy Add");

        System.out.println(" 2- Option Strategy Substract");

        System.out.println(" 3- Option Strategy Multi");
        
        System.out.println(" 4- Option strategy");


        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        
        switch (option) {

            case 1:
                Context context = new Context(new OperationAdd());
                System.out.println("50 + 5 = " + context.executeOperation(Long.valueOf(50), Long.valueOf(5)));
                break;
            case 2:

                context = new Context(new OperationSubstract());
                System.out.println("50 - 5 = " + context.executeOperation(Long.valueOf(50), Long.valueOf(5)));
                break;
            case 3:

                context = new Context(new OperationMultiply());
                System.out.println("50 * 5 = " + context.executeOperation(Long.valueOf(50), Long.valueOf(5)));
                break;
            case 4:
              
                context = new Context(new OperationSubstract());
                System.out.println("50 - 5 = " + context.executeOperation(Long.valueOf(50), Long.valueOf(5)));
               
                context = new Context(new OperationMultiply());
                System.out.println("50 * 5 = " + context.executeOperation(Long.valueOf(50), Long.valueOf(5)));
                 context = new Context(new OperationAdd());
                System.out.println("50 + 5 = " + context.executeOperation(Long.valueOf(50), Long.valueOf(5)));
              
                break;
        }

    }
}
