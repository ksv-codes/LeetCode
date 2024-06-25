public class Solution {
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] crr= {1,2,3,4,5,6,7};
        rotate(crr,5);
    }
}
