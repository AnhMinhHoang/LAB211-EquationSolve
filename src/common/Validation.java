/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author GoldCandy
 */
public class Validation {

    public double inputNumber(String title) {
        double a;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(title + ": ");
                a = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.err.println("Please input number cyka blyat");
            }
        }
        return a;
    }
}
