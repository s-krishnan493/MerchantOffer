package codescreen.merchant.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import codescreen.merchant.offer.dao.MerchantOfferDao;
import codescreen.merchant.offer.service.MerchantService;
import codescreen.merchant.sale.data.offerdata.OfferRequestData;

public class MerchantServicempl implements MerchantService {

	private static final Logger LOGGER = Logger.getLogger(MerchantServicempl.class.getName());

	@Resource(name = "merchantOfferDao")
	private MerchantOfferDao merchantOfferDao;

	@Override
	public boolean isOfferExpired(String offerId) {
		Date currentDate = getCurrentDate();
		return merchantOfferDao.getOfferById(offerId).getOfferExpiryDate().after(currentDate);
	}

	@Override
	public List<OfferRequestData> getActiveOffers() {
		Date currentDate = getCurrentDate();
		return merchantOfferDao.getAllOffers().stream().filter(offer -> offer.getOfferExpiryDate().after(currentDate))
				.collect(Collectors.toList());
	}

	private Date getCurrentDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date currentDate = new Date();
		dateFormat.format(currentDate);
		return currentDate;
	}

	@Override
	public List<OfferRequestData> getAvailableOffers() {
		return merchantOfferDao.getAllOffers();
	}

	@Override
	public void cancelOffer(String OfferId) {
		LOGGER.log(Level.INFO, "Offer Canceled successfully");
	}

	@Override
	public void createOffer(OfferRequestData offerRequestData) {
		LOGGER.log(Level.INFO, "Offer Created successfully");		
	}

}
