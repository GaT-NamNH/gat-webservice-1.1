package com.gat.book.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "UserInfo")
public class UserInfo extends AbstractGatEntity {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "UserID", unique = true)
	protected Integer userId;
	@Column(name = "Name")
	protected String name;
	@Column(name = "Email")
	protected String email;
	@JsonIgnore
	@Column(name = "Password")
	protected String password;
	@Column(name = "FirebasePassword")
	protected String firebasePassword;
	@JsonIgnore
	@Column(name = "FacebookID")
	protected String faceBookId;
	@Column(name = "FacebookName")
	protected String faceBookName;
	@JsonIgnore
	@Column(name = "GoogleID")
	protected String googleId;
	@Column(name = "GoogleName")
	protected String googleName;
	@JsonIgnore
	@Column(name = "TwitterID")
	protected String twitterId;
	@Column(name = "TwitterName")
	protected String twitterName;
	@Column(name = "PasswordFlag")
	protected Integer passwordFlag;
	@Column(name = "UserTypeFlag")
	protected Integer userTypeFlag;
	@Column(name = "DeleteFlag")
	protected Integer deleteFlag;
	@Column(name = "imageID")
	protected String imageID;
	@Column(name = "BackgroundImageID")
	protected String backgroundImageId;

	public UserInfo() {
	}

	public UserInfo(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirebasePassword() {
		return firebasePassword;
	}

	public void setFirebasePassword(String firebasePassword) {
		this.firebasePassword = firebasePassword;
	}

	public String getFaceBookId() {
		return faceBookId;
	}

	public void setFaceBookId(String faceBookId) {
		this.faceBookId = faceBookId;
	}

	public String getFaceBookName() {
		return faceBookName;
	}

	public void setFaceBookName(String faceBookName) {
		this.faceBookName = faceBookName;
	}

	public String getGoogleId() {
		return googleId;
	}

	public void setGoogleId(String googleId) {
		this.googleId = googleId;
	}

	public String getGoogleName() {
		return googleName;
	}

	public void setGoogleName(String googleName) {
		this.googleName = googleName;
	}

	public String getTwitterId() {
		return twitterId;
	}

	public void setTwitterId(String twitterId) {
		this.twitterId = twitterId;
	}

	public String getTwitterName() {
		return twitterName;
	}

	public void setTwitterName(String twitterName) {
		this.twitterName = twitterName;
	}

	public Integer getPasswordFlag() {
		return passwordFlag;
	}

	public void setPasswordFlag(Integer passwordFlag) {
		this.passwordFlag = passwordFlag;
	}

	public String getImageID() {
		return imageID == null ? "" : imageID;
	}

	public void setImageID(String imageID) {
		this.imageID = imageID;
	}

	public Integer getUserTypeFlag() {
		return userTypeFlag;
	}

	public void setUserTypeFlag(Integer userTypeFlag) {
		this.userTypeFlag = userTypeFlag;
	}

	public Integer getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getBackgroundImageId() {
		return backgroundImageId;
	}

	public void setBackgroundImageId(String backgroundImageId) {
		this.backgroundImageId = backgroundImageId;
	}

}
