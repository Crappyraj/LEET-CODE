
public class Shuffle_the_Array_1470 {
	 public int[] shuffle(int[] nums, int n) {
	        int[] ans=new int[2*n];
	        int i=0;
	        int j=n;
	        int ind=0;
	        while(i<n)
	        {
	            ans[ind++]=nums[i++];
	            ans[ind++]=nums[j++];
	        }
	        return ans;
	        
	    }
	    
	}
	//time:O(n);
	//space:O(n);


