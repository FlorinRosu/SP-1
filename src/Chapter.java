import java.util.ArrayList;
import java.util.List;

public class Chapter {

    private String name;
    private final List<SubChapter> subChapters=new ArrayList<SubChapter>();

    public Chapter(String name) {
        this.name = name;

    }

    public void printChapter(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public SubChapter getSubChapters(Integer a) {
        return this.subChapters.get(a);
    }

    public Integer addSubChapter(String a){

        SubChapter b=new SubChapter(a);
        this.subChapters.add(b);
        return this.subChapters.lastIndexOf(b);
    }
}
