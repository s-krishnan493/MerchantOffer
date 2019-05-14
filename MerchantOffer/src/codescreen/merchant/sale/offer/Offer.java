package codescreen.merchant.sale.offer;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement(name = "user")

public class Offer implements Serializable {

	private static final long serialVersionUID = 1L; 
	   private int id; 
	   private String name; 
	   private String type;  
	   public Offer(){} 
	    
	   public Offer(int id, String name, String profession){  
	      this.id = id; 
	      this.name = name; 
	      this.type = profession; 
	   }  
	   public int getId() { 
	      return id; 
	   }  
	   @XmlElement 
	   public void setId(int id) { 
	      this.id = id; 
	   } 
	   public String getName() { 
	      return name; 
	   } 
	   @XmlElement
	   public void setName(String name) { 
	      this.name = name; 
	   } 
	   public String getProfession() { 
	      return type; 
	   } 
	   @XmlElement 
	   public void setProfession(String profession) { 
	      this.type = profession; 
	   }   
}
