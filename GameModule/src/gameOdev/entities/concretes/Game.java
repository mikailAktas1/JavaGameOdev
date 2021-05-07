package gameOdev.entities.concretes;

import gameOdev.entities.abstracts.Entity;

public class Game  implements Entity{
	
	private int id;
	private int categoryId;
	private String categoryName;
	private String gameName;
	private int unitsInStock;
	private double unitPrice;
	
	public Game() {
		
	}

	public Game(int id, int categoryId, String categoryName, String gameName, int unitsInStock, double unitPrice) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.gameName = gameName;
		this.unitsInStock = unitsInStock;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	

}
