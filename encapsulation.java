import java.util.*; 
import java.util.Scanner;
class regpoly
{
    private int lside,nside; 
    public regpoly(int n,int l)
    {
        nside=n; 
        lside=l;
    }
    public void show()
    {
        System.out.println("number of sides are"+nside+"and length is"+lside);
    }
}
class Main 
{
    public static void main(String args[])
    {
        regpoly r=new regpoly(3,4); 
        r.show();
    }
}