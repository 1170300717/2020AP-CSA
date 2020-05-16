
public class TargetIntegers {
	/**
	 * return Simulated user input
	 * @return
	 */
    public static int getInt() {
    	return 0;
    }
    
    /**
     * return true if x is a target number
     * @param x
     * @return
     */
    public static boolean isTarget(int x) {
    	return true;
    }
    
    /**
     * analysis sampleSize values obtained using the getInt method
     * @param simpleSize
     * @return
     */
    public static boolean runSimulation(int sampleSize) {
    	int count=0;
    	int nocount=0;
    	for (int i=0;i<sampleSize/2;i++)
    	{
    		if(isTarget(i))
    			count++;
    	}
    	for (int i=sampleSize/2;i<sampleSize;i++)
    	{
    		if(isTarget(i))
    			nocount++;
    	}
    	if(count>nocount)
    	return true;
    	else
    		return false;
    }
}
