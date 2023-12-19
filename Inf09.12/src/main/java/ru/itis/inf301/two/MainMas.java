package ru.itis.inf301.two;

import java.util.Scanner;


public class MainMas {
    public static void main(String[] args) throws LessThenNumbersException, NegativeNumbersException {
        int[] mas = new int[]{4,8,5,56,2,55,987,2,4,7,45,67,243,90,7334};
        System.out.println("Массив чисел: ");
        for (int x: mas){
            System.out.print(x+ " ");
        }
        double x = input(mas);
        int solve = program(mas,x);
        if (solve > 0) System.out.println("Ближайшее в массиве, меньшее этого числа == " + solve);
    }
    private static int min(int[] mas){
        int min = mas[0];
        for (int i = 1; i < mas.length; ++i){
            if (mas[i] < min) min = mas[i];
        }
        return min;
    }
    private static double input(int[] mas) throws NumberFormatException,NegativeNumbersException,LessThenNumbersException{
        System.out.print("\nВведите число: ");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine().replace(",",".");
        double x = 0;
        try{
            x = Double.parseDouble(a);
            if (x<0) throw new NegativeNumbersException();
            else if (x <= min(mas)) throw new LessThenNumbersException();
        }
        catch(NumberFormatException e){
            System.out.println("Это должно быть число, а не набор символов");
        }
        catch(NegativeNumbersException e){
            System.out.println("Число должно быть положительным");
        }
        catch(LessThenNumbersException e){
            System.out.println("Число должно быть больше самого маленького числа в массиве");
        }
        return x;
    }
    private static int program(int[] mas,double x){
        int max = -1;
        for (int i = 0; i < mas.length; ++i){
            if ((mas[i] < x) && (mas[i]>max))  max = mas[i];
        }
        return max;
    }
}
