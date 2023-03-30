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
//import com.app.entities.Event;
//import com.app.entities.EventDetails;
//import com.app.entities.Event;
//import com.app.service.IEventService;
//import com.app.service.EventOrderServiceImpl;
//
//@RestController
//@RequestMapping("/api/eventorderdetails")
//@CrossOrigin(origins = "*")
//public class EventOrderController {
//
//	@Autowired
//	EventOrderServiceImpl eventOrderService;
//	
//	@Autowired
//	IEventService eventService;
//	
//	@PostMapping("/{eventDetail_id}/{receipt_id}")
//	public ResponseEntity<?> saveEventOrderDetails(@RequestBody Event event,@PathVariable Integer eventDetail_id,@PathVariable Integer receipt_id){
//		EventDetails eventDetails=eventService.geteventDetailsById(eventDetail_id);
//		System.out.println(eventDetails);
//		event.setEventDetails(eventDetails);
//		boolean status=eventOrderService.saveEventOrderDetails(event,receipt_id);
//		if(status) {
//			return ResponseEntity.status(200).body("success");
//		}else {
//			return ResponseEntity.status(500).body("error");
//		}	
//		
//	}
//	
//	@GetMapping("/{id}")
//	public ResponseEntity<?> GetEventOrderDetails(@PathVariable Integer id){
//		Event event=eventOrderService.getEventDetails(id);
//		if(event!=null) {
//			return ResponseEntity.status(200).body(event);
//		}else {
//			return ResponseEntity.status(500).body("error");
//		}
//		
//	}
//}
