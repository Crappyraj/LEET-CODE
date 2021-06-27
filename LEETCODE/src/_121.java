
public class _121 {
	    public int maxProfit(int[] prices) {
	        int minSofar=prices[0];
	        int maxPro=0;
	        for(int i=0;i<prices.length;i++)
	        {
	            if(minSofar>prices[i])
	            minSofar=prices[i];
	                int profit=prices[i]-minSofar;
	            maxPro=Math.max(maxPro,profit);
	        }
	        return maxPro;
	        
	        
	    }
	}
