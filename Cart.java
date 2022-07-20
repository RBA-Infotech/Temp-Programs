package com.hibernat.HibernatPrgm;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Cart {

	@Id
	@Column(name = "Cart_Id")
	private int cartId;
	
	private String cartName;
	
	@Column(name = "Item_No")
	private int itemNo;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name ="Item_No", insertable =  false, updatable = false)
	private Set<Items> items;

	public Cart(int cartId, String cartName) {
		this.cartId = cartId;
		this.cartName = cartName;
	}

	
	public Set<Items> getItems() {
		return items;
	}
	
	public void setItems(Set<Items> items) {
		this.items = items;
	}


	public int getItemNo() {
		return itemNo;
	}


	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

}
