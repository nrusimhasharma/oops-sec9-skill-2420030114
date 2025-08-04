import java.util.*;
public class arraysumavg
{
    public static void main(String[] args ){

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        int avg=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            sum += arr[i];

        }
        for(int i=0;i<n;i++){
            System.out.println();
        }
        System.out.println(sum);
        avg=sum/n;
        System.out.println(avg);


    }
}
