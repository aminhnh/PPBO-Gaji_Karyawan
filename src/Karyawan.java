public class Karyawan {
    private String nama;
    private int gaji;
    private double insentif;
    public Karyawan(String nama, int gaji, double insentif) {
        this.nama = nama;
        this.gaji = gaji;
        this.insentif = insentif;
    }
    public double getInsentif() {
        return insentif;
    }
    public void setInsentif(double insentif) {
        this.insentif = insentif;
    }
    public String getNama() {
        return nama;
    }
    public int getGaji() {
        return gaji;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    public void rincian(){
        System.out.println("Nama = " + nama + ", Gaji = " + gaji);
    }
}









