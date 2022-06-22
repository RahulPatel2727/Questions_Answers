public class missingNum {
    public static void main(String[] args) {
//        constraint: if array size is n then the element should present form 1 to n+1, then find the missing no?
        int []arr={1,2,3,5};
        System.out.println(new missingNum().missing(arr));
    }
    public int missing(int []arr){
        int res = 0;
        for(int i=0; i<arr.length;i++){
            res=res^arr[i];
        }
        int i=arr.length+1;
        while(i>0){
            res=res^i;
            i--;
        }
        return res;
    }
}
