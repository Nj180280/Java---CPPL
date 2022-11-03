import java.util.*; 
class sum
{
    public int add(int a,int b)
    {
       System.out.println("summation is :"+(a+b)); 
    }
    public int add(double a,double b)
    {
        System.out.println("summation is :"+(a+b));  
    }
}
class Main
{
public static void main(String[] args) 
{
    sum s=new sum(); 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Integer addition is : "+s.add(4,3)); 
    System.out.println("Double addition is : "+s.add(4.0,3.7));
}
}