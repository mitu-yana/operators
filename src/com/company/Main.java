package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи число х");
        float numx = in.nextFloat();
        System.out.println("Введи число y");
        float numy = in.nextFloat();
        System.out.println("Введи число z");
        float numz = in.nextFloat();
        float srar = (numx+numy+numz)/3;
        System.out.println(srar);
        int half = (int) (srar/2);
        System.out.println(half);
        if (half > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
