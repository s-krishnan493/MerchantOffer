package codescreen.merchant.offer.service;

public interface MerchantService {
	
	boolean isOfferExpired();
	
	String getActiveOffers(String offerId);

}
