package bukutamu;

import java.util.Scanner;

public class latihanBTamu {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        BukuTamu a[] = new BukuTamu [3];
        for (int i =0; i < a.length; i++){
        System.out.print("Nama          : ");
        String nama = in.nextLine();
        System.out.print("Alamat        : ");
        String alamat = in.nextLine();
        System.out.print("No. Handphone : ");
        String no = in.nextLine();
        System.out.println("*************************");
        a[i] = new BukuTamu(nama);
        a[i].setAlamat(alamat);
        a[i].setnoHp(no);
            System.out.println("Tamu ke "+(i+1));
            a[i].display();
            System.out.println();
        }
        System.out.println("Jumlah Tamu : "+BukuTamu.getID());
    }  
}
