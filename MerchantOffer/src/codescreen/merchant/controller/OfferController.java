package codescreen.merchant.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import codescreen.merchant.offer.dao.MerchantOfferDao;
import codescreen.merchant.sale.data.offerdata.OfferRequestData;

@Path("/Offer")
public class OfferController extends AbstractOfferController {

	@Resource
	MerchantOfferDao offerDao;
	
	
	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_XML)
	public List<OfferRequestData> getAvailableOffers() {
		return offerDao.getAllOffers();
	}
	
	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_XML)
	public List<OfferRequestData> getActiveOffers() {
		return offerDao.getAllOffers();
	}
}
