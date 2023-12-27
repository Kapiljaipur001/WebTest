package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/webhook")

public class WebHookController {

	@GetMapping("/health")
	public String healthCheck() {
		return "Get Request";
	}
	
	@PostMapping("/healthPost")
	public String healthCheckPost() {
		return "Post Request";
	}
//
//	@PostMapping("/**")
//    public String handleWebhook(@RequestBody Object payload) {
//		System.out.println(payload);	
//		return "Success";
//	}

	// HIP initiated linking of health records

//	@PostMapping("/v0.5/users/auth/on-fetch-modes")
//	public String onFetchMode(@RequestHeader("X-HIP-ID") String xHip, @RequestBody OnFetchDto payload) {
//		System.out.println(payload.toString());
//		System.out.println("X-HIP-ID" + xHip);
//		return "Success";
//	}
//
//	@PostMapping("/v0.5/users/auth/on-init")
//	public String onInit(@RequestHeader("X-HIP-ID") String xHip, @RequestBody OnInitDto payload) {
//		System.out.println(payload.toString());
//		System.out.println("X-HIP-ID" + xHip);
//		return "Success";
//	}
//
//	@PostMapping("/v0.5/users/auth/on-confirm")
//	public String onConfirm(@RequestHeader("X-HIP-ID") String xHip, @RequestBody OnConfirm payload) {
//		System.out.println(payload.toString());
//		System.out.println("X-HIP-ID" + xHip);
//		return "Success";
//	}
//
//	@PostMapping("/v0.5/users/auth/notify")
//	public String authNotify(@RequestHeader("X-HIP-ID") String xHip, @RequestBody AuthNotifyDto payload) {
//		System.out.println(payload.toString());
//		System.out.println("X-HIP-ID" + xHip);
//		return "Success";
//	}
//
//	@PostMapping("/v0.5/links/link/on-add-contexts")
//	public String linkOnDiscover(@RequestHeader("X-HIP-ID") String xHip, @RequestBody AuthNotifyDto payload) {
//		System.out.println(payload.toString());
//		System.out.println("X-HIP-ID" + xHip);
//		return "Success";
//	}
//
//	// User-initiated discovery & linking of health records
//	@PostMapping("/v0.5/care-contexts/discover")
//	public String careOnDiscover(@RequestHeader("X-HIP-ID") String xHip, @RequestBody CareContextsDiscoverDto payload) {
//		System.out.println(payload.toString());
//		System.out.println("X-HIP-ID" + xHip);
//		return "Success";
//	}
//
//	@PostMapping("/v0.5/links/link/init")
//	public String linkOnInit(@RequestHeader("X-HIP-ID") String xHip, @RequestBody LinksLinkInitDto payload) {
//		System.out.println(payload.toString());
//		System.out.println("X-HIP-ID" + xHip);
//		return "Success";
//	}
//
//	@PostMapping("/v0.5/links/link/confirm")
//	public String linkOnConfirm(@RequestHeader("X-HIP-ID") String xHip, @RequestBody LinksLinkConfirmDto payload) {
//		System.out.println(payload.toString());
//		System.out.println("X-HIP-ID" + xHip);
//		return "Success";
//	}
//
//	// Consent Flow
//	@PostMapping("/v0.5/consents/hip/notify")
//	public String consentHipNotify(@RequestHeader("X-HIP-ID") String xHip, @RequestBody ConsentHipNotifyDto payload) {
//		System.out.println(payload.toString());
//		System.out.println("X-HIP-ID" + xHip);
//		return "Success";
//	}
//
//	// Data Request and Transfer
//	@PostMapping("/v0.5/health-information/hip/request")
//	public String healthInformationHipRequest(@RequestHeader("X-HIP-ID") String xHip,
//			@RequestBody HealthInformationHipRequestDto payload) {
//		System.out.println(payload.toString());
//		System.out.println("X-HIP-ID" + xHip);
//		return "Success";
//	}
//
//	// HIP initiated notification for new health records ( when ABHA address is NOT
//	// available with HIP)
//	@PostMapping("/v0.5/patients/status/on-notify")
//	public String patientStatusOnNotify(@RequestHeader("X-HIP-ID") String xHip,
//			@RequestBody PatientStatusOnNotifyDto payload) {
//		System.out.println(payload.toString());
//		System.out.println("X-HIP-ID" + xHip);
//		return "Success";
//	}
//
//	// HIP initiated notification for new health records in already linked care
//	// context
//	@PostMapping("/v0.5/links/context/on-notify")
//	public String linksContextOntify(@RequestHeader("X-HIP-ID") String xHip,
//			@RequestBody LinksContextOnOntifyDto payload) {
//		System.out.println(payload.toString());
//		System.out.println("X-HIP-ID" + xHip);
//		return "Success";
//	}
//
//	// Share Profile
//	@PostMapping("/v1.0/patients/profile/share")
//	public String profileSare(@RequestHeader("X-HIP-ID") String xHip, @RequestBody ProfileSareDto payload) {
//		System.out.println(payload.toString());
//		System.out.println("X-HIP-ID" + xHip);
//		return "Success";
//	}

}