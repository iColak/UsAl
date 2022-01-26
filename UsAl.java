package donguler;

import java.util.Scanner;

public class UsAl {
    public static void main(String[] args) {
        int sayi,us, sonuc=1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        sayi = scanner.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        us = scanner.nextInt();
        for(int i = 1; i<=us; i++){
            sonuc *= sayi;
        }
        System.out.println(sayi + " uzeri " + us + " = " + sonuc);
    }
}
