package com.dnb.DevConnector.dto;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
@Entity
@Table
public class UserProfile {
	
	@Id
	UUID uuid; //= UUID.randomUUID();
	@Column(nullable = false)
	private String select_professional_status;
	private String company;
	private String website;
	private String location;
	@Column(nullable = false)
	private String skills;
	private String github_username;
	private String bio;
	@Column(nullable = true)
	private boolean social_network_links;
	private String twitter_url;
	private String facebook_url;
	private String youTube_url;
	private String linkedIn_url;
	private String instagram_url;
	public void setSelect_professional_status(String select_professional_status) {
		this.select_professional_status = select_professional_status;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public void setGithub_username(String github_username) {
		this.github_username = github_username;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public boolean setSocial_network_links(boolean social_network_links) {
		this.social_network_links = social_network_links;
		return true;
	}
	public void setTwitter_url(String twitter_url) {
		this.twitter_url = twitter_url;
	}
	public void setFacebook_url(String facebook_url) {
		this.facebook_url = facebook_url;
	}
	public void setYouTube_url(String youTube_url) {
		this.youTube_url = youTube_url;
	}
	public void setLinkedIn_url(String linkedIn_url) {
		this.linkedIn_url = linkedIn_url;
	}
	public void setInstagram_url(String instagram_url) {
		this.instagram_url = instagram_url;
	}
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	public UserProfile(UUID uuid,String string1, String string2, String string3, String string4, String string5, String string6,
			String string7, boolean b, String string8, String string9, String string10, String string11,
			String string12) {
		// TODO Auto-generated constructor stub
		this.uuid=uuid;
		this.select_professional_status=string1;
		this.company=string2;
		this.website=string3;
		this.location=string4;
		this.skills=string5;
		this.github_username=string6;
		this.bio=string7;
		this.social_network_links=b;
		this.facebook_url=string8;
		this.instagram_url=string9;
		this.linkedIn_url=string10;
		this.twitter_url=string11;
		this.youTube_url=string12;
		
	}

	
	

	
	
	

}
