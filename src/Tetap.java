public class Tetap extends Karyawan{
    private double bonus = 0.2;
    public Tetap(String nama, int gaji) {
        super(nama, gaji, 0.025);
    }
    public double getTotalBonus(){
        return super.getGaji() * bonus;
    }
    public double getTotalInsentif(){
        return super.getGaji() * super.getInsentif();
    }
    @Override
    public void rincian() {
        System.out.println("Nama : " + super.getNama());
        System.out.println("Status : Karyawan Tetap");
        System.out.println("Gaji : " + super.getGaji());
        System.out.println("Total Bonus : " + getTotalBonus());
        System.out.println("Total Insentif : " + getTotalInsentif());
        System.out.println("Total Gaji : " + (super.getGaji() + getTotalBonus() + getTotalInsentif()));
        System.out.println("---------------");
    }
}
