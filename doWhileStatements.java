public class doWhileStatements
{
    public void run () {
        int i = 0;
        int k = 10;
        int a = 4;
        int b = 10;
        do {
            System.out.println("i is under 15");
            i++;
        }while (i < 15) ;
        do {
            System.out.println("k is more than 5");
            k--;
        }while (k > 5) ;
        do {
            System.out.println("a is less than 10 and b is less than or equal to 10");
            a++;
            b++;
        }while (a < 10 && b <= 20) ;
    }
    public static void main(String[] args)
    {        
        whileStatements hw = new whileStatements();
        hw.run();
    }
}