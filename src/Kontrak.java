public class Kontrak extends Karyawan{
    private int gajiPerJam;
    private int totalJamPerBulan;
    public Kontrak(String nama, int gajiPerJam, int totalJamPerBulan) {
        super(nama, gajiPerJam * totalJamPerBulan,0.02);
        this.gajiPerJam = gajiPerJam;
        this.totalJamPerBulan = totalJamPerBulan;
    }
    @Override
    public void rincian() {
        System.out.println("Nama : " + super.getNama());
        System.out.println("Status : Kontraktor");
        System.out.println("Gaji : " + super.getGaji());
        System.out.println("Total Insentif : " + getTotalInsentif());
        System.out.println("Total Gaji : " + (super.getGaji() + getTotalInsentif()));
        System.out.println("---------------");
    }
    public double getTotalInsentif(){
        return gajiPerJam * totalJamPerBulan * super.getInsentif();
    }
    public int getGajiPerJam() {
        return gajiPerJam;
    }
    public int getTotalJamPerBulan() {
        return totalJamPerBulan;
    }
    public void setGajiPerJam(int gajiPerJam) {
        this.gajiPerJam = gajiPerJam;
    }
    public void setTotalJamPerBulan(int totalJamPerBulan) {
        this.totalJamPerBulan = totalJamPerBulan;
    }

}
