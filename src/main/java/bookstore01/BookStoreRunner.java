package bookstore01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookStoreRunner {

    public static void main(String[] args) {
        start();

    }

    public static void start(){
        int select=0;

        do{
            Scanner input =new Scanner(System.in);
            BooksProcess book=new BooksProcess();
            NoteBooksProcess noteBook=new NoteBooksProcess();


            System.out.println("   Book Store Menu   ");
            System.out.println("   1- Books       ");
            System.out.println("   2- Note Books  ");
            System.out.println("   0- ÇIKIŞ       ");
            System.out.print  ("Seçiminiz  :      ");

           try {
               select = input.nextInt();
           }catch (InputMismatchException e){
               System.out.println("Lütfen 1 - 2 veya 0 değerleri giriniz");
               start();
           }

            switch(select){
                case 1:
                    book.ProductMenuProcess();
                    break;
                case 2:
                    noteBook.ProductMenuProcess();
                    break;
                case 0:
                    System.out.println("Menüden çıktınız...!!!");
                default:
                    System.out.println("Hatalı giriş yaptınız,");
                    System.out.println("Kitap bölümü için 1 ,Defter Bölümü için 2, Çıkış için 0 a basınız");

            }
        }while(select!=0);


    }
}
