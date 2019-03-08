package com.howtodoinjava.emp.vo;

public class Employee {
private String id;
private String name;
private String deptid;
private String fullName;
private String email;
//private String skillName;
//private String experienceInYears;
//private String proficiency;

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

/*public String getSkillName() {
	return skillName;
}
public void setSkillName(String skillName) {
	this.skillName = skillName;
}
public String getExperienceInYears() {
	return experienceInYears;
}
public void setExperienceInYears(String experienceInYears) {
	this.experienceInYears = experienceInYears;
}
public String getProficiency() {
	return proficiency;
}
public void setProficiency(String proficiency) {
	this.proficiency = proficiency;
}*/
public String getDeptid() {
	return deptid;
}
public void setDeptid(String deptid) {
	this.deptid = deptid;
}


}
