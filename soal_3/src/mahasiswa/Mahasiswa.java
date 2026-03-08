package mahasiswa;

/**
 * Kelas Mahasiswa merepresentasikan data seorang mahasiswa.
 * Menerapkan enkapsulasi penuh: semua atribut private,
 * akses dan perubahan data dilakukan melalui method public.
 */
public class Mahasiswa {

    // ── Atribut private (enkapsulasi) ─────────────────────────────────────────
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;   // private: hanya bisa diakses lewat getter/setter

    // ── Constructor ───────────────────────────────────────────────────────────

    /**
     * Menginisialisasi objek Mahasiswa dengan data lengkap.
     *
     * @param nama    nama lengkap mahasiswa
     * @param nim     nomor induk mahasiswa
     * @param jurusan program studi / jurusan
     * @param ipk     Indeks Prestasi Kumulatif (0.00 – 4.00)
     */
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama    = nama;
        this.nim     = nim;
        this.jurusan = jurusan;
        this.ipk     = ipk;
    }

    // ── Getter methods ────────────────────────────────────────────────────────

    /** Mengembalikan nama mahasiswa. */
    public String getNama()    { return nama; }

    /** Mengembalikan NIM mahasiswa. */
    public String getNim()     { return nim; }

    /** Mengembalikan jurusan mahasiswa. */
    public String getJurusan() { return jurusan; }

    /** Mengembalikan nilai IPK mahasiswa. */
    public double getIpk()     { return ipk; }

    // ── Setter method ─────────────────────────────────────────────────────────

    /**
     * Memperbarui nilai IPK mahasiswa.
     * Validasi: IPK harus berada dalam rentang 0.00 – 4.00.
     *
     * @param ipkBaru Nilai IPK baru yang akan disimpan
     */
    public void setIpk(double ipkBaru) {
        // Validasi nilai IPK sebelum disimpan
        if (ipkBaru >= 0.00 && ipkBaru <= 4.00) {
            this.ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid! Nilai harus antara 0.00 – 4.00.");
        }
    }

    // ── Method cekKelulusan ───────────────────────────────────────────────────

    /**
     * Mengecek dan mengembalikan status kelulusan berdasarkan IPK.
     * IPK >= 3.00 → "Lulus"
     * IPK <  3.00 → "Belum Lulus"
     *
     * @return String status kelulusan mahasiswa
     */
    public String cekKelulusan() {
        if (ipk >= 3.00) {
            return "Lulus";
        } else {
            return "Belum Lulus";
        }
    }

    // ── Method updateIpk ─────────────────────────────────────────────────────

    /**
     * Memperbarui IPK mahasiswa dengan nilai baru menggunakan setter.
     * Setelah diperbarui, langsung memanggil tampilkanInfo() untuk
     * menampilkan data terkini beserta status kelulusan.
     *
     * @param ipkBaru Nilai IPK baru
     */
    public void updateIpk(double ipkBaru) {
        setIpk(ipkBaru);   // gunakan setter agar validasi tetap berjalan
        System.out.println("Data berhasil diperbarui!");
        System.out.println();
        tampilkanInfo();   // tampilkan info terbaru setelah update
    }

    // ── Method tampilkanInfo ──────────────────────────────────────────────────

    /**
     * Menampilkan seluruh informasi mahasiswa ke konsol,
     * termasuk status kelulusan dari cekKelulusan().
     */
    public void tampilkanInfo() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.printf ("IPK     : %.2f%n", ipk);
        System.out.println("Status  : " + cekKelulusan());
        System.out.println("----------------------------------------");
    }
}