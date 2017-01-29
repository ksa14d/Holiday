package holiday.web.entities;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
	
	public User(){}
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	  
    private String userName;
 
    private String email;
    
    private String contactNo;


    @XmlTransient
    @OneToMany(mappedBy="user")
    private List<Checkout> checkout = new ArrayList<Checkout>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer userId) {
		this.id = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}	
	
	@XmlTransient
	public List<Checkout> getCheckout() {
		return checkout;
	}

	public void setCheckout(List<Checkout> checkout) {
		this.checkout = checkout;
	}

}
