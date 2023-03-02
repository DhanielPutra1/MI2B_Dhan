/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class mahasiswa {
    String nim; String nama; String kelas; String prodi; String jurusan;

    
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa();
        mhs.nama = "Dhaniel Putra Al";
        mhs.nim = "2101092043";
        mhs.kelas = " MI2b";
        mhs.prodi = "MI";
        mhs.jurusan = "Teknologi Informasi";
        
        
        
        
        System.out.println("Nama : "+mhs.nama +"\n"+"Kelas : "+mhs.kelas+"\n" 
                + "NoBP : " + mhs.nim+ "\nProdi : "+ mhs.prodi +"/nJurusan : " + mhs.jurusan);
        
        /*  System.out.println("");*/
        
           mahasiswa mhs2 = new mahasiswa();
           
        mhs2.nama = "Dhaniel";
        mhs2.nim = "2101092044";
        mhs2.kelas = " MI2b";
        mhs2.prodi = "TRPL";
        mhs2.jurusan = "Teknologi Informasi";
        
        
        
        
        System.out.println("Nama : "+mhs2.nama +"\n"+"Kelas : "+mhs2.kelas+"\n" 
                + "NoBP : " + mhs2.nim+ "\nProdi : "+ mhs2.prodi +"/nJurusan : " + mhs2.jurusan);
        
        
        
    }

   
    
    
}
