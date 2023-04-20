package com.umang.tym.Pro.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Student {
    
    @Id
    @SequenceGenerator(name="seq",sequenceName="oracle_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotBlank(message = "FirstName is mandatory")
    @Column(name = "firstName")
    @Size(min = 2 ,max = 10,message = "FirstName should be between 2 to 10 characters")
    private String firstName;

    @NotBlank(message = "LastName is mandatory")
    @Column(name = "lastName")
    @Size(min = 2 ,max = 10,message = "LastName should be between 2 to 10 characters")
    private String lastName;
    
    @NotBlank(message = "Email is mandatory")
    @Column(name = "email")
    private String email;

    @Column(name = "phone_no")
//    @Size(min = 10,max = 10,message = "Phone number should be 10 digits")
    private long phoneNo;

    @Column(name = "address")
    @NotBlank(message = "address is mandatory")
    private String address;

    public Student() {}

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
}
