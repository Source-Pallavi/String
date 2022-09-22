package leetcode.arrays;

public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {if(nums == null || nums.length == 0)
            return 0;

    int start =0,end =0,sum =0, min = Integer.MAX_VALUE;

        while(end < nums.length)
    {
        sum += nums[end++];

        while(sum >= target)
        {
            min = Math.min(min , end-start);
            sum = sum - nums[start++];
        }
    }

        if(min != Integer.MAX_VALUE)
            return min;
        else
                return 0;}
       /* int length=0;
        int sum=0;
        int temp=0;

        for(int i=0;i<nums.length;i++){
            sum=nums[i];
            System.out.println("sum "+sum);
            if(nums[i]==target)
                return 1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==target)
                    return 1;
                //  System.out.println(sum);
                sum=sum+nums[j];
                System.out.println("sum="+sum+" length= "+(j-i));
                if(sum>=temp)
                {
                    if(length>(j-i)) {
                        length = j - i;
                        temp = sum;
                    }
                  System.out.println("temp "+temp);
                }
            }
        }
        // System.out.println(length);
        return length;*/


    public static void main(String[] args) {
        System.out.println( minSubArrayLen(11, new int[]{1,2,3,4,5}));

    }
}
