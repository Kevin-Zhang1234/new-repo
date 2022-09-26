public class forLoops
{
    public void run () {
        for (int i = 0; i < 15; i++) {
            System.out.println("i is less than 15, i is "+i);
            
        }
        for (int j = 10; j != 0; j -= 2) {
            System.out.println("j is equal to "+j);
        }
        for (int k = 10; k != 0; k -= 3) {
            System.out.println(k);
        }
    }
    public static void main(String[] args)
    {        
        forLoops hw = new forLoops();
        hw.run();
    }
}