package tugasweek4;


import java.util.Scanner;
import java.util.Arrays;


public class Tugas_A {

    private static String n;

    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int panjang = 0;
     System.out.print("masukkan panjang nilai : ");
     panjang = s.nextInt();
     int [] angka = new int[panjang];
     
     for (int n = 0; n < panjang; n++)
     {
         System.out.print("masukkan nilai ke-" + n + ":");
         angka[n] = s.nextInt();
     }
     
     System.out.print("[");
     for ( int n : angka);
     {
         System.out.print(n + " ");
     }
          System.out.print("]");    

    
        Arrays.sort(angka);
        System.out.println("Urutan nilai dari yang terkecil - terbesar");
        System.out.println("_______________________________________");
        System.out.println("[");
        for (int n : angka);
    {
            System.out.println(n + " ");
     }
        System.out.print("]");
     }

}
