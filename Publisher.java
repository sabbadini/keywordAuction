
public class Publisher {
	
	public int ID = -1;//0: Google, >1, AdSense publishers
	public boolean banned = false;//if violate policy, banned from AdSense network
	public int numContent = 0;//number of content pages
	public int impressions = -1;//total impressions of all content w/ ads
	public int clicks = -1;//total clicks on ads on all content
	public double CTR = -1;//CTR = clicks/impressions
	public double eCPM = -1;//expected cost per mille of ads displayed on owned content
	public double share = -1;//proportion of AdSense revenue generated on publisher-owned content paid to publisher

}
