package com.btec.entity;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {
	@Id
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "phoneNumber")
	private String phoneNumber;

	@Column(name = "fullName")
	private String fullName;
	
	@Column(name = "gender", columnDefinition="char(1)")
	private String gender;
	
	@Column(name = "email")
	private String email;

	@Column(name = "dob")
	private Date dob;
	
	@Column(name = "country")
	private String country;

	@Column(name = "role")
	private String role;
	
	@Column(name = "avatar")
	private String avatar;
	
	@Column(name = "status")
	private Integer status;

	@ManyToMany
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "username"), inverseJoinColumns = @JoinColumn(name = "roleId"))
	private List<RoleEntity> roles = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "user_class", joinColumns = @JoinColumn(name = "username"), inverseJoinColumns = @JoinColumn(name = "classId"))
	private Set<ClassEntity> classuser = new HashSet<>();
	
	@OneToMany(mappedBy = "user")
	private List<SubasmEntity> subasmuser = new ArrayList<>();
	
	public Set<ClassEntity> getClassuser() {
		return classuser;
	}

	public void setClassuser(Set<ClassEntity> classuser) {
		this.classuser = classuser;
	}

	public List<SubasmEntity> getSubasmuser() {
		return subasmuser;
	}

	public void setSubasmuser(List<SubasmEntity> subasmuser) {
		this.subasmuser = subasmuser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

}
