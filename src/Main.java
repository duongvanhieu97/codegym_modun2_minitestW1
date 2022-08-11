import book.Book;
import book.FictionBook;
import book.ProgrammingBook;

public class Main {
    public static void main(String[] args) {
        Book b1 = new ProgrammingBook("34589", "Java Overview", 100, "TG1", "Java", "None");
        Book b2 = new ProgrammingBook("12345", "Java OOP", 200, "TG2", "Java", "None");
        Book b3 = new ProgrammingBook("23123", "Java Code", 120, "TG3", "Java", "None");
        Book b4 = new ProgrammingBook("89181", "JavaScript", 134, "TG4", "JavaScript", "None");
        Book b5 = new ProgrammingBook("01234", "Java CRUD", 153, "TG5", "Java", "None");
        Book b6 = new FictionBook("23456", "Yeu em rat nhieu", 50, "TG6", "Sen");
        Book b7 = new FictionBook("18232", "Ubik", 56, "Philip K. Dick", "Viễn tưởng 1");
        Book b8 = new FictionBook("27734", "Dune ", 192, "Frank Herbert", "Viễn tưởng 1");
        Book b9 = new FictionBook("12732", "Labyrinths", 148, "Jorge Luis Borges", "Viễn tưởng 1");
        Book b10 = new FictionBook("13294", "1984", 123, "George Orwell", "Viễn tưởng 1");
        Book listBook[] = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10};

        System.out.println("Tổng tiền 10 cuốn sách");
        int sum = 0;
        for (int i = 0; i < listBook.length; i++) {
            sum += listBook[i].getPrice();
        }
        System.out.println(sum);

        System.out.println("Đếm số sách ProgrammingBook có language là \"Java\"");
        int count = 0;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] instanceof ProgrammingBook) {
                ProgrammingBook programmingBook = (ProgrammingBook)listBook[i];
                String language = programmingBook.getLanguage();
                if (language == "Java"){
                    count ++;
                }
            }
        }
        System.out.println(count);

        System.out.println("Đếm số sách Fiction có category là “Viễn tưởng 1”.");
        int count1 = 0;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] instanceof  FictionBook) {
                FictionBook fictionBook = (FictionBook) listBook[i];
                String category = fictionBook.getCategory();
                if (category == "Viễn tưởng 1") {
                    count1 ++;
                }
            }
        }
        System.out.println(count1);

        System.out.println("Đếm số sách Fiction có giá < 100.");
        int count2 = 0;
        for (int i = 0; i < listBook.length ; i++) {
            if (listBook[i].getPrice() < 100) {
                count2++;
            }
        }
        System.out.println(count2);
    }
}
