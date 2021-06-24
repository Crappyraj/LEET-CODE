
public class Running_Sum_of_1d_Array_1480 {
	 public int[] runningSum(int[] nums) {
	        // loop will run from 1 as we need not to display 0th index as it is
	        for(int i=1;i<nums.length;i++)
	        {
	            nums[i]+=nums[i-1];
	            
	}
	        return nums;
	        
	    }
	}
	// Time:0(n)
	//Space:0(1).as we are updating the same input.

