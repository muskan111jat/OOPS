public class Student {
private int roll;
private String name;
private double per;

public void setStudent(int r,String s, double p){
if(r<=0){
    System.out.println("Roll number cannot be Zero or negative");
}
else
roll =r;
name=s;
per=p;


}
public void showStudent(){
System.out.println("Roll="+ roll);
    System.out.println("Name="+ name);
    System.out.println("per="+ per);

}


}
