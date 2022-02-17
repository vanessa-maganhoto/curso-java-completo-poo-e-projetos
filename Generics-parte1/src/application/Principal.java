package application;

import services.PrintService;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("Quantos valores? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();
        System.out.println("Primeiro valor inserido é: " + x);


    }
}
