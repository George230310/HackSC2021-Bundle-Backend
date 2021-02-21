package com.hacksc.bundle.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="users", uniqueConstraints = {@UniqueConstraint(name = "username_unique", columnNames = "username")})
public class User {
	@Id
	@SequenceGenerator(
			name="user_sequence",
			sequenceName= "user_sequence",
			allocationSize=1
	)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="user_sequence"
	)
	@Column(
			name="id",
			nullable=false,
			updatable=false
	)
	private Long id;

	@Column(
			name="username",
			nullable=false,
			columnDefinition="TEXT"
	)
	private String username;
	
	@Column(
			name="fname",
			nullable=false,
			columnDefinition="TEXT"
	)
	private String fname;
	
	@Column(
			name="lname",
			nullable=false,
			columnDefinition="TEXT"
	)
	private String lname;
	
	@Column(
			name="password",
			nullable=false,
			columnDefinition="TEXT"
	)
	private String password;
	
	@Column(
			name="email",
			columnDefinition="TEXT"
	)
	private String email;
	
	@Column(
			name="phone",
			columnDefinition="TEXT"
	)
	private String phone;
	
	@Column(
			name="instagram",
			columnDefinition="TEXT"
	)
	private String instagram;
	
	@Column(
			name="facebook",
			columnDefinition="TEXT"
	)
	private String facebook;
	
	@Column(
			name="snapchat",
			columnDefinition="TEXT"
	)
	private String snapchat;
	
	@Column(
			name="tiktok",
			columnDefinition="TEXT"
	)
	private String tiktok;
	
	@Column(
			name="onlyfans",
			columnDefinition="TEXT"
	)
	private String onlyfans;
	
	@Column(
			name="wechat",
			columnDefinition="TEXT"
	)
	private String wechat;
	
	@Column(
			name="whatsapp",
			columnDefinition="TEXT"
	)
	private String whatsapp;
	
	@Column(
			name="messenger",
			columnDefinition="TEXT"
	)
	private String messenger;
	
	@Column(
			name="reddit",
			columnDefinition="TEXT"
	)
	private String reddit;
	
	@Column(
			name="linkedin",
			columnDefinition="TEXT"
	)
	private String linkedin;
	
	@Column(
			name="groupme",
			columnDefinition="TEXT"
	)
	private String groupme;
	
	@Column(
			name="venmo",
			columnDefinition="TEXT"
	)
	private String venmo;
	
	@Column(
			name="resume",
			columnDefinition="TEXT"
	)
	private String resume;
	
	public User()
	{
		
	}
	
	public User(String username, String password, String fname, String lname)
	{
		this.username = username;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
	}
	
	public User(Long id, String username, String fname, String lname, String password, String email, String phone,
			String instagram, String facebook, String snapchat, String tiktok, String onlyfans, String wechat,
			String whatsapp, String messenger, String reddit, String linkedin, String groupme,
			String venmo, String resume) {
		this.id = id;
		this.username = username;
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.instagram = instagram;
		this.facebook = facebook;
		this.snapchat = snapchat;
		this.tiktok = tiktok;
		this.onlyfans = onlyfans;
		this.wechat = wechat;
		this.whatsapp = whatsapp;
		this.messenger = messenger;
		this.reddit = reddit;
		this.linkedin = linkedin;
		this.groupme = groupme;
		this.venmo = venmo;
		this.resume = resume;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getSnapchat() {
		return snapchat;
	}
	public void setSnapchat(String snapchat) {
		this.snapchat = snapchat;
	}
	public String getTiktok() {
		return tiktok;
	}
	public void setTiktok(String tiktok) {
		this.tiktok = tiktok;
	}
	public String getOnlyfans() {
		return onlyfans;
	}
	public void setOnlyfans(String onlyfans) {
		this.onlyfans = onlyfans;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public String getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	public String getMessenger() {
		return messenger;
	}
	public void setMessenger(String messenger) {
		this.messenger = messenger;
	}
	public String getReddit() {
		return reddit;
	}
	public void setReddit(String reddit) {
		this.reddit = reddit;
	}
	public String getLinkedin() {
		return linkedin;
	}
	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}
	public String getGroupme() {
		return groupme;
	}
	public void setGroupme(String groupme) {
		this.groupme = groupme;
	}
	public String getVenmo() {
		return venmo;
	}
	public void setVenmo(String venmo) {
		this.venmo = venmo;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "User [" + (id != null ? "id=" + id + ", " : "")
				+ (username != null ? "username=" + username + ", " : "")
				+ (fname != null ? "fname=" + fname + ", " : "") + (lname != null ? "lname=" + lname + ", " : "")
				+ (password != null ? "password=" + password + ", " : "")
				+ (email != null ? "email=" + email + ", " : "") + (phone != null ? "phone=" + phone + ", " : "")
				+ (instagram != null ? "instagram=" + instagram + ", " : "")
				+ (facebook != null ? "facebook=" + facebook + ", " : "")
				+ (snapchat != null ? "snapchat=" + snapchat + ", " : "")
				+ (tiktok != null ? "tiktok=" + tiktok + ", " : "")
				+ (onlyfans != null ? "onlyfans=" + onlyfans + ", " : "")
				+ (wechat != null ? "wechat=" + wechat + ", " : "")
				+ (whatsapp != null ? "whatsapp=" + whatsapp + ", " : "")
				+ (messenger != null ? "messenger=" + messenger + ", " : "")
				+ (reddit != null ? "reddit=" + reddit + ", " : "")
				+ (linkedin != null ? "linkedin=" + linkedin + ", " : "")
				+ (groupme != null ? "groupme=" + groupme + ", " : "") + (venmo != null ? "venmo=" + venmo + ", " : "")
				+ (resume != null ? "resume=" + resume : "") + "]";
	}
}
