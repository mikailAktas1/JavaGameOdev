package gameOdev.entities.concretes;

import gameOdev.entities.abstracts.Entity;

public class Player implements Entity {
	private int id;
	private int PlayerId;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	
	public Player() {
		
	}

	public Player(int id, int playerId, String firstName, String lastName, int dateOfBirth) {
		super();
		this.id = id;
		PlayerId = playerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlayerId() {
		return PlayerId;
	}

	public void setPlayerId(int playerId) {
		PlayerId = playerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	

}
