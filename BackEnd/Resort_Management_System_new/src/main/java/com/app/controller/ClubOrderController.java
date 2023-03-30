//package com.app.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.app.entities.Club;
//import com.app.entities.ClubFacilityDetails;
//import com.app.service.IClubFacilityDetails;
//import com.app.service.ClubOrderServiceImpl;
//
//@RestController
//@RequestMapping("/api/cluborderdetails")
//@CrossOrigin(origins = "*")
//public class ClubOrderController {
//
//	@Autowired
//	ClubOrderServiceImpl clubOrderService;
//	@Autowired
//	IClubFacilityDetails clubService;
//	
//	
//	@PostMapping("/{clubFacilityDetail_id}/{receipt_id}")
//	public ResponseEntity<?> saveClubOrderDetails(@RequestBody Club club,@PathVariable Integer clubFacilityDetail_id,@PathVariable Integer receipt_id){
//		ClubFacilityDetails clubFacilityDetails=clubService.getClubFacilityDetailsById(clubFacilityDetail_id);
//		System.out.println(clubFacilityDetails);
//		club.setClubFacilityDetails(clubFacilityDetails);
//		boolean status=clubOrderService.saveClubOrderDetails(club,receipt_id);
//		if(status) {
//			return ResponseEntity.status(200).body("success");
//		}else {
//			return ResponseEntity.status(500).body("error");
//		}	
//		
//	}
//	
//	@GetMapping("/{id}")
//	public ResponseEntity<?> GetClubOrderDetails(@PathVariable Integer id){
//		Club club=clubOrderService.getClubDetails(id);
//		if(club!=null) {
//			return ResponseEntity.status(200).body(club);
//		}else {
//			return ResponseEntity.status(500).body("error");
//		}
//}
//}
