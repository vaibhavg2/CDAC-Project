//package com.app.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.app.entities.ClubFacilityDetails;
//import com.app.service.ClubFacilityDetailsImpl;
//
//@RestController
//@RequestMapping("/api/clubfacilitydetails")
//@CrossOrigin(origins = "*")
//public class ClubFacilityDetailsController {
//
//	@Autowired
//	ClubFacilityDetailsImpl clubFacilityDetailsImpl;
//
//	@GetMapping
//	public ResponseEntity<?> getAllClubFacilityDetails(){
//		List<ClubFacilityDetails>clubFacilityDetailsList= clubFacilityDetailsImpl.getAllClubFacilityDetails();
//		return ResponseEntity.status(200).body(clubFacilityDetailsList);
//	}
//		
//	@PostMapping
//	public ResponseEntity<?> addClubFacilityDetails(@RequestBody ClubFacilityDetails clubFacilityDetails ) {
//		boolean status=clubFacilityDetailsImpl.addClubFacilityDetails(clubFacilityDetails);
//		if(status) {
//			return ResponseEntity.status(200).body("success");
//		}
//		else {
//			return ResponseEntity.status(500).body("error");
//		}
//	}
//}
