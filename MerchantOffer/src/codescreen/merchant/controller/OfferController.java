package codescreen.merchant.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import codescreen.merchant.offer.service.MerchantService;
import codescreen.merchant.sale.data.offerdata.OfferRequestData;
import codescreen.merchant.sale.data.offerdata.OfferResponseData;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.ResponseBody;

@Path("/Offer")
public class OfferController extends AbstractOfferController {

	@Resource
	MerchantService merchantService;

	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public List<OfferRequestData> getAvailableOffers() {
		return merchantService.getAvailableOffers();
	}

	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public List<OfferRequestData> getActiveOffers() {
		return merchantService.getActiveOffers();
	}

	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public OfferResponseData registerOffer(@RequestBody OfferRequestData offerRequestData) {

		merchantService.createOffer(offerRequestData);
		OfferResponseData offerResponse = new OfferResponseData();
		offerResponse.setId(123);
		offerResponse.setOfferDescription("offerDescription");
		offerResponse.setOfferExpiryDate(new Date());
		return offerResponse;
	}

	@DELETE
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteOffer(@PathVariable("offerId") String offerId) {
		merchantService.cancelOffer(offerId);
		return "SUCCESS";
	}
}
