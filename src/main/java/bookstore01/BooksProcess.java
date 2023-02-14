package bookstore01;


import java.awt.print.Book;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static bookstore01.BookStoreRunner.start;

public class BooksProcess implements Services {

    List<Books> bookList = new ArrayList<>();

    @Override
    public void ProductMenuProcess() {
        Scanner input = new Scanner(System.in);
        BooksProcess book = new BooksProcess();
        int select = 0;
        do {

            System.out.println("-------KİTAP MENÜSÜ-----");
            System.out.println(" 1 -Kitap Ekle ");
            System.out.println(" 2- Kitap Sil ");
            System.out.println(" 3 -Kitap Listele ");
            System.out.println(" 4 -Yayınevine Göre Listele ");
            System.out.println(" 0 -ÇIKIŞ ");
            System.out.print("    Seçiminiz....:");

            try {
                select = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Lütfen rakam giriniz");
            }
            switch (select) {

                case 1:
                    book.addProduct();
                    break;
                case 2:
                    book.removeProductName();
                    break;
                case 3:
                    book.listProduct();
                    break;
                case 4:
                    // yayınevine göre
                    break;
                case 0:
                    System.out.println("Ana Menüye Çıkış");
                    start();
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız...");
            }

        } while (select != 0);

    }

    @Override
    public void addProduct() {

        Scanner input = new Scanner(System.in);

        System.out.print("Kitap ismi giriniz...:  ");
        String prdName = input.nextLine();

        System.out.print("Yazar adı giriniz...:   ");
        String authorName = input.nextLine();

        System.out.print("Yayınevi giriniz...:    ");
        String publisher = input.nextLine();

        System.out.print("Fiyat giriniz...:     ");
        int price = input.nextInt();

        System.out.print("Stok miktarı giriniz...: ");
        int stock = input.nextInt();

        System.out.println("Id giriniz");
        int id = input.nextInt();

        Books book = new Books(id, prdName, authorName, publisher, price, stock);

        bookList.add(book);

    }


    @Override
    public void removeProductName() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Silmek istediğiniz kitap ismini  seçiniz");
        String removeBook = scan.nextLine();

        for (Books book : this.bookList) {
            if (book.getProductName().equals(removeBook)) {
                bookList.remove(book);
            } else {
                System.out.println("Kitap Listede bulunamamıştır");

            }
        }
    }

        @Override
        public void listProduct () {
            for (Books books : this.bookList) {
                System.out.println("---------------------------------------------------------------------------");
                System.out.println(" ║   * Id           : ║ " + books.getId() +
                        " ║   * Kitap Adı    : ║ " + books.getProductName() +
                        " ║   * Yazar Adı    : ║ " + books.getAuthorName() +
                        " ║   * Yayıncı Adı  : ║ " + books.getPublisher() +
                        " ║   * Fiyatı       : ║ " + books.getPrice() +
                        " ║   * Stok durumu  : ║ " + books.getStock());
                System.out.println("--------------------------------------------------------------------------");
            }

        }

    }
