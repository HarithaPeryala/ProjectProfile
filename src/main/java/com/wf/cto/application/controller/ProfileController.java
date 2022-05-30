package com.wf.cto.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wf.cto.application.utils.Profiles;

@RestController
public class ProfileController {
	
	@GetMapping(value="getprofile")
	public String getProfile(@RequestParam String projectID) {
		if(projectID.equalsIgnoreCase("CIWAT")) {
			return Profiles.ProfileType.DBSENSITIVE.name();
		} else if(projectID.equalsIgnoreCase("DCTRN")) {
			return Profiles.ProfileType.NETWORKSENSITIVE.name();
		}
		return Profiles.ProfileType.DEFAULT.name();
	}

}