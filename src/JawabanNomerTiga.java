
import java.util.Scanner;

public class JawabanNomerTiga {

    public class check {
        static int Kudus = 0;
        static int Jakarta = 0;
        static int Jogja = 0;
        static int Karawang = 0;
        static int Solo = 0;
        static boolean success = false;

        public static void cekNomorPlat(int nomorPlat){
            if (nomorPlat%2==0){
                System.out.println("Plat Tersebut Genap");
            }else {
                System.out.println("Plat Tersebut Ganjil");
            }
        }

        public static void cekPlatNomor(String kodePlat){
            if (kodePlat.contains("K")) {
                success = true;
                Kudus++;
            } else if (kodePlat.contains("B")) {
                success = true;
                Jakarta++;
            } else if (kodePlat.contains("AB")) {
                success = true;
                Jogja++;
            } else if (kodePlat.contains("T")) {
                success = true;
                Karawang++;
            } else if (kodePlat.contains("AD")) {
                success = true;
                Solo++;
            }
            else {
                success = false;
                System.out.println("Kode yang Anda masukkan Tidak Valid");
            }
        }
        static void plat(){
            Scanner inputData = new Scanner(System.in);
            System.out.println("======================");
            System.out.println("Masukkan Plat Nomor: ");
            String plat = inputData.next();int noplat = inputData.nextInt();
            cekPlatNomor(plat);
            cekNomorPlat(noplat);

            if (success){
                printPlat();
            }
        }
        public static void printPlat (){
            System.out.println("Total Plat Kudus = " + Kudus + " | " + " Total Plat Jakarta = " + Jakarta + " | Total Plat Jogja = "
                    + Jogja + " |");
            System.out.println("Total Plat Karawang = " + Karawang + " | Total Plat Solo = " + Solo);
            System.out.println();

        }

    }

    public static void main(String[] args) {
        while (true){
            check.plat();
        }
    }
}