package fr.dampierre;

import java.lang.Math;


public class App {
    
    public static void main(String[] args) {
        int nb = 0;
        int power = 2;
        for(;nb<=10;nb++){
            double result = CalculatePower(nb, power);
            System.out.println(nb + "^" + power + "=" + result);
        }


    }

    private static double CalculatePower(int nb, int power) {
        return Math.pow(nb, power);
    }
    
}
