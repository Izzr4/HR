import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
      Scanner ipt = new Scanner(System.in);
        String nama = ipt.nextLine();
        int angka = ipt.nextInt();
        int porsi = ipt.nextInt();
        String k1 = "NAMA PESANAN";
        String k2 = "JUMLAH";
        String k3 = "HARGA";
        String p1 = "NASI";
        String p2 = "SEMUR";
        String p3 = "JENGKOL";
        if (angka % 2 == 0 && angka%3 != 0 && angka%7 != 0)
        {
            int total = (4000 * porsi);
            System.out.println("PROGRAM KASIR NASISEMURJENGKOL");
            System.out.println("Nama Pelanggan : "+nama+"\n");
            System.out.printf("|%-20s|%-15s|%20s|\n",k1,k2,k3);
            System.out.printf("|%-20s|%-15d|%20d|\n",p1,porsi,(total));
            convert(total);
        }else if(angka % 2 != 0 && angka%3 == 0 && angka%7 != 0)
        {
            int total = (10000 * porsi);
            System.out.println("PROGRAM KASIR NASISEMURJENGKOL");
            System.out.println("Nama Pelanggan : "+nama+"\n");
            System.out.printf("|%-20s|%-15s|%20s|\n",k1,k2,k3);
            System.out.printf("|%-20s|%-15d|%20d|\n",p2,porsi,(total));
            convert(total);
        }else if (angka % 2 != 0 && angka%3 != 0 && angka%7 == 0)
        {
            int total = (12000 * porsi);
            System.out.println("PROGRAM KASIR NASISEMURJENGKOL");
            System.out.println("Nama Pelanggan : "+nama+"\n");
            System.out.printf("|%-20s|%-15s|%20s|\n",k1,k2,k3);
            System.out.printf("|%-20s|%-15d|%20d|\n",p3,porsi,(12000*porsi));
            convert(total);
        }else if (angka % 2 == 0 && angka%3 == 0 && angka%7 == 0)
        {
            System.out.println("PROGRAM KASIR NASISEMURJENGKOL");
            System.out.println("Nama Pelanggan : "+nama+"\n");
            System.out.printf("|%-20s|%-15s|%20s|\n",k1,k2,k3);
            System.out.printf("|%-20s|%-15d|%20d|\n",p1,porsi,(4000*porsi));
            System.out.printf("|%-20s|%-15d|%20d|\n",p2,porsi,(10000*porsi));
            System.out.printf("|%-20s|%-15d|%20d|\n",p3,porsi,(12000*porsi));
            int jum = (4000*porsi)+(10000*porsi)+(12000*porsi);
            convert(jum);
        }else
        {
            System.out.println("TIDAK JADI PESAN NIH");
        }
    }
     private static void convert(int total) {
        String hg = Integer.toString(total);
        if (hg.length() <= 4)
        {
            System.out.println("\nTOTAL PESANAN KAMU : Rp "+ hg.charAt(0)+"."+hg.substring(1,4));
        }else
        {
            System.out.println("\nTOTAL PESANAN KAMU : Rp "+ hg.substring(0,2)+"."+hg.substring(2,5));
        }
    }
}
