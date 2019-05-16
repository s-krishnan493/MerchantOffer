package codescreen.merchant.sale.data.offerdata;

import java.util.Date;

public class OfferResponseData {

	private int id;
	private String type;
	private Date offerExpiryDate;
	private String offerDescription;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
