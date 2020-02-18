package com.epamcalculator.operations;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        int number1,number2;
        Scanner scanner=new Scanner(System.in);
        number1=scanner.nextInt();
        number2=scanner.nextInt();
        Add ad=new Add();
        System.out.println("Addition of two numbers:"+ad.add(number1,number2));
        Sub sb=new Sub();
        System.out.println("SUbtraction of two numbers:"+sb.sub(number1,number2));
        Mul ml=new Mul();
        System.out.println("Multiplication of two numbers:"+ml.mul(number1,number2));
        Div dv=new Div();
        System.out.println("Division of two numbers:"+dv.div(number1,number2));
        scanner.close();
    }
}
