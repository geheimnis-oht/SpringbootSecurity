package io.laidani.entities;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table (name = "USERS")
public class User {

	 @Id
	 @GeneratedValue (strategy = GenerationType.AUTO)
	 @Column(name = "USERID")
	 private Long userid;
	 @Column(name = "USERNAME", unique = true, nullable = false)
	 private String username;
	 @Column(name = "FIRSTNAME")
	 private String firstname;
	 @Column(name = "LASTNAME")
	 private String lastname;
	 
	 @CreationTimestamp
	 @Column(name = "CREATION_DATE")
	 private Timestamp creationDate;

	public User(String username, String firstname, String lastname) {
		super();
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	 	 
}
