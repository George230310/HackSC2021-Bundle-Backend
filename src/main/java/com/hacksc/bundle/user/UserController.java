package com.hacksc.bundle.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hacksc.bundle.bundleModel.CasualBundle;
import com.hacksc.bundle.bundleModel.ProfessionalBundle;

@RestController
@RequestMapping(path="api/user")
public class UserController {
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService)
	{
		this.userService = userService;
	}
	
	@GetMapping(path="all")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@GetMapping(path="byusername")
	public User getUserByUsername(@RequestParam(required = true) String username)
	{
		return userService.getUserByUsername(username);
	}
	
	@GetMapping(path="validation")
	public Boolean validateUserPassword(@RequestParam(required=true) String username, @RequestParam String password)
	{
		return userService.validateUserPassword(username, password);
	}
	
	@GetMapping(path="casualbundle")
	public CasualBundle getCasualBundleByUsername(@RequestParam(required = true) String username)
	{
		return userService.getCasualBundleByUsername(username);
	}
	
	@GetMapping(path="probundle")
	public ProfessionalBundle getProBundleByUsername(@RequestParam(required = true) String username)
	{
		return userService.getProBundleByUsername(username);
	}
	
	@PostMapping
	public void addNewUser(@RequestParam(required = true) String username, @RequestParam(required = true) String password,
			@RequestParam(required = true) String fname, @RequestParam(required = true) String lname)
	{
		userService.addNewUser(new User(username, password, fname, lname));
	}
	
	@PutMapping
	public void updateUser(@RequestParam(required = true) String username, @RequestParam(required = false) String email,
			@RequestParam(required = false) String phone, @RequestParam(required = false) String instagram, 
			@RequestParam(required = false) String facebook, @RequestParam(required = false) String snapchat,
			@RequestParam(required = false) String tiktok, @RequestParam(required = false) String onlyfans,
			@RequestParam(required = false) String wechat, @RequestParam(required = false) String whatsapp,
			@RequestParam(required = false) String messenger, @RequestParam(required = false) String reddit,
			@RequestParam(required = false) String linkedin, @RequestParam(required = false) String groupme,
			@RequestParam(required = false) String venmo, @RequestParam(required = false) String resume)
	{
		userService.updateUser(username, email, phone, instagram, facebook, snapchat, tiktok, onlyfans, wechat, whatsapp,
				messenger, reddit, linkedin, groupme, venmo, resume);
	}
}
