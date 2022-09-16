import java.util.Scanner;
public class  TestKoperasi {
    public static void main(String[] args) throws Exception {
        Scanner masukkan = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        
        System.out.println("masukkan jumlah yang dipinjam : ");
        int pinjam = masukkan.nextInt();
        donny.pinjam(pinjam);

        System.out.println("masukkan jumlah yang angsuran : ");
        int angsur = masukkan.nextInt();
        donny.angsur(angsur);
        System.out.println("Jumlah Pinjaman saat  ini :"+ donny.getJumlahPinjaman());

        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        // System.out.println("\nMeminjam uang 4.000.000...");
        // donny.pinjam(4000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        // System.out.println("\nMembayar angsuran 300.000");
        // donny.angsur(300000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        // System.out.println("\nMembayar angsuran 3.000.000");
        // donny.angsur(3000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}

