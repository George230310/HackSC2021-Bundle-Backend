package com.hacksc.bundle.user;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hacksc.bundle.bundleModel.CasualBundle;
import com.hacksc.bundle.bundleModel.ProfessionalBundle;

@Service
public class UserService {
	private final UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository)
	{
		this.userRepository = userRepository;
	}
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User getUserByUsername(String username) {
		Optional<User> userOptional = userRepository.findUserByUsername(username);
		
		if(userOptional.isPresent())
		{
			return userOptional.get();
		}
		else
		{
			throw new IllegalStateException("username doesn't exist");
		}
	}

	public void addNewUser(User user) {
		Optional<User> userOptional = userRepository.findUserByUsername(user.getUsername());
		
		if(userOptional.isPresent())
		{
			throw new IllegalStateException("username taken");
		}
		
		userRepository.save(user);
	}
	
	@Transactional
	public void updateUser(String username, String email, String phone, String instagram, String facebook,
			String snapchat, String tiktok, String onlyfans, String wechat, String whatsapp, String messenger,
			String reddit, String linkedin, String groupme, String venmo, String resume) {
		User user = userRepository.findUserByUsername(username).orElseThrow(()-> new IllegalStateException("user doesn't"
				+ " exist"));
		
		if(email != null && email.length() > 0 && !Objects.equals(email, user.getEmail()))
		{
			user.setEmail(email);
		}
		
		if(phone != null && phone.length() > 0 && !Objects.equals(phone, user.getPhone()))
		{
			user.setPhone(phone);
		}
		
		if(instagram != null && instagram.length() > 0 && !Objects.equals(instagram, user.getInstagram()))
		{
			user.setInstagram(instagram);
		}
		
		if(facebook != null && facebook.length() > 0 && !Objects.equals(facebook, user.getFacebook()))
		{
			user.setFacebook(facebook);
		}
		
		if(snapchat != null && snapchat.length() > 0 && !Objects.equals(snapchat, user.getSnapchat()))
		{
			user.setSnapchat(snapchat);
		}
		
		if(tiktok != null && tiktok.length() > 0 && !Objects.equals(tiktok, user.getTiktok()))
		{
			user.setTiktok(tiktok);
		}
		
		if(onlyfans != null && onlyfans.length() > 0 && !Objects.equals(onlyfans, user.getOnlyfans()))
		{
			user.setOnlyfans(onlyfans);
		}
		
		if(wechat != null && wechat.length() > 0 && !Objects.equals(wechat, user.getWechat()))
		{
			user.setWechat(wechat);
		}
		
		if(whatsapp != null && whatsapp.length() > 0 && !Objects.equals(whatsapp, user.getWhatsapp()))
		{
			user.setWhatsapp(whatsapp);
		}
		
		if(messenger != null && messenger.length() > 0 && !Objects.equals(messenger, user.getMessenger()))
		{
			user.setMessenger(messenger);
		}
		
		if(reddit != null && reddit.length() > 0 && !Objects.equals(reddit, user.getReddit()))
		{
			user.setReddit(reddit);
		}
		
		if(linkedin != null && linkedin.length() > 0 && !Objects.equals(linkedin, user.getLinkedin()))
		{
			user.setLinkedin(linkedin);
		}
		
		if(groupme != null && groupme.length() > 0 && !Objects.equals(groupme, user.getGroupme()))
		{
			user.setGroupme(groupme);
		}
		
		if(venmo != null && venmo.length() > 0 && !Objects.equals(venmo, user.getVenmo()))
		{
			user.setVenmo(venmo);
		}
		
		if(resume != null && resume.length() > 0 && !Objects.equals(resume, user.getResume()))
		{
			user.setResume(resume);
		}
	}

	public Boolean validateUserPassword(String username, String password) {
		Optional<User> userOptional = userRepository.findUserByUsername(username);
		
		if(!userOptional.isPresent())
		{
			return Boolean.FALSE;
		}
		
		User user = userOptional.get();
		
		if(!Objects.equals(user.getPassword(), password))
		{
			return Boolean.FALSE;
		}
		else
		{
			return Boolean.TRUE;
		}
	}

	public CasualBundle getCasualBundleByUsername(String username) {
		Optional<User> userOptional = userRepository.findUserByUsername(username);
		
		if(!userOptional.isPresent())
		{
			throw new IllegalStateException("username doesn't exist");
		}
		
		User user = userOptional.get();
		
		return new CasualBundle(user.getInstagram(), 
				user.getSnapchat(), user.getTiktok(), user.getOnlyfans(), user.getReddit());
	}

	public ProfessionalBundle getProBundleByUsername(String username) {
		Optional<User> userOptional = userRepository.findUserByUsername(username);
		
		if(!userOptional.isPresent())
		{
			throw new IllegalStateException("username doesn't exist");
		}
		
		User user = userOptional.get();
		
		return new ProfessionalBundle(user.getFacebook(), user.getWechat(), user.getWhatsapp(), user.getMessenger(),
				user.getLinkedin(), user.getGroupme(), user.getVenmo(), user.getResume());
	}
}
