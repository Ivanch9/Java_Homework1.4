package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); // Ves podarka
    int b = sc.nextInt(); // Ves apelsinov
    int c = sc.nextInt(); // Ves yablok
    int d = sc.nextInt(); // Ves grush
    int bb = a / b; // Max apelsinov
    int cc = a / c; // Max yabloka
    int dd = a / d; // Max grush
    int g = 0;
    for (int i = 0; i <= bb; i++) {
        for (int j = 0; j <= cc; j++) {
            for (int k = 0; k <= dd; k++) {
                if (b * i + c * j + d * k == a) {
                 //System.out.println("apelsin " + i + " yabloki " + j +" grushi " + k );
                g++;
                }
            }
        }
    }
    System.out.println(g);
    //System.out.println(a);
    //System.out.println(b);
    //System.out.println(c);
    //System.out.println(d);
    }
}
