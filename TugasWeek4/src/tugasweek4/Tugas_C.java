package tugasweek4;

import java.util.Scanner;

public class Tugas_C {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("masukan panjang nilai : ");
        int panjang = s.nextInt();
        int[] angka = new int[panjang];

        for (int n = 0; n < angka.length; n++) {
            System.out.print("masukan angka ke-" + (n + 1) + " : ");
            angka[n] = s.nextInt();
        }

        int max = angka[0];
        int min = angka[0];

        for (int n = 0; n < angka.length; n++) {
            if (max < angka[n]) {
                max = angka[n];
            }
            if (min > angka[n]) {
                min = angka[n];
            }
        }

        int avg = 0;
        int sum = 0;
        for (int n : angka) {
            sum += n;
        }

        avg = sum / angka.length;

        System.out.println("nilai minimum : " + min);
        System.out.println("nilai maximum : " + max);
        System.out.println("nilai rata - rata : " + avg);
    }

}
