/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import java.util.List;
import repo.IMath;

/**
 *
 * @author GoldCandy
 */
public class Algorithm implements IMath {

    public boolean isOdd(double number) {
        return number % 2 != 0;
    }

    public boolean isPerfectSquare(double number) {
        return (int) Math.sqrt(number) * (int) Math.sqrt(number) == number;
    }

    @Override
    public List<Double> calculateEquation(double a, double b) {
        List<Double> list = new ArrayList();
        if (a == 0) {
            if (b == 0) {
                return list;
            } else {
                list.add(null);
                return list;
            }
        }
        list.add(-b / a); //list[solution, a, b]
        list.add(a);
        list.add(b);
        return list;
    }

    @Override
    public List<Double> calculateQuadraticEquation(double a, double b, double c) {
        List<Double> list = new ArrayList<>();
        if (a == 0 && b == 0 && c == 0) {
            return list;
        }
        //list[solution, a, b, c]
        //special case
        if (a + b + c == 0) {
            list.add(1d);
            list.add(c / a);
            list.add(a);
            list.add(b);
            list.add(c);
            return list;
        }
        if (a - b + c == 0) {
            list.add(-1d);
            list.add(-c / a);
            list.add(a);
            list.add(b);
            list.add(c);
            return list;
        }
        //normal case
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta < 0) {
            list.add(null);
            return list;
        } else if (delta == 0) {
            list.add(-b / (2 * a));
            list.add(a);
            list.add(b);
            list.add(c);
            return list;
        } else {
            list.add((-b + Math.sqrt(delta)) / (2 * a));
            list.add((-b - Math.sqrt(delta)) / (2 * a));
            list.add(a);
            list.add(b);
            list.add(c);
            return list;
        }
    }

}
