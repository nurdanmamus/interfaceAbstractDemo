package interfaceAbstractDemo.Entities;

import java.util.Date;
import java.time.LocalDate;

import interfaceAbstractDemo.Abstract.IEntity;

public class Customer implements IEntity {

	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String NationalityId;
	
	
	
	public Customer(String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.NationalityId = nationalityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id; 
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

}
