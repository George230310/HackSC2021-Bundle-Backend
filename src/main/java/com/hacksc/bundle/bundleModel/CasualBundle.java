package com.hacksc.bundle.bundleModel;

public class CasualBundle {
	private String instagram;
	private String snapchat;
	private String tiktok;
	private String onlyfans;
	private String reddit;
	
	public CasualBundle(String instagram, String snapchat, String tiktok, String onlyfans, String reddit) {
		this.instagram = instagram;
		this.snapchat = snapchat;
		this.tiktok = tiktok;
		this.onlyfans = onlyfans;
		this.reddit = reddit;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
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

	public String getReddit() {
		return reddit;
	}

	public void setReddit(String reddit) {
		this.reddit = reddit;
	}

	@Override
	public String toString() {
		return "CasualBundle [" + (instagram != null ? "instagram=" + instagram + ", " : "")
				+ (snapchat != null ? "snapchat=" + snapchat + ", " : "")
				+ (tiktok != null ? "tiktok=" + tiktok + ", " : "")
				+ (onlyfans != null ? "onlyfans=" + onlyfans + ", " : "") + (reddit != null ? "reddit=" + reddit : "")
				+ "]";
	}
}
