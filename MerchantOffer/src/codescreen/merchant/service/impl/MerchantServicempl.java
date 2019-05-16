package codescreen.merchant.service.impl;

import java.util.List;

import codescreen.merchant.offer.service.MerchantService;
import codescreen.merchant.sale.data.offerdata.OfferRequestData;

public class MerchantServicempl implements MerchantService {

	@Override
	public boolean isOfferExpired(String offerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<OfferRequestData> getActiveOffers(String offerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OfferRequestData> getAvailableOffers(String offerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelOffer(String OfferId) {
		// TODO Auto-generated method stub

	}

}
