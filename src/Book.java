import java.util.ArrayList;
import java.util.List;
public class Book {

    private String name;
    private List<Author> authors=new ArrayList<Author>();
    private final   List<Chapter> chapters=new ArrayList<Chapter>();


    public Book(String name) {
        this.name = name;
    }

     public void addAuthor(Author a){
        this.authors.add(a);
     }
     public Integer addChapter(String a){
        Chapter b=new Chapter(a);
        this.chapters.add(b);
        return this.chapters.lastIndexOf(b)  ;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Chapter getChapters(Integer a) {
        return this.chapters.get(a);
    }
}
