package gameOdev.entities.concretes;

import gameOdev.entities.abstracts.Entity;

public class Sales  implements Entity{
	
	private int id;
	private String name;
	private String categoryId;
	private String productName;
	private double unitPrice;
	
	public Sales () {
		
	}
	
	public Sales(int id, String name, String categoryId, String productName, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		
		
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
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	

}
