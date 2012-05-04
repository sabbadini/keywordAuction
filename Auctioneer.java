
public class Auctioneer {

	public static void main(String[] args) {
		
		//users
		int numUsers = 1000;
		//advertisers
		int numAdvertisers = 100;
		int numAdvertisements = 1000;
		int numKeywordsMax = 10;
		int keywordLengthMax = 10;
		int totalKeywords = numAdvertisements*numKeywordsMax;
		//publishers
		int numPublishers = 100;
		int totalContent = 1000;
		int contentKeywordFreqMax = 25;
		int inventorySlotsMax = 10;
		
		User[] users = new User[numUsers];
		Advertiser[] advertisers = new Advertiser[numAdvertisers];
		Advertisement[] advertisements = new Advertisement[numAdvertisements];
		String[] keywordPool = new String[totalKeywords];
		Publisher[] publishers = new Publisher[numPublishers];
		Content[] contentPool = new Content[totalContent];
		
		for(int i=0;i<numUsers;i++){
			User u = new User();
			u.ID = i;
			
			users[i] = u;
		}
		
		for(int i=0;i<numAdvertisers;i++){
			Advertiser a = new Advertiser();
			a.ID = i;
			a.countryCode = (int)Math.round(Math.random()*10);
			a.bizHourStart = (int)Math.round(Math.random()*24);
			if(a.bizHourStart + 8 >= 24){
				a.bizHourEnd = a.bizHourStart - 24 + 8;
			}
			else{
				a.bizHourEnd = a.bizHourStart + 8;
			}
			a.bizPrimaryType = (int)Math.round(Math.random());
			if(a.bizPrimaryType==0){
				a.bizSecondaryType = (int)Math.round(Math.random()*17);
			}
			else{
				a.bizSecondaryType = (int)Math.round(Math.random()*26);
			}
			a.adBudgetPerMonth = Math.random()*1000;
			
			advertisers[i] = a;
		}
		
		char[] characters = new char[26];
		characters[0] = 'a';
		characters[1] = 'b';
		characters[2] = 'c';
		characters[3] = 'd';
		characters[4] = 'e';
		characters[5] = 'f';
		characters[6] = 'g';
		characters[7] = 'h';
		characters[8] = 'i';
		characters[9] = 'j';
		characters[10] = 'k';
		characters[11] = 'l';
		characters[12] = 'm';
		characters[13] = 'n';
		characters[14] = 'o';
		characters[15] = 'p';
		characters[16] = 'q';
		characters[17] = 'r';
		characters[18] = 's';
		characters[19] = 't';
		characters[20] = 'u';
		characters[21] = 'v';
		characters[22] = 'w';
		characters[23] = 'x';
		characters[24] = 'y';
		characters[25] = 'z';
		
		for(int i=0;i<totalKeywords;i++){
			String keyword = "";
			int keywordLength = (int)Math.max(1,Math.round(Math.random()*keywordLengthMax));
			for(int j=0;j<keywordLength;j++){
				String add = new Character(characters[(int)Math.round(Math.random()*25)]).toString();
				keyword = keyword + add;
			}
			
			keywordPool[i] = keyword;
		}
		
		for(int i=0;i<numAdvertisements;i++){
			Advertisement a = new Advertisement();
			a.advertiserID = (int)Math.round(Math.random()*(numAdvertisers-1));
			advertisers[a.advertiserID].numAdvertisements += 1;
			int numKeywords = (int)Math.max(1,Math.round(Math.random()*numKeywordsMax));
			a.keywords = new String[numKeywords];
			for(int j=0;j<numKeywords;j++){
				a.keywords[j] = keywordPool[(int)Math.round(Math.random()*(totalKeywords-1))];
			}
			
			advertisements[i] = a;
		}
		
		for(int i=0;i<numPublishers;i++){
			Publisher p = new Publisher();
			p.ID = i;
			
			publishers[i] = p;
		}
		
		for(int i=0;i<totalContent;i++){
			Content c = new Content();
			c.publisherID = (int)Math.round(Math.random()*(numPublishers-1));
			publishers[c.publisherID].numContent += 1;
			int numKeywords = (int)Math.max(1,Math.round(Math.random()*numKeywordsMax));
			c.keywords = new String[numKeywords];
			for(int j=0;j<numKeywords;j++){
				c.keywords[j] = keywordPool[(int)Math.round(Math.random()*(totalKeywords-1))];
			}
			c.keywordFreq = new int[numKeywords];
			for(int j=0;j<numKeywords;j++){
				c.keywordFreq[j] = (int)Math.round(Math.random()*contentKeywordFreqMax);
			}
			c.inventorySlots = (int)Math.max(1,Math.round(Math.random()*inventorySlotsMax));
			
			contentPool[i] = c;
		}
		
		//keyword auction
		
		//ad assignment
		
		//ad serving
		
		//compute results

	}

}
