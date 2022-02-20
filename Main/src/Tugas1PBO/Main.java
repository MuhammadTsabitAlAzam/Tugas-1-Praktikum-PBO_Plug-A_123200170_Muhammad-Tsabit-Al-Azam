
package Tugas1PBO;
import java.util.Scanner;
public class Main {

   static double celcius;
   static int pilih;
   static int i=0;
   
    public static void main(String[] args) { 
        
        Scanner input = new Scanner(System.in);
        System.out.println("Program Konversi Suhu");
        System.out.println("---------------------");
        System.out.print("Masukkan Suhu Air Dalam Celcius : ");
        celcius = input.nextDouble();
        
        while(i!=1){
        System.out.println("\n Opsi");
        System.out.println("....");
        System.out.println("1. Lihat Data Konversi");
        System.out.println("2. Edit Data Konversi");
        System.out.println("3. Exit");
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        
        switch(pilih){
            case 1: 
                System.out.println("Suhu dalam Celcius  : " +celcius +"°C");
                System.out.println("Dalam Farenheit     : " +Konversi.farenheit() +"°F");
                System.out.println("Dalam Reamur        : " +Konversi.reamur() +"°R");
                System.out.println("Dalam Kelvin        : " +Konversi.kelvin() +"K");
                if(celcius<=0){System.out.println("Suhu Air Beku");}
                else if(celcius>=100){System.out.println("Suhu Air Mendidih");}
                else {System.out.println("Suhu Air Normal");}
                break;
            
            case 2:
                System.out.print("Ubah Suhu Air : ");
                celcius = input.nextDouble();
                break;
            case 3:
                i=1;
                System.exit(0);
                break;
            default : System.out.println("Input Anda Salah");break;
        
        }
            System.out.println("");
        }  
    }
    
}
