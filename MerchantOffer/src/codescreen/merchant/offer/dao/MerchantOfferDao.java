package codescreen.merchant.offer.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import codescreen.merchant.sale.data.offerdata.OfferRequestData;

/**
 * @author s.krishnan
 * 
 *         Reading Offers from a file.If the file does not exist,then create new
 *         offers and then write it to file.
 *
 */

public class MerchantOfferDao {

	private static final Logger LOGGER = Logger.getLogger(MerchantOfferDao.class.getName());

	public List<OfferRequestData> getAllOffers() {

		List<OfferRequestData> OfferList = null;
		try {
			File file = new File("Offers.dat");
			if (!file.exists()) {
				OfferRequestData Offer = new OfferRequestData("OfferId", "OfferName", new Date(), "OfferDesc");
				OfferList = new ArrayList<OfferRequestData>();
				OfferList.add(Offer);
				saveOfferList(OfferList);
			} else {
				FileInputStream fileStream = new FileInputStream(file);
				ObjectInputStream stream = new ObjectInputStream(fileStream);
				OfferList = (List<OfferRequestData>) stream.readObject();
				stream.close();
			}
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, e.toString(), e);
		} catch (ClassNotFoundException ex) {
			LOGGER.log(Level.SEVERE, ex.toString(), ex);
		}
		return OfferList;
	}

	private void saveOfferList(List<OfferRequestData> OfferList) {
		try {
			File file = new File("Offers.dat");
			FileOutputStream outputStream;
			outputStream = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(outputStream);
			oos.writeObject(OfferList);
			oos.close();
		} catch (FileNotFoundException ex) {
			LOGGER.log(Level.SEVERE, ex.toString(), ex);
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, e.toString(), e);
		}
	}

	/**
	 * @param offerId
	 * @return OfferRequestData
	 * 
	 *         Returning new offer which expires in future time.
	 */
	public OfferRequestData getOfferById(String offerId) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date currentDate = new Date();
		dateFormat.format(currentDate);
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		c.add(Calendar.YEAR, 1);
		c.add(Calendar.MONTH, 1);
		Date currentDatePlusOne = c.getTime();

		return new OfferRequestData(offerId, "offerName", currentDatePlusOne, offerId);

	}
}
