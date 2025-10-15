import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        perusahaan perusahaan = new perusahaan("PT anti galau ");

        System.out.print("Masukkan jumlah karyawan: ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Karyawan ke-" + i);
            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("Jabatan (Manager/Staf/Magang): ");
            String jabatan = input.nextLine();

            System.out.print("Jam kerja: ");
            int jamKerja = input.nextInt();
            input.nextLine();

            karyawan k = new karyawan (nama, jabatan, jamKerja);
            perusahaan.tambahKaryawan(k);
        }
    
        perusahaan.tampilkanDaftarGaji();
        System.out.println("Total Gaji Bersih Semua Karyawan: Rp " + perusahaan.totalSemuaGaji());
        input.nextInt();

        input.close();
    }
}
