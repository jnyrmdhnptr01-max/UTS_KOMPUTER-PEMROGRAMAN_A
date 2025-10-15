public class karyawan {
    String nama;
    String jabatan;
    int jamKerja;

    public karyawan(String nama, String jabatan, int jamKerja) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.jamKerja = jamKerja;
    }

    public double hitungGajiPokok() {
        double gajiPerJam = 0;
        if (jabatan.equalsIgnoreCase("Manager")) {
            gajiPerJam = 20000;
        } else if (jabatan.equalsIgnoreCase("Staf")) {
            gajiPerJam = 15000;
        } else if (jabatan.equalsIgnoreCase("Magang")) {
            gajiPerJam = 10000;
        }
        return gajiPerJam * jamKerja;
    }

    public double hitungTunjangan() {
        double gajiPokok = hitungGajiPokok();
        if (jamKerja > 160) {
            return 0.4 * gajiPokok;
        } else {
            return 0;
        }
    }

    public double getTotalGaji() {
        return hitungGajiPokok() + hitungTunjangan();
    }
}
