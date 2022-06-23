public class twoOddOccurrence {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,5,4,3,2,1,1,1,6,8};
        int []res=new twoOddOccurrence().twoOddOcc(arr);
        System.out.println(res[0]+" "+res[1]);
    }
    public int[] twoOddOcc(int []arr){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i]; //finding pair which are odd in occurrence
        }
        int c1=0,c2=0;
        xor=(xor & ~(xor-1));//for finding last set bits from the right
        for(int i=0;i<arr.length;i++){
            if((arr[i]&xor)!=0){// to check if arr[i] and with last set bit is 1
                c1=c1^arr[i]; //doing xor with those no which has last set bits same as previously founded
            }
            else{
                c2=c2^arr[i];
            }
        }
        return new int[]{c1,c2};
    }
}
