/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Library;
import model.Numbers;
import view.Menu;

/**
 *
 * @author GoldCandy
 */
public class MathController extends Menu {

    protected static String[] mc = {"Calculate Superlative Equation",
        "Calculate Quadratic Equation",
        "Exit"};
    protected Library lib;
    protected Numbers numbers;

    public MathController() {
        super("Equation Program", mc);
        lib = new Library();
        numbers = new Numbers();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1: {
                System.out.println("----- Calculate Equation -----");
                lib.Equation();
                break;
            }
            case 2: {
                System.out.println("----- Calculate Quadratic Equation -----");
                lib.quadraticEquation();
                break;
            }
            case 3: {
                System.out.println("EXIT...");
                System.exit(0);
            }
            default: {
                System.out.println("No such choice!");
            }
        }
    }
}
