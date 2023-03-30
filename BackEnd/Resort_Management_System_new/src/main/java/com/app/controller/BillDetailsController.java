//package com.app.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.app.entities.Accomodation;
//import com.app.entities.Club;
//import com.app.entities.Event;
//import com.app.service.IBillService;
//
//
//@RestController
//@RequestMapping("/api/bill")
//@CrossOrigin(origins = "*")
//public class BillDetailsController {
//
//	@Autowired
//	IBillService billService;
//	
//	@GetMapping("/{checkInNumber}/{recieptId}")
//	ResponseEntity<?> getBillDetailsById(@PathVariable Integer checkInNumber,@PathVariable Integer recieptId ){
//		Accomodation accomodationBill=billService.generateBill(checkInNumber, recieptId);
//		
//		if(accomodationBill==null)
//		    return ResponseEntity.status(500).body("error");
//		else
//			return ResponseEntity.status(200).body(accomodationBill);
//	}
//	
//	@GetMapping("/clubOrders/{recieptId}")
//	ResponseEntity<?> getClubOrdersDetails(@PathVariable Integer recieptId ){
//		List<Club> clubList= billService.getClubOrderDetails(recieptId);
//		
//		if(clubList==null)
//		    return ResponseEntity.status(500).body("error");
//		else
//			return ResponseEntity.status(200).body(clubList);
//	}
//	
//	@GetMapping("/eventOrders/{recieptId}")
//	ResponseEntity<?> getEventOrdersDetails(@PathVariable Integer recieptId ){
//		List<Event> eventList= billService.getEventOrderDetails(recieptId);
//		
//		if(eventList==null)
//		    return ResponseEntity.status(500).body("error");
//		else
//			return ResponseEntity.status(200).body(eventList);
//	}
//	
//}
