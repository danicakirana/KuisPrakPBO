/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Web extends Pendataan implements Pembobotan {
    public Web(String NIK, String Nama, int Tulis, int Coding, int Wawancara){
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
        return (0.4 * super.Tulis) + (0.35 * super.Coding) + (0.25 * super.Wawancara);
    }

    @Override
    public String hasil() {
        if(this.hitung() >= 85) 
            return "LULUS\nSelamat kepada " + this.Nama + " telah diterima sebagai Web Development\n";
        else 
            return "GAGAL\nMohon maaf kepada " + this.Nama + " telah ditolak sebagai Web Development\n";
    }
}
