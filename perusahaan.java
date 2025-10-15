import java.util.ArrayList;
import java.util.List;
public class perusahaan{
    String namaPerusahaan;
    List<karyawan> daftarKaryawan = new ArrayList<>();
    public perusahaan(String namaperusahaan) {
        this.namaPerusahaan = namaperusahaan;
    }
    public void tambahKaryawan(karyawan k) {
        daftarKaryawan.add(k);
    }
    public void tampilkanDaftarGaji() {
        System.out.println("\n=== Daftar Gaji Karyawan di " + namaPerusahaan + " ===");
        double totalSemuaGaji = 0;
        for (karyawan k : daftarKaryawan) {
            double total = k.getTotalGaji();
            System.out.println("Nama: " + k.nama +
                               " | Jabatan: " + k.jabatan +
                               " | Total Gaji: Rp " + total);
            totalSemuaGaji += total;
        }
        System.out.println("---");
        System.out.println("Total Gaji Bersih Semua Karyawan: Rp " + totalSemuaGaji);
        }
        public double totalSemuaGaji() {
           double total = 0;
         for (karyawan k : daftarKaryawan){
               total += k.getTotalGaji();
            }
               return total;
        }

    }


