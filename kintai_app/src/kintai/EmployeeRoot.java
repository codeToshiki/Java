package kintai;

import java.util.Date;

public class EmployeeRoot {

	private int id;

	private String firstName;

	private String lastName;

	private Date birthDay;

	private String address;

	private int sexType;

	private String nearStation;

	private String skillSet;

	private Boolean isGetMarried;

	private Date enrtryDate;

	private Date leftDate;

	private Date updatedDate;

	// getter
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public String getAddress() {
		return address;
	}

	public int getSexType() {
		return sexType;
	}

	public String getNearStation() {
		return nearStation;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public Boolean getIsGetMarried() {
		return isGetMarried;
	}

	public Date getEnrtryDate() {
		return enrtryDate;
	}

	public Date getLeftDate() {
		return leftDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}


	// setter
	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSexType(int sexType) {
		this.sexType = sexType;
	}

	public void setNearStation(String nearStation) {
		this.nearStation = nearStation;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public void setIsGetMarried(Boolean isGetMarried) {
		this.isGetMarried = isGetMarried;
	}

	public void setEnrtryDate(Date enrtryDate) {
		this.enrtryDate = enrtryDate;
	}

	public void setLeftDate(Date leftDate) {
		this.leftDate = leftDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
