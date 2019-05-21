package codescreen.merchant.offer.service;

import java.util.List;

import codescreen.merchant.sale.data.offerdata.OfferRequestData;

public interface MerchantService {

	/*
	 * 
	 * @param offerId - offerId to identify if offer is active
	 */
	boolean isOfferExpired(String offerId);

	/*
	 * 
	 * retrieve all active offers
	 */
	List<OfferRequestData> getActiveOffers();

	/*
	 * 
	 * retrieve all available offers
	 */
	List<OfferRequestData> getAvailableOffers();

	/*
	 * 
	 * @param offerId - offerId to cancel oder
	 */
	void cancelOffer(String OfferId);

	/*
	 * 
	 * @param offerRequestData - to create new offer
	 */
	void createOffer(OfferRequestData offerRequestData);
}
