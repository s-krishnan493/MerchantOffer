package codescreen.merchant.sale.data.offerdata;

import java.util.Date;

public class OfferResponseData {

	private int id;
	private Date offerExpiryDate;
	private String offerDescription;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getOfferExpiryDate() {
		return offerExpiryDate;
	}

	public void setOfferExpiryDate(Date offerExpiryDate) {
		this.offerExpiryDate = offerExpiryDate;
	}

	public String getOfferDescription() {
		return offerDescription;
	}

	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}

}
