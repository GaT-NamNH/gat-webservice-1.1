package com.gat.book.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserLoginInfo")
public class UserLoginInfo extends AbstractGatEntity {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "LoginID", unique = true)
	protected Integer loginId;
	@Column(name = "UserID")
	protected Integer userId;
	@Column(name = "FirebaseToken")
	protected String firebaseToken;
	@Column(name = "UuID")
	protected String uuid;
	@Column(name = "AcceptLanguage")
	protected String acceptLanguage;

	public UserLoginInfo(Integer loginId) {
		this.loginId = loginId;
	}

	public Integer getLoginId() {
		return loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirebaseToken() {
		return firebaseToken;
	}

	public void setFirebaseToken(String firebaseToken) {
		this.firebaseToken = firebaseToken;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getAcceptLanguage() {
		return acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
	}

}
