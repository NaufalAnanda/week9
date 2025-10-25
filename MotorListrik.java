public class MotorListrik extends KendaraanListrik{

    private double waktuIsi;
    private double energi;

    public MotorListrik(String nama, double kapasitasBaterai,double dayaSaatIni,double kecepatanPengisian){
        super(nama, kapasitasBaterai, dayaSaatIni, kecepatanPengisian);
    }
    
    @Override
    public double hitungWaktuPengisian(){
        waktuIsi = (kapasitasBaterai - dayaSaatIni)/kecepatanPengisian * 1.05;
        return waktuIsi;
    }

    @Override
    public double hitungEnergiDibutuhkan(){
        energi = kapasitasBaterai - dayaSaatIni;
        return energi;
    }

    public void info(){
        System.out.println("Motor Listrik --> " +"waktu: "+ waktuIsi +" jam, energi: "+ energi +" kWh");
    }
}