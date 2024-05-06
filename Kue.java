package PraktikumPemlan5;

public abstract class Kue {
    private String nama;
    private double harga;

    abstract double hitungHarga();

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return harga;

    }

}
