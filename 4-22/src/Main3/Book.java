package Main3;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "book")
public class Book {
    @XmlElement
    private String title;
    @XmlElement
    private String author;
    @XmlElement
    private int price;

    public String getTitle(){return this.title;}
    public String getAuthor(){return this.author;}
    public int getPrice(){return this.price;}

    public Book(){}
}
