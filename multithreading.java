import java.util.*; 
class mythread1 extends Thread
{
    mythread1(int n)
    {
        for(int i=0;i<11;i++)
        {
            System.out.println(n+"X"+i+"="+n*i); 
        }
        try
        {
            Thread.sleep(100); 
        }
        catch(InterruptedException e)
        {
            throw new RuntimeException(e); 
        }
    }
}
class mythread2 extends Thread
{
    char i;
    mythread2()
    {
        for(i='A';i<='Z';i++)
        {
            System.out.println(i+""); 
        }
        try
        {
            Thread.sleep(100); 
        }
        catch(InterruptedException e)
        {
            throw new RuntimeException(e); 
        }
    }
}
class Main
{
    public static void main(String args[])
    {
        mythread1 t1=new mythread1(47); 
        mythread2 t2=new mythread2();
    }
}