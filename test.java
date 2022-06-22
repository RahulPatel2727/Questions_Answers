import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) throws InterruptedException {
        int[] A = {1,1,1,1,1,1,1};//{1,4,7,10,11,12,13,16,19};//{1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,3,4,5,6,7,8,9};//{1,2,5,6,7, 9, 11, 13, 15, 17, 19,111};
        int n=A.length;
        int count=0,temp=Integer.MIN_VALUE;
        for(int i=0; i<n-1;i++){
            int dif=A[i+1]-A[i];
            int a=A[i];
            int ind=i,m=i,h=0,c=0;
            while(m!=0){
                if(A[m]==(a-h*dif)){
                    h++;
                    ind++;
                }
                m--;
            }
            a=A[ind];
            if(dif!=temp){
                int k=0;
                for(int j=ind;j<n;j++){
                    if(A[j]==(a+dif*k)){
                        c++;
                        k++;
                    }
                }
                if(c>count)
                    count=c;
            }
            temp=dif;
        }
//        int n = A.length;
//        int count=0, temp = Integer.MIN_VALUE;
//        for (int i=0; i<n-1; i++) {
//            int dif=A[i+1]-A[i];
//            int a=A[i];
//            int c=0;
//            int m=i;int h=0,ind=i;
//            while (m!=0) {
//                if (A[m]==(a-h*dif)){
////                    a=A[m];
//                    ind--;
//                    h++;
//                }
//                m--;
//            }
//            a=A[ind];
//            if(dif!=temp) {
//                int k = 0;
//                for (int j = ind; j < n; j++) {
//                    if (A[j] == (a + k * dif)) {
//                        k++;
//                        c++;
//                    }
//                }
//                if (c > count)
//                    count = c;
//            }
//            temp = dif;
//        }
        System.out.println(count);
    }
}
