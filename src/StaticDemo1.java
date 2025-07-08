 class Demo1 {
int a;//instance variable
static int b;//static keyword

}
public class StaticDemo1 {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        Demo1 d2 = new Demo1();
        Demo1 d3 = new Demo1();
d1.a=15;
d2.a=20;
d3.a=56;
System.out.println("d1.a= "+d1.a+"d2.a= "+d2.a+"d3.a= "+d3.a);
        d1.b=100;
        d2.b=200;
        d3.b=300;
System.out.println("d1.b= "+d1.b+"d2.b= "+d2.b+"d3.b= "+d3.b);
        d3.b=800;
        System.out.println("d3.b = "+d3.b);
        System.out.println("d1.b= "+d1.b+"d2.b= "+d2.b+"d3.b= "+d3.b);


    }
}







