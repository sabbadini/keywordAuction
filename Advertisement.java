
public class Advertisement {
	
	public int advertiserID = -1;
	
	public String[] keywords = null;
	public double scoreAuthority = -1;//(0,1)
	public double scoreBrand = -1;//(0,1)
	public double scoreConcise = -1;//(0,1)
	public double scoreCreative = -1;//(0,1)
	public double scoreRelevance = -1;//(0,1)
	public int clicks = -1;
	public int impressions = -1;
	public double CTR = -1;//click through rate = clicks/impressions
	public double eCTR = -1;//expected click through rate; (0,1)
	public int bidRank = -1;
	public double bidPrice = -1;//price advertiser bids
	public double secondPrice = -1;//price advertiser pays, which equals Max($0.05,bid price of next highest bidder)
	public double eROI = -1;//expected return on impression = eCTR*secondPrice
	public double eCPM = -1;//expected cost per mille = eROI*1000
	public int inventoryRank = -1;//1 = top position, 2 = second to top, etc.

}
