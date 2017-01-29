package holiday.web.entities;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
public class CheckoutCart {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)        
    private Integer itemID;
    	
    private Integer optionValue;
       
    private String state;
    
    private String city;
      
    private String year;

	private String country;
  
    private Double price;
  
    @Transient
    public int checkout_id ;

    
    @XmlTransient
    @ManyToOne
    @JoinColumn(name="checkout_id",foreignKey = @ForeignKey(name = "CHECKOUTCART_CHECKOUT"))
    public Checkout checkout;


//	public int getCheckoutId()
//	{
//		checkout_id = checkout.getId();
//		return checkout_id;
//	}


	public Integer getItemID() {
		return itemID;
	}


	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}


	public Integer getOptionValue() {
		return optionValue;
	}


	public void setOptionValue(Integer option) {
		this.optionValue = option;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}	


	public String getState()
	{
		return state;
	}


	public void setState(String state)
	{
		this.state = state;
	}


	public String getCity()
	{
		return city;
	}


	public void setCity(String city)
	{
		this.city = city;
	}


	public String getYear()
	{
		return year;
	}


	public void setYear(String year)
	{
		this.year = year;
	}



	@XmlTransient
	public Checkout getCheckout() {
		return checkout;
	}


	public void setCheckout(Checkout checkout) {
		this.checkout = checkout;
	}
	


}
