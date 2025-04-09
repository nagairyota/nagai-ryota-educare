package Main4;

public class Library{
    private Book b;
    
    public Library(Book b){
        this.b = b;
    }
    public void lendBook(){
        if(b.isLent() == false){
            b.setLent(true);
            System.out.println("「" + b.getTitle() + "」" + "を貸し出しました");
        }else{
            System.out.println("エラー: この本は既に貸し出し中です");
        }
    }
    public void returnBook(){
        if(b.isLent() == true){
            b.setLent(false);
            System.out.println("「" + b.getTitle() + "」" + "が返却されました");
        } else{
            System.out.println("エラー： この本は貸し出されていません");
        }
    }
}