package Main3;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("ワンワン");
    }
    public void eat(){
        System.out.println(this.name + "が餌を食べています");
    }
}
