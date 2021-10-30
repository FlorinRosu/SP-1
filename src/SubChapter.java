import java.util.ArrayList;
import java.util.List;

public class SubChapter {

    private String name;
    private List<Element> elements=new ArrayList<Element>();

    public SubChapter(String name) {
        this.name = name;

    }

    public void printSubChapter(){
        System.out.println(this.name);
    }

    public void addElement(Element a){
        this.elements.add(a);
    }

    public void createNewParagraph(String a){

        Paragraph b=new Paragraph(a);
        this.elements.add(b);
    }
    public void createNewImage(String a){

        Paragraph b=new Paragraph(a);
        this.elements.add(b);
    }
    public void createNewTable(String a){

        Paragraph b=new Paragraph(a);
        this.elements.add(b);
    }

    public void print(){
        System.out.println(this.name);
        for(Element b:this.elements)
        {
            System.out.println(b.toString());
        }
    }
}
