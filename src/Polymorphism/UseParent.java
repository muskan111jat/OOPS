package Polymorphism;

public class UseParent {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();//the parent show will execute as p is the refrence of type Parentof the static method
        p.display();//non -static method so p is the object pointing to Parent  so  display of parent will execute

        p = new child();
        p.show();//the parent show will execute as p is the refrence of type Parentof the static method
        p.display();//the non-static (instance method)is executed as pis the object of child see the above two lines i.e p = new child();
    }
}
