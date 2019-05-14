package codescreen.merchant.offer.dao;

import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException;  
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream; 
import java.util.ArrayList; 
import java.util.List;

import codescreen.merchant.sale.offer.Offer; 

public class MerchantOfferDao {
	 public List<Offer> getAllOffers(){ 
	      
	      List<Offer> OfferList = null; 
	      try { 
	         File file = new File("Offers.dat"); 
	         if (!file.exists()) { 
	            Offer Offer = new Offer(1, "Mahesh", "Teacher"); 
	            OfferList = new ArrayList<Offer>(); 
	            OfferList.add(Offer); 
	            saveOfferList(OfferList); 
	         } 
	         else{ 
	            FileInputStream fis = new FileInputStream(file); 
	            ObjectInputStream ois = new ObjectInputStream(fis); 
	            OfferList = (List<Offer>) ois.readObject(); 
	            ois.close(); 
	         } 
	      } catch (IOException e) { 
	         e.printStackTrace(); 
	      } catch (ClassNotFoundException e) { 
	         e.printStackTrace(); 
	      }   
	      return OfferList; 
	   } 
	   private void saveOfferList(List<Offer> OfferList){ 
	      try { 
	         File file = new File("Offers.dat"); 
	         FileOutputStream fos;  
	         fos = new FileOutputStream(file); 
	         ObjectOutputStream oos = new ObjectOutputStream(fos); 
	         oos.writeObject(OfferList); 
	         oos.close(); 
	      } catch (FileNotFoundException e) { 
	         e.printStackTrace(); 
	      } catch (IOException e) { 
	         e.printStackTrace(); 
	      } 
	   }    
}
