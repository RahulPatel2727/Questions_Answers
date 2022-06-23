public class powerSet_usingBitwise {
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();
        new powerSet_usingBitwise().powSet(s,n);
    }
    public void powSet(String str,int n){
        int pow=(int)Math.pow(2,n);
        for(int i=0;i<pow;i++){
            for(int j=0;j<str.length();j++){
                if((i&(1<<j))!=0)
                    System.out.print(str.charAt(j));
            }
            System.out.println(" ");
        }
    }
}
