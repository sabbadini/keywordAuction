
public class User {
	
	public int ID = -1;
	
	//history data
	public String[] keywordHist = null;
	public double[] spendHist = null;
	
	//session data
	public String keyword = null;
	public int countryCode = -1;
	public int hour = -1;
	public int browserCode = -1;
	public double spending = -1;
	public int[] navigationHistory = null;//contains "pseudo" IP addresses of prior sites (0, 1, 2, etc. depending on data) for Markov Chain analysis

	//demographic data -> predicted profile | history, session data
	public int sex = -1;//0:female, 1:male
	public int race = -1;//0:Asian, 1:Black, 2:Hispanic, 3:White
	public double income = -1;
	public double wealth = -1;
	public int occupation = -1;
	
}
