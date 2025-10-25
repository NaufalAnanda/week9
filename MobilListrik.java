import java.util.Locale;

public class MobilListrik extends KendaraanListrik{

    private double waktuIsi;
    private double energi;

    public MobilListrik(String nama, double kapasitasBaterai,double dayaSaatIni,double kecepatanPengisian){
        super(nama, kapasitasBaterai, dayaSaatIni, kecepatanPengisian);
    }
    
    @Override
    public double hitungWaktuPengisian(){
        waktuIsi = (kapasitasBaterai - dayaSaatIni)/kecepatanPengisian * 1.1;
        return waktuIsi;
    }

    @Override
    public double hitungEnergiDibutuhkan(){
        energi = kapasitasBaterai - dayaSaatIni;
        return energi;
    }

    public void info(){
       String waktuTampil;

        if (waktuIsi > 5) {
            waktuTampil = String.format( Locale.US,"%.1f", waktuIsi);
        } else {
            waktuTampil = String.valueOf(waktuIsi);
        }

        System.out.println("Mobil Listrik --> waktu: " + waktuTampil + " jam, energi: "+ energi + " kWh");
    }
}