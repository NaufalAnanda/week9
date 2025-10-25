public class Main {
    public static void main(String[] args) {
        
        MobilListrik mobil1 = new MobilListrik("Mobil Listrik", 80, 20, 10);
        MotorListrik motor1 = new MotorListrik ("Motor Listrik", 30, 10, 5);
        MobilListrik mobil2 = new MobilListrik("Mobil Listrik", 60, 45, 12);
        MotorListrik motor2 = new MotorListrik ("Motor Listrik", 25, 20, 4);
        
        
        double totalWaktu = 0;
        double totalEnergi = 0;
        totalWaktu += mobil1.hitungWaktuPengisian();
        totalEnergi += mobil1.hitungEnergiDibutuhkan();
        totalWaktu += motor1.hitungWaktuPengisian();
        totalEnergi += motor1.hitungEnergiDibutuhkan();
        totalWaktu += mobil2.hitungWaktuPengisian();
        totalEnergi += mobil2.hitungEnergiDibutuhkan();
        totalWaktu += motor2.hitungWaktuPengisian();
        totalEnergi += motor2.hitungEnergiDibutuhkan();

        

        mobil1.hitungWaktuPengisian();
        mobil1.hitungEnergiDibutuhkan();
        mobil1.info();

        motor1.hitungWaktuPengisian();
        motor1.hitungEnergiDibutuhkan();
        motor1.info();

        mobil2.hitungWaktuPengisian();
        mobil2.hitungEnergiDibutuhkan();
        mobil2.info();

        motor2.hitungWaktuPengisian();
        motor2.hitungEnergiDibutuhkan();
        motor2.info();

        System.out.println("Total waktu pengisian seluruh kendaraan "+ totalWaktu +" jam");
        System.out.println("Total energi dibutuhkan "+ totalEnergi +" kWh");












    }
}
