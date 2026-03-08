package mahasiswa;
public class Mahasiswa {

    // ── Atribut private (enkapsulasi) ─────────────────────────────────────────
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    // ── Constructor ───────────────────────────────────────────────────────────
    /**
     * Menginisialisasi objek Mahasiswa dengan data lengkap.
     *
     * @param nama    nama lengkap mahasiswa
     * @param nim     nomor Induk Mahasiswa
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

    /** Mengembalikan IPK mahasiswa. */
    public double getIpk()     { return ipk; }

    // ── Method utama ──────────────────────────────────────────────────────────
    /**
     * Menampilkan seluruh informasi mahasiswa ke konsol
     * dalam format yang rapi dan mudah dibaca.
     */
    public void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.printf ("IPK     : %.2f%n", ipk);
        System.out.println("----------------------------------------");
    }
}