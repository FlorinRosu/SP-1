import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Author {
   private String name;

    public Author(String name) {
        this.name = name;
    }

    public void printAuthor(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
