package codescreen.merchant.controller;

import java.util.List; 
import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;

import codescreen.merchant.offer.dao.MerchantOfferDao;
import codescreen.merchant.sale.offer.Offer;  
@Path("/UserService")

public class OfferController extends AbstractOfferController {

	MerchantOfferDao offerDao = new MerchantOfferDao();  
	   @GET 
	   @Path("/users") 
	   @Produces(MediaType.APPLICATION_XML) 
	   public List<Offer> getUsers(){ 
	      return offerDao.getAllOffers(); 
	   }  
}