import java.util.Random;

/**
 * Q1
 */
public class Q1 
{
    public void swap(long arr[], int i, int j)
    {
        long temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void shuffleArray(int arr[], int n)
    {
        // Your code goes here
        
        Random rd = new  Random();
        
        for(int i=n-1;i>0;i--)
        {
            int idx = rd.nextInt(i+1);
            
            swap(arr,i,idx);
            
        }  
        System.out.println(Arrays.toString(arr));
    }

    public void main(String[] args) 
    {
         
         int[] arr = {1, 2, 3, 4, 5, 6, 7};
         int n = arr.length;
         shuffleArray (arr, n);
    }
}