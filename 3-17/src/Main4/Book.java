package Main4;

public class Book {
    private String title;
    private boolean isLent;

    public Book(String title){
        this.title = title;
        this.isLent = false;
    }

    // getter,setter
    public String getTitle(){return this.title;}
    public boolean isLent(){return this.isLent;}
    protected void setLent(boolean isLent){this.isLent = isLent;}
}
