package PraktikumPemlan5;

public class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    public double hitungHarga() {
        return super.getHarga() * jumlah * 2;
    }

    public String toString() {
        return "Kue Jadi: " + getNama() + ", Harga: Rp " + getHarga() + ", Jumlah: " + getJumlah() + " buah";
    }
}
