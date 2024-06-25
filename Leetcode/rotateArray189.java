public class rotateArray189 {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        int[] res = new int[arr.length];
        int n = arr.length;
        int k = 5;
        //{3,4,5,6,7,1,2}
        for (int i = (n-k); i < n; i++) {
            for (int j = i-2; j < i-1; j++) {
                res[j]=arr[i];
                
            }
        }
        for (int i = 0; i < n-k; i++) {//i=0,1
            for (int j = i+k; j<i+(k+1) ; j++) {//j=5,6
                res[j]=arr[i];

            }
        }
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
}
