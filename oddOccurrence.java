public class oddOccurrence {
    public static void main(String[] args) {
        int []arr={3,3,3,3,2,2,4,5,4,4,5,0,4};
        System.out.println(new oddOccurrence().occurrence(arr));
    }
    public int occurrence(int []arr){
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j])
                    count++;
            }
            if((count&1)==1)
                return arr[i];
        }
        return -1;
    }
}
