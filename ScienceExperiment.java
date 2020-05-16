import java.util.ArrayList;

public class ScienceExperiment {
    //A list containing the scientist's trial
	private ArrayList<Trail> trialList;
    
	//return the all trial temperature avg
	public double getCompoundAvg(String comp)
	{
		double avg;
		double sum=0;
		int n=0;
		for(Trail i:trialList)
		{
			if(i.getCompound()==comp) {
				n=n+i.getTrialNum();
				sum=sum+i.getTrialNum()*i.getTemp();
			}else
				return -1.0;
				
		}
		avg=sum/n;
		return avg;
	}
	
	/**
	 * return a list of compounds used in trials
	 * @return
	 */
	public ArrayList<String> getCompoundList(){
		ArrayList<String> name =new ArrayList<String>();
		for(Trail i:trialList) {
			name.add(i.getCompound());
		}
		return name;
	}
	
	public String getCompoundWithHighestAvg() {
	  ArrayList<String> name = new ArrayList<String>();
	  name=getCompoundList();
	  double temp=0;
	  String name1 = null;
	  for(String i:name) {
		  for(Trail j:trialList) {
			  if(i==j.getCompound()) {
				  if(getCompoundAvg(i)>temp)
				  {
					  temp=getCompoundAvg(i);
					  name1=i;
				  }
				  
			  }
		  }
			  
	  }
	  return name1;
	 // return "";
	}
}
