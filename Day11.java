package Day11;
import java.util.Scanner;

public class main {

public static void main(String[] args) {
  //deklarasi 
  string nama;
  char a;
  int umur;
  byte angka;
  short jumlah;
  long berapa;
  double panjang;
  float berat;
  boolean pernyataan;

  //inisialisasi 
  Scanner input= new Canner(System.in);
  System.out.println("nama : ");
  nama = input.nextLine();
  System.out.println("Char : ");
  a = input.next().charAt(0);
  System.out.println("Int : ");
  umur = input.nextInt();
  System.out.println("angka : ");
  angka = input.nextByte();
  System.out.println("jumlah : ");
  jumlah = input.nextShort();
  System.out.println("berapa : ");
  berapa = input.nextLong();
  System.out.println("panjang : ");
  panjang = input.nextDouble();
  System.out.println("berat : ");
  berat = input.nextFloat();
  System.out.println("pernyataan : ");
  pernyataan = input.nextBoolean(); 

  //*Scanner adalah kelas 
  
  
