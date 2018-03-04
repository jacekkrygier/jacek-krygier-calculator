package com.kodilla;

public class Calculator {

    public void addAToB(int a, int b) {
        System.out.println("Wynik dodawania liczby " + a + " i liczby " + b + " wynosi: " + (a + b));
    }

    public void substractAFromB(int a, int b) {
        System.out.println("Wynik odejmowania liczby " + b + " od liczby " + a + " wynosi: " + (a - b));
    }
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.addAToB(8, 7);

        calculator.substractAFromB(8, 7);
        System.out.println("Koniec programu");
    }

}
