public class powerOf {
    public static void main(String[] args) {
        int a = 4,b=11;
        if(b==0) {
            System.out.println(1);
            return;
        }
        System.out.println(new powerOf().pow(a,b-1,a));
        System.out.println(new powerOf().powV2(a,b));
        System.out.println(new powerOf().powRec(a,b));
        System.out.println(new powerOf().binaryPow(a,b));
    }
//naive method
    public int pow(int a,int b,int it){
        if(b==0) return a;
        return pow(a*it,b-1,it);
    }
//second method
    public int powV2(int a,int b){
        int temp =(int) Math.pow(a,b/2);
        temp*=temp;
        if(b%2==0){
            return temp;
        }
        else {
            return temp*a;
        }
    }
//using recursion
    public int powRec(int a,int b){
        if(b==0) return 1;
        int temp = powRec(a,b/2);
        temp*=temp;
        if(b%2==0)
            return temp;
        else
            return temp*a;
    }
//    most efficient solution
    public int binaryPow(int a,int b){
        int res=1;
        while(b>0){
            if(b%2!=0)
                res = res*a;
            a*=a;
            b=b>>1; // or you can write b=b/2;
        }
        return res;
    }
}
