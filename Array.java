import java.util.*;
public class Array{
    //  public Array(int[] a, int n) {
    //  }
    public void Array(int a[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    sum+=a[j];
                }
            }
        }
        System.out.println("Sum of Duplicate Elements are : "+sum);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements :");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
         Array obj=new Array();
         obj.Array(a,n);
         //Array(a,n);
    }
}