package day12.java;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  //Deklarasi 
  String nama, nim, alamat;
  char jenisKelamin;
  byte jumlahSaudara;
  short tahunLahir;
  int umur, tb, bb;
  long noHp;
  float nilaiRaport;
  double lebar;
  boolean sudahLulus;

  //Inisialisasi 
  System.out.print("Nama : ");
  nama = input.nextLine();
  System.out.print(Nim :");
  nim = input.nextLine();
  System.out.print("Alamat :");
  alamat = input.nextLine();
  System.out.print("Jenis kelamin :"); 
  jenisKelamin = input.next().charAt(0);
  System.out.print("Jumlah Saudara :");
  jumlahSaudara = input.nextByte();
  System.out.print("Tahun lahir :");
  tahunLahir = input.nextShort();
  System.out.print("Umur :");
  umur = input.nextInt();
  System.out.peint("Tb :");
  tb = input.nextInt();
  System.out.print("Bb :");
  bb = input.nextInt();
  System.out.print("No Hp :");
  noHp = input.nextLong();
  System.out.print("Nilai Raport :");
  nilaiRaport = input.nextFloat();
  System.out.print("Lebar :");
  lebar = input.nextDouble();
  System.out.print("Sudah Lulus :");
  sudahLulus = input.nextBoolean();

  //output 
  System.out.println("Nama : "+ nama);
  System.out.println("NIM : "+ nim);
  System.out.println("Jenis kelamin : "+ jenisKelamin);
  System.out.println("Jumlah saudara : "+ jumlahSaudara);
  System.out.println("Tahun Lahir : "+ tahunLahir);
  System.out.println("Umur : "+ umur);
  System.out.println("Tb : "+ tb);
  System.out.println("Bb : "+ bb);
  System.out.println("No Hp : "+ noHp);
  System.out.println("Nilai Raport : "+ nilaiRaport);
  System.out.println("Lebar : "+ lebar);
  System.out.println("Sudah Lulus : "+ sudahLulus);
    
  /*
  //tipe data yang saya gunakan dalam membuat biodata Scanner ini :
  //String, char, byte, short, int, long, float, double, dan boolean (true/false)
  //String untuk nama, nim, dan alamat
  //char untuk jenis kelamin 
  //byte untuk jumlah saudara 
  //short untuk tahun lahir 
  //int intuk umur, tb, dan bb
  //long untuk no hp
  //float untuk nilai raport
  //double untuk lebar 
  //boolean untuk sudah lulus
  /*

    }

    }
  
