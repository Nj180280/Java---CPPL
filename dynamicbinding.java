class Main
{
    public static class superclass {
        void print()
        {
            System.out.println(
                "print in superclass is called");
        }
    }
    public static class subclass extends superclass {
        @Override void print()
        {
            System.out.println(
                "print in subclass is called");
        }
    }
    public static void main(String[] args)
    {
        superclass A = new superclass();
        superclass B = new subclass();
        A.print();
        B.print();
    }
}
//here compiler will not know what will be printed hence this is runtime binding , binding is delayed here 