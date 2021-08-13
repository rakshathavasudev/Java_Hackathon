package com.example.restapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class User {
    private int id;
    private String firstName;
    private String lastName;

    public User() {
    }

    public User(int id, String firstName, String lastName) {
        this.setId(id); 
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(Integer id) {
		// TODO Auto-generated method stub
		this.id =id;
		
	}
//other setters and getters

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

	
}