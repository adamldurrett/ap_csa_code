import java.util.Scanner;
class BookList{
    ArrayList<Book> bookarray;

    BookList() throws Exception{
        try{
            bookarray = new ArrayList<Book>();
            File bookfile = new File("./booklist.csv");
            Scanner scanner = new Scanner(bookfile);

            scanner.nextLine(); // Title,Genre,Author,Subject,Edition
            while(scanner.hasNextLine()){
                String input = scanner.nextLine(); // "The Hobbit,Fiction,J. R. R. Tolkien,,1"
                String [] data = input.split(","); // ["The Hobbit", "Fiction", "J. R. R. Tolkien", "", "1"]

                if(data[1]=="Fiction"){
                    bookarray.add(new FictionBook(data));
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}