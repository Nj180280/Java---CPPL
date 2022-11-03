import java.util.*; 
class Main
{
    public static void main(String args[])
    {
        int size,flag=0,val; 
        Scanner s=new Scanner(System.in); 
        System.out.println("enter size of array");
        size=s.nextInt(); 
        int a[]=new int[size]; 
        System.out.println("enter array elements");
        for(int i=0;i<size;i++)
        {
            a[i]=s.nextInt(); 
        }
        System.out.println("entered array is");
        for(int i=0;i<size;i++)
        { 
              System.out.println(a[i]);
        }
        System.out.println("enter element to be searched");
        val=s.nextInt(); 
        for(int i=0;i<size;i++)
        {
            if(val==a[i])
            {
                flag=1; 
            }
            else
            {
                flag=0;
            }
        }
        if(flag==1)
        {
           System.out.println("element found"); 
        }
        else
        {
            System.out.println("element not found");
        }
    }
}