/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shapeareacalculator;

/**
 *
 * @author mdewlok
 */

//import joptionpane so i can get GUI input
import javax.swing.JOptionPane;

public class ShapeAreaCalculator {
    
    // Method to calculate square area that takes in a parameter called side
    public static void calculateSquare(double side) {
        double area = side * side;
        JOptionPane.showMessageDialog(null, "Area of the Square: " + area);
    }

    // Method to calculate rectangle area that takes in two parameters - length and width
    public static void calculateRectangle(double length, double width) {
        double area = length * width;
        JOptionPane.showMessageDialog(null, "Area of the Rectangle: " + area);
    }

    // Method to calculate circle area which takes in a parameter called radius
    public static void calculateCircle(double radius) {
        double area = Math.PI * radius * radius; // pi is recognised by java and built in
        JOptionPane.showMessageDialog(null, "Area of the Circle: " + area);
    }

    
    
    //main project file
    public static void main(String[] args) {
        
         // Rectangle input and store in variables
        String lengthInput = JOptionPane.showInputDialog("Enter the rectangle length:");
        String widthInput = JOptionPane.showInputDialog("Enter the rectangle width:");

        // convert this input above from string into double variables using parseDouble
        double length = Double.parseDouble(lengthInput);
        double width = Double.parseDouble(widthInput);

        // call the method to calculate the rectangle's area
        calculateRectangle(length, width);

        // Square input and store in variables
        String sideInput = JOptionPane.showInputDialog("Enter the side of the square:");
        double side = Double.parseDouble(sideInput);

        // call the method to calculate the square's area
        calculateSquare(side);

        // Circle input and store in variables
        String radiusInput = JOptionPane.showInputDialog("Enter the radius of the circle:");
        double radius = Double.parseDouble(radiusInput);

        // call the method to calculate the circle's area
        calculateCircle(radius);
      
    }
}
