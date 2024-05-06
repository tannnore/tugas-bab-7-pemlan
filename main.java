package PraktikumPemlan5;

public class main {
    public static void main(String[] args) {

        Kue[] kue = {
                new KuePesanan("Kue Choco Chips", 18000, 3),
                new KueJadi("Kue Lemperan", 3000, 6),
                new KuePesanan("Kue Honey Crunch", 7000, 4),
                new KueJadi("Kue Cheesy Bites", 4000, 5),
                new KuePesanan("Kue Berrylicious Tart", 15000, 2),
                new KueJadi("Kue Rollie Pollie", 6000, 7),
                new KuePesanan("Kue Choco Fudge", 10000, 1),
                new KueJadi("Kue Creamy Puffs", 2000, 7),
                new KuePesanan("Kue Layerlicious", 9000, 2),
                new KueJadi("Kue Sticky Rice Roll", 7500, 5),
                new KuePesanan("Kue Pandan Delight", 9500, 5),
                new KueJadi("Kue Cheese Pleasure", 8500, 3),
                new KuePesanan("Kue Corny Delight", 1000, 2),
                new KueJadi("Kue Grilled Delight", 6000, 4),
                new KuePesanan("Kue Breadlicious", 9000, 1),
                new KueJadi("Kue Sago Bliss", 1500, 8),
                new KuePesanan("Kue Velvety Dream", 1700, 2),
                new KueJadi("Kue Mud Pie", 8500, 6),
                new KuePesanan("Kue Strawberry Sensation", 12000, 3),
                new KueJadi("Kue Yammy Delight", 8000, 5)

        };

        System.out.println("=============Daftar Kue=============");
        for (int i = 0; i < kue.length; i++) {
            System.out.println(kue[i] + "\n");
        }

        double total = 0;
        double totalHargaKuePesanan = 0;
        double totalHargaKueJadi = 0;
        double totalBerat = 0;
        double totalJumlah = 0;

        for (int i = 0; i < kue.length; i++) {
            total += kue[i].hitungHarga();
            if (kue[i] instanceof KuePesanan) {
                totalHargaKuePesanan += kue[i].hitungHarga();
                totalBerat += ((KuePesanan) kue[i]).getBerat();
            } else if (kue[i] instanceof KueJadi) {
                totalHargaKueJadi += kue[i].hitungHarga();
                totalJumlah += ((KueJadi) kue[i]).getJumlah();
            }
        }

        System.out.println("=============[STATS]=============");
        System.out.println("Total Harga Semua Kue\t: Rp " + total);
        System.out.println("\nTotal Harga Kue Pesanan\t: Rp " + totalHargaKuePesanan);
        System.out.println("Total Berat Kue Pesanan\t: " + totalBerat + " kg");
        System.out.println("\nTotal Harga Kue Jadi\t: Rp " + totalHargaKueJadi);
        System.out.println("Total Jumlah Kue Jadi\t: " + totalJumlah + " buah");

        double hargaTertinggi = 0;
        String namaKueTertinggi = "";
        String jenisKueTertinggi = "";

        for (int i = 0; i < kue.length; i++) {
            if (kue[i].hitungHarga() > hargaTertinggi) {
                hargaTertinggi = kue[i].hitungHarga();
                namaKueTertinggi = kue[i].getNama();
                jenisKueTertinggi = (kue[i] instanceof KuePesanan) ? "Kue Pesanan" : "Kue Jadi";
            }
        }
        System.out.println("\nKue Tertinggi");
        System.out.println("Berdasarkan Jenis\t: " + jenisKueTertinggi);
        System.out.println("Berdasarkan Nama\t: " + namaKueTertinggi);
        System.out.println("Harga\t\t\t: Rp " + hargaTertinggi);
    }
}
