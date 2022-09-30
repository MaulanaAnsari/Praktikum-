package percabangan;
import java.util.Scanner;
public class MenghitungHari {
    public static void main(String[] args) {
        int bulan, tahun;
        int hari = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan Tahun");
        tahun = in. nextInt();
        System.out.println("Masukan Bulan");
        bulan = in. nextInt();
        switch (bulan) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                hari = 31;break;
            case 4:
            case 6:
            case 9:
            case 11:
                hari = 30; 
                break;
            case 2:
                if (((tahun % 4 == 0) && !(tahun % 100 == 0)) || (tahun % 400 == 0 ))
                    hari = 29;
                else
                    hari = 28;
                    break;
            default : System.out.println("Invalid month"); break;
        }
        System.out.println("Jumlah hari pada tahun " + tahun+ " Bulan"+ bulan +" adalah" + hari+ "hari");
    }}

        
   
    

