package com.venky.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Amazon {
	@Id
	public int cid;
	public String cname;
	public long mno;
	public String pname;
	public double price;
	public int quantity;
	public double total;
	public double discount;
	public double gst;
	public double invoice_bill;
	public Amazon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Amazon(int cid, String cname, long mno, String pname, double price, int quantity, double total,
			double discount, double gst, double invoice_bill) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mno = mno;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.discount = discount;
		this.gst = gst;
		this.invoice_bill = invoice_bill;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getMno() {
		return mno;
	}
	public void setMno(long mno) {
		this.mno = mno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getInvoice_bill() {
		return invoice_bill;
	}
	public void setInvoice_bill(double invoice_bill) {
		this.invoice_bill = invoice_bill;
	}
	@Override
	public String toString() {
		return "Amazon [cid=" + cid + ", cname=" + cname + ", mno=" + mno + ", pname=" + pname + ", price=" + price
				+ ", quantity=" + quantity + ", total=" + total + ", discount=" + discount + ", gst=" + gst
				+ ", invoice_bill=" + invoice_bill + "]";
	}
	
	
	

}
