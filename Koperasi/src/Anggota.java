public class Anggota {
    private String ktp;
    private String nama;
    private int limiPinjaman;
    private int jumlahPinjaman;

    public Anggota(String ktp, String nama, int limitPeminjaman){
        this.ktp = ktp;
        this.nama = nama;
        this.limiPinjaman = limitPeminjaman;
    }

    
    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getLimitPinjaman(){
        return this.limiPinjaman;
    }
    public void setLimitPinjaman(int limiPinjaman){
        this.limiPinjaman = limiPinjaman;
    }

    public int getJumlahPinjaman(){
        return this.jumlahPinjaman;
    }

    public void pinjam(int jumlahPinjaman){
        if(jumlahPinjaman > limiPinjaman){
            System.out.println("Jumlah Pinjaman melebihi batas");
        }else{
            this.jumlahPinjaman += jumlahPinjaman;
        }
    }

    public void angsur(int jumlahAngsur){
        if(jumlahAngsur<(limiPinjaman/10)){
            System.out.println("Maaf,angsuran harus 10% dari jumlah pinjaman");
        }else{
            jumlahPinjaman -= jumlahAngsur;
        }
    }

}
