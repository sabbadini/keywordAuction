
public class Advertiser {
	
	public int ID = -1;
	public int countryCode = -1;
	public int bizHourStart = -1;
	public int bizHourEnd = -1;
	public int bizPrimaryType = -1;//0:B2B, 1:B2C
	/* B2B secondary business types:
	 * 0:advertising, marketing, SEO
	 * 1:affiliate marketing
	 * 2:agriculture
	 * 3:automotive
	 * 4:business services
	 * 5:construction & real estate
	 * 6:finance
	 * 7:government & regulated industries
	 * 8:healthcare
	 * 9:legal services
	 * 10:manufacturing
	 * 11:printing & office supplies
	 * 12:technology: commerce
	 * 13:technology: enterprise
	 * 14:telecom, communications, network
	 * 15:transportation & logistics
	 * 16:web hosting and domain registration
	 * 17: other business to business
	 * B2C secondary business types:
	 * 0:adult & gambling
	 * 1:affiliate marketing
	 * 2:antiques & collectables
	 * 3:apparel
	 * 4:automotive
	 * 5:beauty products
	 * 6:books & magazines
	 * 7:careers & classifieds
	 * 8:consumer electronics
	 * 9:consumer packaged goods
	 * 10:dating & personals
	 * 11:education, religion
	 * 12:flowers, gifts, greetings
	 * 13:games (non gambling)
	 * 14:healthcare
	 * 15:home & garden, furniture, art
	 * 16:jewelry, gems, watches
	 * 17:legal services
	 * 18:mass merchants & auctions
	 * 19:music, movies, tv, tickets, media
	 * 20:non-profit
	 * 21:pc hardward & software
	 * 22:personal finance & insurance
	 * 23:real estate
	 * 24:telecommunications & ISP
	 * 25:travel
	 * 26:other business to consumer
	 */
	public int bizSecondaryType = -1;
	public double adBudgetPerMonth = -1;
	public int numAdvertisements = 0;

}
