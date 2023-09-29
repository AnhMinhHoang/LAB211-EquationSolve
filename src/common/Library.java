/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.List;

/**
 *
 * @author GoldCandy
 */
public class Library {

    protected Validation valid = new Validation();
    protected Algorithm algorithm = new Algorithm();
    protected List<Double> list;

    public void Equation() {
        double a = (valid.inputNumber("Enter A"));
        double b = (valid.inputNumber("Enter B"));
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        StringBuilder perfect = new StringBuilder();
        list = algorithm.calculateEquation(a, b);
        if (list.isEmpty()) {
            System.out.println("Infinitely solutions");
            return;
        }
        if (list.get(0) == null) {
            System.out.println("No solution");
            return;
        }
        System.out.println("Solution: x = " + list.get(0));
        even.append("Number is Even: ");
        odd.append("Number is Odd: ");
        perfect.append("Number is Perfect Square: ");
        for (Double i : list) {
            if (algorithm.isOdd(i)) {
                odd.append(i).append(" ");
            } else {
                even.append(i).append(" ");
            }
            if (algorithm.isPerfectSquare(i)) {
                perfect.append(i).append(" ");
            }
        }
        System.out.println(odd);
        System.out.println(even);
        System.out.println(perfect);
    }

    public void quadraticEquation() {
        double a = (valid.inputNumber("Enter A"));
        double b = (valid.inputNumber("Enter B"));
        double c = (valid.inputNumber("Enter C"));
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        StringBuilder perfect = new StringBuilder();
        list = algorithm.calculateQuadraticEquation(a, b, c);
        if (list.isEmpty()) {
            System.out.println("Infinitely solutions");
            return;
        }
        if (list.get(0) == null) {
            System.out.println("No solution");
            return;
        }
        if (list.size() == 4) {
            System.out.println("Solution: x1 = x2 = " + list.get(0));
        } else {
            System.out.println("Solution: x1 = " + list.get(0)
                    + " x2 = " + list.get(1));
        }
        even.append("Number is Even: ");
        odd.append("Number is Odd: ");
        perfect.append("Number is Perfect Square: ");
        for (Double i : list) {
            if (algorithm.isOdd(i)) {
                odd.append(i).append(" ");
            } else {
                even.append(i).append(" ");
            }
            if (algorithm.isPerfectSquare(i)) {
                perfect.append(i).append(" ");
            }
        }
        System.out.println(odd);
        System.out.println(even);
        System.out.println(perfect);
    }
}
