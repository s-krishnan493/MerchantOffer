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
	 * @param offerId - offerId to retrieve all active offers
	 */
	List<OfferRequestData> getActiveOffers(String offerId);

	/*
	 * 
	 * @param offerId - offerId to retrieve all available offers
	 */
	List<OfferRequestData> getAvailableOffers(String offerId);

	/*
	 * 
	 * @param offerId - offerId to cancel oder
	 */
	void cancelOffer(String OfferId);

}
