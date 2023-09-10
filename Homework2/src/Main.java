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
            Scanner sd1 = new Scanner(System.in);
            Scanner sd2 = new Scanner(System.in);
            Scanner sd3 = new Scanner(System.in);
            int a, b, c;
            System.out.print("Input side 1:");
            a = sd1.nextInt();
            System.out.print("Input side 2:");
            b = sd2.nextInt();
            System.out.print("Input side 3:");
            c = sd3.nextInt();
            areatriagle(a, b, c);
        } else if (lq==2) {
            Scanner sd1 = new Scanner(System.in);
            Scanner sd2 = new Scanner(System.in);
            Scanner sd3 = new Scanner(System.in);
            int a, b, c;
            System.out.print("Input first number:");
            a = sd1.nextInt();
            System.out.print("Input second number:");
            b = sd2.nextInt();
            System.out.print("Input third number:");
            c = sd3.nextInt();
            small(a,b,c);
        } else {
            System.out.print("Restart and choose another number, wait for next update of hometask with optional task");
        }
        }

        public static void areatriagle(int a,int b,int c){
            double area,semiper;
            semiper=0.5*(a+b+c);
            area=Math.sqrt(semiper*(semiper-a)*(semiper-b)*(semiper-c));
            System.out.println("The area of the triagle is "+area);
        }
        public static void small(int a,int b,int c){
        int[] numbers={a,b,c};
        int n=3;
        bubbleSort(numbers,n);
        System.out.println("The smallest number is "+numbers[0]);
        }

    public static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }
    }
        }

