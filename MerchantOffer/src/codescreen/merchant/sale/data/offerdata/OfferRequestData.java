package codescreen.merchant.sale.data.offerdata;

import java.io.Serializable;
import java.util.Date;

import javax.json.bind.annotation.JsonbProperty;

/**
 * 
 */
public class OfferRequestData implements Serializable {

	private static final long serialVersionUID = 1L;
	@JsonbProperty("id")
	private int id;
	@JsonbProperty("name")
	private String name;
	@JsonbProperty("type")
	private String type;
	@JsonbProperty("offerExpiryDate")
	private Date offerExpiryDate;
	@JsonbProperty("offerDescription")
	private String offerDescription;

	public OfferRequestData(int id, String name, String type, Date offerExpiryDate, String offerDescription) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.offerExpiryDate = offerExpiryDate;
		this.offerDescription = offerDescription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return type;
	}

	public void setProfession(String profession) {
		this.type = profession;
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
