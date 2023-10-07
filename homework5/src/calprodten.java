public class calprodten {
    public static void calprodten(int arr[]){
        int e = 0,sum,prod;
        for(int i=0;i<5;i++){
            if(arr[i]>0){
                e++;
            }
        }
        if(e==5){
            sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
            System.out.println(sum);
        }
        else {
            prod=arr[5]*arr[6]*arr[7]*arr[8]*arr[9];
            System.out.println(prod);
        }
    }
}
