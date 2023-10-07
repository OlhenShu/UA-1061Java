import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sq1 = new Scanner(System.in);
        int lq;
        System.out.print("Input number of hometask:");
        lq= sq1.nextInt();
        choose(lq);
    }
    public static void choose(int lq){
        if(lq==1){
            Scanner od1 = new Scanner(System.in);
            Scanner od2 = new Scanner(System.in);
            Scanner od3 = new Scanner(System.in);
            System.out.print("Input numbers:");
            float numb1,numb2,numb3;
            numb1=od1.nextFloat();
            numb2=od2.nextFloat();
            numb3=od3.nextFloat();
            task1(numb1,numb2,numb3);
        } else if (lq==2) {
            Scanner od1 = new Scanner(System.in);
            Scanner od2 = new Scanner(System.in);
            Scanner od3 = new Scanner(System.in);
            System.out.print("Input numbers:");
            int numb1,numb2,numb3;
            numb1=od1.nextInt();
            numb2=od2.nextInt();
            numb3=od3.nextInt();
            task2(numb1,numb2,numb3);
        } else if (lq==3) {
            Scanner od1 = new Scanner(System.in);
            int numb1;
            numb1=od1.nextInt();
            System.out.println(HTTPError.task3(numb1));
        } else {
            System.out.print("Restart and choose another number, wait for next update of hometask with optional task");
        }
    }
    public static void task1(float od1,float od2,float od3){
        int i,d1;
        d1=0;
        float[] rang={od1,od2,od3};
        for (i=0;i<3;i++) {
            d1=d1+1;
            if ((rang[i]>(-5))&(rang[i]<5)){
                System.out.println(d1+" number in range");
            }
            else {
                System.out.println(d1+" number is not in range");
            }
        }
    }
    public static void task2(int od1,int od2,int od3) {
        int i, max, min;
        int[] minmax = {od1, od2, od3};
        max=minmax[0];
        min=minmax[0];
        for (i = 1; i < 3; i++) {
            if (max<minmax[i]){
                max=minmax[i];
            } else if (min>minmax[i]) {
                min=minmax[i];
            }
            }
        System.out.println("max: "+max+". min: "+min);
        }



    }
