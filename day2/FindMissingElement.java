package week1.day2;

public class FindMissingElement{
	
	 static int[]arr={1,4,3,2,8,6,7};
     static int n = arr.length;
     
	// Function to find the missing number
    public static void findMissing(int arr[], int N)
    {
        int i;
        int temp[] = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }
        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }
        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        // Function call
        findMissing(arr, n);
    }
}                   
