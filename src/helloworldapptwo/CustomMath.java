/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworldapptwo;

/**
 *
 * @author yank
 */
public class CustomMath {
    public static int sum(int x, int y) {
        return x + y;
    }
    public static int division(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return x / y;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
