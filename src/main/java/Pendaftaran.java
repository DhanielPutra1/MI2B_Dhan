/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Pendaftaran {
    public static void main(String[] args) {
          
        mahasiswa mhs = new mahasiswa();
        
            mhs.nama = "Dhaniel Putra Al";
            mhs.nim = "2101092043";
            mhs.kelas = " MI2b";
            mhs.prodi = "MI";
            mhs.jurusan = "Teknologi Informasi";
        
        System.out.println("Nama : "+mhs.nama +"\n"+"Kelas : "+mhs.kelas+"\n" 
                + "NoBP : " + mhs.nim+ "\nProdi : "+ mhs.prodi +"/nJurusan : " + mhs.jurusan);
        
    }
}
