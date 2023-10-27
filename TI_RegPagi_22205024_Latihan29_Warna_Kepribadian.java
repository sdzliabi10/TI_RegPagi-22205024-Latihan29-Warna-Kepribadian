/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugaspert6;
import java.util.Scanner;

/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi : Teknik Informatika
 * Deskripsi Program : Program ini untuk melihat kepribadian seseorang sesuai dengan warna
 */
public class TI_RegPagi_22205024_Latihan29_Warna_Kepribadian {
    
    public static String penutup = "\u001b[0m";
        public static String foregroundMerah = "\u001b[31m";
        public static String foregroundHijau = "\u001b[32m";
        public static String foregroundKuning = "\u001b[33m";
        public static String foregroundBiru = "\u001b[34m";
        public static String foregroundUngu = "\u001b[35m";
        public static String foregroundCyan = "\u001b[36m";
        
        public static String backgroundMerah = "\u001b[41m";
        public static String backgroundHijau = "\u001b[42m";  
        public static String backgroundKuning = "\u001b[43m";
        public static String backgroundBiru = "\u001b[44m";
        public static String backgroundUngu = "\u001b[45m";    
        
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(foregroundMerah+"YUK "+penutup);
        System.out.print(foregroundHijau+"CEK "+penutup);
        System.out.print(foregroundKuning+"KEPRIBADIANMU "+penutup);
        System.out.print(foregroundCyan+"DARI "+penutup);
        System.out.print(foregroundUngu+"WARNA "+penutup);
        System.out.print(foregroundBiru+"FAVORITMU \n"+penutup);
        
        System.out.println("\n"+backgroundMerah+"\tMERAH   \t"+penutup);
        System.out.println(backgroundHijau+"\tHIJAU    \t"+penutup);
        System.out.println(backgroundKuning+"\tKUNING  \t"+penutup);
        System.out.println(backgroundBiru+"\tBIRU     \t"+penutup);
        System.out.println(backgroundUngu+"\tUNGU     \t"+penutup+"\n");
        
        //input warna dan nama kamu
        System.out.print("PILIH WARNA FAVORITMU : ");
        String warna = scanner.next();
        System.out.print("NAMA KAMU : ");
        String nama = scanner.next();
        
        //hasil test kepribadian
        System.out.println("\n====HASIL TEST KEPRIBADIAN " + nama +"====");
        System.out.print("Warna favoritmu adalah ");
        
        switch (warna) {
            case "merah":
                System.out.println(foregroundMerah+"merah"+penutup);
                System.out.println("""
                                   1. Periang,
                                   2. Pemberani,
                                   3. Berani menyukai risiko dalam setiap langkah,
                                   4. Menyukai tantangan,
                                   5. Kurang sabar,
                                   6. Dapat menahan marah namunn jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,
                                   7. Memiliki energi kehangatan dan cinta.""");
                break;
            case "hijau":
                System.out.println(foregroundHijau+"hijau"+penutup);
                System.out.println("""
                                   1. Romantis,
                                   2. Menyukai hal yang berbau alami dan keindahan,
                                   3. Teguh pada prinsip,
                                   4. Mudah cemburu,
                                   5. Mudah merasa iri,
                                   6. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.""");
                break;
            case "kuning":
                System.out.println(foregroundKuning+"kuning"+penutup);
                System.out.println("""
                                   1. Optimis,
                                   2. Suka bergaul,
                                   3. Periang,
                                   4. Senang menolong,
                                   5. Lincah dan aktif,
                                   6. Tidak suka meremehkan kekurangan orang lain,
                                   7. Loyal,
                                   8. Hangat,
                                   9. Meskipun cenderung optimis dan idealis, seringkali goyah dan tidak stabil,
                                   10.Cenderung penakut.""");
                break;
            case "biru":
                System.out.println(foregroundBiru+"biru"+penutup);
                System.out.println("""
                                   1. menyenangkan,
                                   2. Bijaksana,
                                   3. Pembawaan diri tenang saat menghadapi masalah,
                                   4. Dinamis,
                                   5. Senang berbagi,
                                   6. Bersahabat,
                                   7. Tidak terlalu suka menjadi sorotan banyak orang,
                                   8. Menyembunyikan perasaan karena karakternya yang cenderung mencari damai.""");
                break;
            case "ungu":
                System.out.println(foregroundUngu+"ungu"+penutup);
                System.out.println("""
                                   1. Optimis,
                                   2. Tidak pernah ragu,
                                   3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,
                                   4. Memiliki ambisi yang besar,
                                   5. Memiliki empati yang besar,
                                   6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,
                                   7.Terkadang bersikap keras kepala dan angkuh""");
                break;
            default:

                System.out.println("Warna yang Anda masukkan tidak valid.");
                break;
        } 
    }
}
