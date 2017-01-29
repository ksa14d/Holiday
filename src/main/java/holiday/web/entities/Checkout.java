package holiday.web.entities;



import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement
@Entity
public class Checkout {

	    public Checkout()
	    {
	     	super();
	        setDateTime(LocalDateTime.now().toString());
     	}

		@Id @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;
	  
	    private Integer total;
	    
	    private String DateTime;
	    
	    @XmlTransient
	    @ManyToOne
	    @JoinColumn(name="user_id",foreignKey = @ForeignKey(name = "CHECKOUT_USER"))
	    private User user;
	    
	    @Transient
	    private int user_id ;
	    
	    @XmlTransient
	    @OneToMany(mappedBy="checkout", cascade=CascadeType.ALL)
	    private List<CheckoutCart> checkoutCart = new ArrayList<CheckoutCart>();

	    public String getDateTime()
		{
			return DateTime;
		}

		private void setDateTime(String dateTime)
		{
			DateTime = dateTime;
		}

//		public int getUserId()  // bug<- u
//		{
//	    	user_id =  user.getId();
//	    	return user_id;
//		}

		
		public Integer getId() {
			return id;
		}

		public void setCheckoutId(Integer checkoutId) {
			this.id = checkoutId;
		}

		public Integer getTotal() {
			return total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		 @XmlTransient
		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		@XmlTransient
		public List<CheckoutCart> getCheckoutCart() {
			return checkoutCart;
		}

		public void setCheckoutCart(List<CheckoutCart> checkoutCart) {
			this.checkoutCart = checkoutCart;
		}

	   
	
}
