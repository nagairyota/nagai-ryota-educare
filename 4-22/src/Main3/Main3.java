package Main3;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        try {
            jakarta.xml.bind.JAXBContext context = jakarta.xml.bind.JAXBContext.newInstance(Book.class);
            jakarta.xml.bind.Unmarshaller unmarshaller = context.createUnmarshaller();
            Book book = (Book)unmarshaller.unmarshal(new File("src\\Main3\\excersise.xml"));

            System.out.println("タイトル: " + book.getTitle());
            System.out.println("著者: " + book.getAuthor());
            System.out.println("価格: " + book.getPrice());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// コンパイル
// javac -cp ".;lib/*" src/Main3/Main3.java src/Main3/Book.java
// java -cp ".;lib/*" Main3.Main3
