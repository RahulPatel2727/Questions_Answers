public class powerSet_usingBitwise {
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();
        int []arr={1,2,3};
//        for string
        new powerSet_usingBitwise().powSet(s,n);
//        for array
//        new powerSet_usingBitwise().powSet(arr,arr.length);
    }
    //for string
    public void powSet(String str,int n){
        int pow=(int)Math.pow(2,n);
        for(int i=0;i<pow;i++){
            for(int j=0;j<str.length();j++){
                if((i&(1<<j))!=0)
                    System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
    // for array
    public void powSet(int []arr,int len){
        int pow=(int) Math.pow(2,len);
        for(int i=0;i<pow;i++){
            for(int j=0;j<len;j++){
                if((i&(1<<j))!=0){
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
    }
}
