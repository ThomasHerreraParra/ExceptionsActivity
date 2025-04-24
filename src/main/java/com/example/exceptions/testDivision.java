package com.example.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class testDivision {
        public static void main(String[] args) {
            int a = 10;
            int b = 0;
            //System.out.println("Resultado: " + (a / b));
            /*Pregunta 1
            ¿Qué tipo de excepción se lanza?
            Una ArithmeticException
            ¿Qué mensaje muestra la consola?
            Exception in thread "main" java.lang.ArithmeticException: / by zero
                   at com.example.exceptions/com.example.exceptions.testDivision.main(testDivision.java:7)*/

            //Pregunta 2
            a = 10;
            b = 0;
            try{
                System.out.println("Resultado: " + (a / b));
            }catch(ArithmeticException e){
                System.out.println("The error is: " + e);
            }

            //Pregunta 3
            Scanner sc = new Scanner(System.in);
            int c = 0, d = 0;
            try {
                System.out.print("Ingresa el primer número: ");
                a = sc.nextInt();
                System.out.print("Ingresa el segundo número: ");
                b = sc.nextInt();
                double resultado = a / b;
                System.out.println("Resultado: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e);
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e);
            }

            //Pregunta 4
            Scanner scanner = new Scanner(System.in);
            int g = 0, f = 0;

            try {
                System.out.print("Ingresa el primer número: ");
                g = scanner.nextInt();

                System.out.print("Ingresa el segundo número: ");
                f = scanner.nextInt();

                int resultado = g / f;
                System.out.println("Resultado: " + resultado);

            } catch (ArithmeticException e) {
                System.out.println("Error:" + e);
            } catch (InputMismatchException e) {
                System.out.println("Error:" + e);
            } finally {
                System.out.println("Fin...");
                scanner.close();
            }
        }

}
