public class Superkeyword {
    public void display() {
        System.out.println(" this is the first method ");
    }

    public void print() {
        System.out.println(" this is the second method running");
    }
}
class B extends Superkeyword{
    public void show(){
    super.display();//super should be the 1st line of the code
   super.print();
    }



}
