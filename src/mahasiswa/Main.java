package mahasiswa;

public class Main {

    public static void main(String[] args) {

        // ── Deklarasi array untuk menampung 5 objek Mahasiswa ─────────────────
        Mahasiswa[] daftar = new Mahasiswa[5];

        // ── Inisialisasi setiap objek Mahasiswa dengan constructor ────────────
        daftar[0] = new Mahasiswa("Andi Pratama",   "2440001", "Teknik Informatika", 3.75);
        daftar[1] = new Mahasiswa("Budi Santoso",   "2440002", "Sistem Informasi",   3.40);
        daftar[2] = new Mahasiswa("Citra Lestari",  "2440003", "Teknik Informatika", 3.90);
        daftar[3] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri",    3.00);
        daftar[4] = new Mahasiswa("Bulan Suci",     "2440005", "Akuntansi",          3.20);

        // ── Tampilkan header ──────────────────────────────────────────────────
        System.out.println("========================================");
        System.out.println("         === Data Mahasiswa ===         ");
        System.out.println("========================================");

        // ── Loop untuk menampilkan info setiap mahasiswa ──────────────────────
        for (int i = 0; i < daftar.length; i++) {
            daftar[i].tampilkanInfo();   // memanggil method tampilkanInfo()
        }
    }
}