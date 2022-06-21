import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) throws  InterruptedException{
        System.out.println(-2>>1);
        long s=System.nanoTime();
        TimeUnit.SECONDS.sleep(1);
        long e = System.nanoTime();
        System.out.println((double) (e-s)/1000000000);
    }
}
