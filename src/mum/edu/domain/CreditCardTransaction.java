package mum.edu.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class CreditCardTransaction {
    
	@Id
	@GeneratedValue
	@Column(name="creditcard_tra_id")
	private long id;
	private String creditCardNumber;
	private String product;
	private double amountSpent;
	private long receiptNumber;
	private Date purchaseDate;
	private double vendorAmount;
	private double happyCartAmount;
	private double tax;
	
//	@ManyToOne
//	@JoinColumn(name = "CreditCardID")
//	private CreditCard creditCard;
	
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public double getAmountSpent() {
		return amountSpent;
	}
	public void setAmountSpent(double amountSpent) {
		this.amountSpent = amountSpent;
	}
	public long getReceiptNumber() {
		return receiptNumber;
	}
	public void setReceiptNumber(long receiptNumber) {
		this.receiptNumber = receiptNumber;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public double getVendorAmount() {
		return vendorAmount;
	}
	public void setVendorAmount(double vendorAmount) {
		this.vendorAmount = vendorAmount;
	}
	public double getHappyCartAmount() {
		return happyCartAmount;
	}
	public void setHappyCartAmount(double happyCartAmount) {
		this.happyCartAmount = happyCartAmount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
//	public CreditCard getCreditCard() {
//		return creditCard;
//	}
//	public void setCreditCard(CreditCard creditCard) {
//		this.creditCard = creditCard;
//	}
	
	
	
}
