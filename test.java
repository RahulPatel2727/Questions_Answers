import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) throws  InterruptedException{
        long s=System.nanoTime();
        TimeUnit.SECONDS.sleep(2);
        long e = System.nanoTime();
        System.out.println((e-s)/1000000000);
    }
}
