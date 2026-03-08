package mahasiswa;

import java.util.Scanner;

/**
 * Main.java – Program utama Soal 2.
 * Mendemonstrasikan enkapsulasi, getter/setter, cekKelulusan(),
 * dan updateIpk() berdasarkan input pengguna.
 */
public class Main {

    public static void main(String[] args) {

        // ── Inisialisasi array 5 objek Mahasiswa ──────────────────────────────
        Mahasiswa[] daftar = new Mahasiswa[5];

        daftar[0] = new Mahasiswa("Andi Pratama",   "2440001", "Teknik Informatika", 3.75);
        daftar[1] = new Mahasiswa("Budi Santoso",   "2440002", "Sistem Informasi",   3.40);
        daftar[2] = new Mahasiswa("Citra Lestari",  "2440003", "Teknik Informatika", 3.90);
        daftar[3] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri",    3.00);
        daftar[4] = new Mahasiswa("Bulan Suci",     "2440005", "Akuntansi",          3.20);

        // ── Tampilkan semua data awal mahasiswa ───────────────────────────────
        System.out.println("========================================");
        System.out.println("     === Daftar Seluruh Mahasiswa ===   ");
        System.out.println("========================================");
        for (int i = 0; i < daftar.length; i++) {
            daftar[i].tampilkanInfo();
        }

        // ── Input dari pengguna untuk update IPK ──────────────────────────────
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nMasukkan NIM mahasiswa yang ingin diupdate: ");
        String nimInput = scanner.nextLine().trim();

        // ── Cari mahasiswa berdasarkan NIM ────────────────────────────────────
        Mahasiswa mahasiswaDitemukan = null;
        for (int i = 0; i < daftar.length; i++) {
            // Bandingkan NIM input dengan NIM setiap mahasiswa
            if (daftar[i].getNim().equals(nimInput)) {
                mahasiswaDitemukan = daftar[i];
                break;   // hentikan loop jika sudah ditemukan
            }
        }

        // ── Proses update jika mahasiswa ditemukan ────────────────────────────
        if (mahasiswaDitemukan != null) {
            System.out.print("Masukkan IPK baru: ");
            double ipkBaru = scanner.nextDouble();

            System.out.println();
            // updateIpk() akan memperbarui IPK sekaligus menampilkan info terbaru
            mahasiswaDitemukan.updateIpk(ipkBaru);

        } else {
            // NIM tidak ditemukan dalam array
            System.out.println("Mahasiswa dengan NIM " + nimInput + " tidak ditemukan.");
        }

        scanner.close();
    }
}