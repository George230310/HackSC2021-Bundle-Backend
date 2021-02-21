package com.hacksc.bundle.bundleModel;

public class ProfessionalBundle {
	private String facebook;
	private String wechat;
	private String whatsapp;
	private String messenger;
	private String linkedin;
	private String groupme;
	private String venmo;
	private String resume;
	
	public ProfessionalBundle(String facebook, String wechat, String whatsapp, String messenger, String linkedin,
			String groupme, String venmo, String resume) {
		this.facebook = facebook;
		this.wechat = wechat;
		this.whatsapp = whatsapp;
		this.messenger = messenger;
		this.linkedin = linkedin;
		this.groupme = groupme;
		this.venmo = venmo;
		this.resume = resume;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
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

	@Override
	public String toString() {
		return "ProfessionalBundle [" + (facebook != null ? "facebook=" + facebook + ", " : "")
				+ (wechat != null ? "wechat=" + wechat + ", " : "")
				+ (whatsapp != null ? "whatsapp=" + whatsapp + ", " : "")
				+ (messenger != null ? "messenger=" + messenger + ", " : "")
				+ (linkedin != null ? "linkedin=" + linkedin + ", " : "")
				+ (groupme != null ? "groupme=" + groupme + ", " : "") + (venmo != null ? "venmo=" + venmo + ", " : "")
				+ (resume != null ? "resume=" + resume : "") + "]";
	}
}
