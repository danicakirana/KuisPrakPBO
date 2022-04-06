/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Android extends Pendataan implements Pembobotan {

      public Android(String NIK, String Nama, int Tulis, int Coding, int Wawancara){
        super(NIK, Nama, Tulis, Coding, Wawancara);
    }

    public void TesTulis(int Tulis) {
        this.Tulis = Tulis;
    }

    public void TesCoding(int Coding) {
        this.Coding = Coding;
    }

    public void TesWawancara(int Wawancara) {
        this.Wawancara = Wawancara;
    }

    @Override
    public double hitung() {
        return (0.2 * super.Tulis) + (0.5 * super.Coding) + (0.3 * super.Wawancara);
    }

    @Override
    public String hasil() {
        if(this.hitung() >= 85) 
            return "LULUS\nSelamat kepada " + this.Nama + " telah diterima sebagai Android Development\n";
        else 
            return "GAGAL\nMohon maaf kepada  " + this.Nama + " telah ditolak sebagai Android Development\n";
    }
}
