package playground;

public class RotateArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr,3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotate(int[] nums, int k){
       for(int i = 0; i < k; i++)
       {
           int temp = nums[nums.length - i];
           nums[i + 1] = nums[i];
       }
    }
}