/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TemparatureCOnverter {
    static Scanner user_input=new Scanner(System.in);
    public static boolean exitProgram=true;
    public static void main(String[] args) {
        double input,result;
        
        System.out.println("Temperature Conversion");
        System.out.println(".....................\n");
        while(exitProgram){
            System.out.println("Enter your choice:\n1.Celsius to Fahernheit\n2.Celsius to Kelvin\n3.Farenheit to Celsisus\n4.Farenheit to Kelvin\n5.Kelvin to Celsius\n6.Kelvin to Farenheit\n7.Exit");
            String c=user_input.next();
            switch(c){
                case "1":
                    System.out.println("Enter number:");
                    input=user_input.nextDouble();
                    result=((9.0/5.0)*input)+32;
                    System.out.println(input+"Celsius"+"="+result+"Fahrenheit\n");
                    break;
                case "2":
                    System.out.println("Enter number:");
                    input=user_input.nextDouble();
                    result=input+273.15;
                    System.out.println(input+"Celsius"+"="+result+"Kelvin\n");
                    break;
                case "3":
                    System.out.println("Enter number:");
                    input=user_input.nextDouble();
                    result=(input-32)*5/9;
                    System.out.println(input+"Fahrenheit"+"="+result+"Celsius\n");
                    break;
                case "4":
                    System.out.println("Enter number:");
                    input=user_input.nextDouble();
                    result=((5.0/9.0)*(input-32))+273.15;
                    System.out.println(input+"Fahrenheit"+"="+result+"Kelvin\n");
                    break;
                case "5":
                    System.out.println("Enter number:");
                    input=user_input.nextDouble();
                    result=input-273.15;
                    System.out.println(input+"Kelvin"+"="+result+"Celsius\n");
                    break;
                case "6":
                    System.out.println("Enter number:");
                    input=user_input.nextDouble();
                    result=((input-273.15)*(9.0/5.0))+32;
                    System.out.println(input+"Kelvin"+"="+result+"Fahrenheit\n");
                    break;
                case "7":
                    exitProgram=false;
                    System.out.println("program is terminater\n");
                    break;
                default:
                    System.out.println("Please provide Proper Input\n");
                    break;
            }
        }
        
    }
}
