package com.citic;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * 
 * @author wuxianxiong
 *
 */

/**
 * @author Administrator
 *
 */
public class User implements Serializable {

	private String userID; // 用户ID
	private String username; // 用户名
	@JsonIgnore
	private String password; // 密码
	private Integer usertype; // 用户类型（0属于超级管理员 拥有所有权限，1属于 物业管理员，2属于普通住户）
	private String registerdate; // 注册时间
	private String communityID; // 小区ID
	private String roomID; // 房屋ID
	private Integer state; // 状态 （0表示下线，1表示在线）
	private String loginRoomid;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
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

	public Integer getUsertype() {
		return usertype;
	}

	public void setUsertype(Integer usertype) {
		this.usertype = usertype;
	}

	public String getRegisterdate() {
		return registerdate;
	}

	public void setRegisterdate(String registerdate) {
		this.registerdate = registerdate;
	}

	public String getCommunityID() {
		return communityID;
	}

	public void setCommunityID(String communityID) {
		this.communityID = communityID;
	}

	public String getRoomID() {
		return roomID;
	}

	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getLoginRoomid() {
		return loginRoomid;
	}

	public void setLoginRoomid(String loginRoomid) {
		this.loginRoomid = loginRoomid;
	}
}
