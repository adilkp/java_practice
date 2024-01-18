import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc  = new Scanner(System.in);

        int[] arr = new int[100];
        int n = sc.nextInt();
        for(int i = 0; i< n; i++) {
            arr[i] = sc.nextInt();
        }

        display(n, arr);

        //Delete from end

        if(n>=1) {
            arr[n-1]=0;
            n--;
        }
        display(n,arr);

        //Insert 15 in the end

        if(n<100) {
            arr[n] = 15;
            n++;
        }
        display(n,arr);

        //insert 25 in the beginning

        if(n<98) {
            n++;
            int t;
            for(int i=n-1;i>=1;i--) {
                t = arr[i-1];
                arr[i] = t;
            }
            arr[0]=25;
        }
        display(n,arr);
    }

    private static void display(int n, int[] arr) {
        System.out.println();
        for(int i = 0; i< n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}