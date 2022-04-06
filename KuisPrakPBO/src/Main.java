import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("FORM PENDAFTARAN PT.UDIN");
        System.out.println("1. Android Development\n2. Web Development");
        System.out.print("Pilih Jenis Form : ");
        int pilih = input.nextInt();
        
        System.out.println("FORM PENDAFTARAN");
        Scanner data= new Scanner(System.in);
        System.out.print("Input NIK  : ");
        String NIK = data.next();
        System.out.print("Input Nama : ");
        String Nama = data.next();

        System.out.print("Input Nilai Tes Tulis : ");
        int Tulis = data.nextInt();
        System.out.print("Input Nilai Tes Coding : ");
        int Coding = data.nextInt();
        System.out.print("Input Nilai Tes Wawancara : ");
        int Wawancara = data.nextInt();

        switch (pilih) {
            case 1 -> {
                Android android = new Android(NIK,Nama,Tulis,Coding,Wawancara);
                OUTER:
                        
                do {
                    System.out.println("Menu");
                    System.out.println("1. Edit\n2. Tampil\n3. Exit");
                    System.out.print("Pilih : ");
                    int pilihMenu = input.nextInt();
                    switch (pilihMenu) {
                        case 1 -> {
                            System.out.print("Input Nilai Tes Tulis : ");
                            android.TesTulis(input.nextInt());
                            System.out.print("Input Nilai Tes Coding : ");
                            android.TesCoding(input.nextInt());
                            System.out.print("Input Nilai Tes Wawancara : ");
                            android.TesWawancara(input.nextInt());
                        }
                        case 2 -> {
                            System.out.println("Nilai Akhir : " + android.hitung());
                            System.out.println("KETERANGAN  : " + android.hasil());
                        }
                        default -> {
                                break OUTER;
                                }
                    }
                } while (true);
            }
            case 2 -> {
                Web web = new Web(NIK,Nama,Tulis,Coding,Wawancara);
            OUTER_1:
            do {
                System.out.println("Menu");
                System.out.println("1. Edit\n2. Tampil\n3. Exit");
                System.out.print("Pilih : ");
                int pilihMenu = input.nextInt();
                switch (pilihMenu) {
                    case 1 -> {
                        System.out.print("Input Nilai Tes Tulis : ");
                        web.TesTulis(input.nextInt());
                        System.out.print("Input Nilai Tes Coding : ");
                        web.TesCoding(input.nextInt());
                        System.out.print("Input Nilai Tes Wawancara : ");
                        web.TesWawancara(input.nextInt());
                        }
                    case 2 -> {
                        System.out.println("Nilai Akhir : " + web.hitung());
                        System.out.println("KETERANGAN  : " + web.hasil());
                        }
                    default -> {
                            break OUTER_1;
                        }
                }
            } while (true);
            }
            default -> {
                    System.out.println("Input yang dimasukkan salah. Mohon Input Ulang");
            }
        }
    }

}