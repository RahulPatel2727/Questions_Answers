public class GCDv4Euclidean_Algo {
    public static void main(String[] args) {
        int a=17,b=7;
        System.out.println("GCD is..");
        System.out.println(new GCDv4Euclidean_Algo().euclideanAlgo(a,b));
    }
    public int euclideanAlgo(int a,int b){
        if (b==0)
            return a;

        else
            return euclideanAlgo(b,a%b);
    }
}
