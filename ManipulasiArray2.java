// Mengimpor Scaanner ke program
import java.util.Scanner;

public class ManipulasiArray2{
    public static void main (String[] args){

        Scanner input = new Scanner(System.in); // Untuk Inputan User
        int UbahAngka, UbahIndex = 0;
        int Angka[] = {3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5};

        System.out.println("Angka Array");
        System.out.println("{3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5}");

        System.out.println("Merubah nilai dari angka array !!!");
        do{
            System.out.print("Masukan posisi yang mau diganti 1-13 : ");
            UbahIndex = input.nextInt();

        }while(UbahIndex < 1 || UbahIndex > 13);

        System.out.print("Masukan nilai yang akn diinputkan kedalam array number : ");
        UbahAngka = input.nextInt();

        for(int i=0 ; i < Angka.length ; i++){
            if(UbahIndex -1 == i){
                Angka[i] = UbahAngka;
            }
        }

        System.out.println("Menampilkan Angka Array Setelah diubah");
        System.out.print("{");
        for(int i=0 ; i < Angka.length; i++){
            System.out.print(Angka[i] + " ");
        }
        System.out.print("}");


    }
}