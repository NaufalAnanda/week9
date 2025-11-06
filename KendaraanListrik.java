public abstract class KendaraanListrik implements KonsumsiEnergi{
    protected String nama;
    protected double kapasitasBaterai;
    protected double dayaSaatIni;
    protected double kecepatanPengisian;
  

    public KendaraanListrik(String nama, double kapasitasBaterai,double dayaSaatIni,double kecepatanPengisian){
        this.nama = nama;
        this.dayaSaatIni = dayaSaatIni;
        this.kapasitasBaterai = kapasitasBaterai;
        this.kecepatanPengisian = kecepatanPengisian;
    }

    @Override
    public double hitungEnergiDibutuhkan(){
        return 0;
    }
    //test saja buat pull
    public abstract double hitungWaktuPengisian();

   
}
