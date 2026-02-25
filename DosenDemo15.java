import java.util.Scanner;

public class DosenDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Data Dosen : ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());
        System.out.println("==========================================");

        Dosen15[] arrayOfDosen15 = new Dosen15[jumlahDosen];

        String  kode, nama, dummy;
        Boolean jenisKelamin;
        int     usia;

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode                : ");
            kode = sc.nextLine();

            System.out.print("Nama                : ");
            nama = sc.nextLine();

            System.out.print("Jenis Kelamin (L/P) : ");
            dummy        = sc.nextLine();
            jenisKelamin = dummy.equalsIgnoreCase("L");

            System.out.print("Usia                : ");
            usia = Integer.parseInt(sc.nextLine());

            System.out.println("------------------------------------------");

            arrayOfDosen15[i] = new Dosen15(kode, nama, jenisKelamin, usia);
        }

        // BUAT OBJECT DataDosen15 
        DataDosen15 dataDosen15 = new DataDosen15();


        dataDosen15.dataSemuaDosen(arrayOfDosen15);

        dataDosen15.jumlahDosenPerJenisKelamin(arrayOfDosen15);

        dataDosen15.rerataUsiaDosenPerJenisKelamin(arrayOfDosen15);

        dataDosen15.infoDosenPalingTua(arrayOfDosen15);

        dataDosen15.infoDosenPalingMuda(arrayOfDosen15);

        sc.close();
    }
}