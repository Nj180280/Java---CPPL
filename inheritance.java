import java.util.*; 
class animal
{
    void run()
    {
        System.out.println("animal runs"); 
    }
    void danger()
    {
        System.out.println("danger");
    }
}
class dog extends animal
{
    void run()
    {
        System.out.println("dog is a animal and runs"); 
    }
    void eat()
    {
        System.out.println("dog eats"); 
    }
}
class labro extends dog
{
    void run()
    {
        System.out.println("labro is a dog and he runs"); 
    }
    void eat()
    {
        System.out.println("labro eats"); 
    }
}
class Main
{
public static void main (String[] args) 
{
    labro l=new labro(); 
    l.run(); 
    l.eat();
    l.danger();
}
}