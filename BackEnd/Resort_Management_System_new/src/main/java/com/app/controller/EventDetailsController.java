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
//import com.app.entities.EventDetails;
//import com.app.service.EventDetailsImpl;
//
//@RestController
//@RequestMapping("/api/eventdetails")
//@CrossOrigin(origins = "*")
//public class EventDetailsController {
//
//	@Autowired
//	EventDetailsImpl eventDetailsImpl;
//	
//	@GetMapping
//	public ResponseEntity<?> getAllEventDetails(){
//		List<EventDetails> eventList=eventDetailsImpl.getAllEventDetails();
//		return ResponseEntity.status(200).body(eventList);
//	}
//	
//	@PostMapping
//	public ResponseEntity<?> addEventDetails(@RequestBody EventDetails eventDetails) {
//		boolean status=eventDetailsImpl.addEventDetails(eventDetails);
//		if(status) {
//			return ResponseEntity.status(200).body("success");
//		}else {
//			return ResponseEntity.status(500).body("error");
//		}
//	}
//}
