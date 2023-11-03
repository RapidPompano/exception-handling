public class Excp {
    public static void main(String[] args)
    {
        int a = 3;
        try
        {
            int x = a/0;
        }
        catch(Exception e)
        {
            System.out.println("error, dividing by zero ");
        }
        
        System.out.println("hello");
    }
}
