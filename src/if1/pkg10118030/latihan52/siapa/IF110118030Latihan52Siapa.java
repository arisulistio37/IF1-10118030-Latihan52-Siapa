/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan52.siapa;

/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskirpsi program : program ini berisi tentang tampilan siapa kamu
 */
public class IF110118030Latihan52Siapa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        dosen.mengajarApa();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10118030");
        System.out.println("\nNIM MAHASISWA : "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.setNama("Ari Sulistio");
        mahasiswa.setUmur(19);
        mahasiswa.setKelas("IF-1");
        mahasiswa.kelasApa();
    }
    
}
