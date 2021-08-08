package com.relevel.backend.outlook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OutlookController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

