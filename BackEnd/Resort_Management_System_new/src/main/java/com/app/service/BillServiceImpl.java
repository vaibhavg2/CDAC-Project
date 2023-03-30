//package com.app.service;
//
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.app.dao.AccomodationRepository;
//import com.app.dao.BillRepository;
//import com.app.dao.EventOrderRepository;
//import com.app.dao.ClubOrderRepository;
//import com.app.entities.Accomodation;
//import com.app.entities.Booking;
//import com.app.entities.Club;
//import com.app.entities.Event;
//import com.app.entities.Receipt;
//import com.app.entities.RoomCategory;
//
//@Service
//@Transactional
//public class BillServiceImpl implements IBillService {
//
//	@Autowired
//	BillRepository billRepository;
//	@Autowired
//	AccomodationRepository  accomodationRepository;
//	
//	@Override
//	public List<Event> getEventOrderDetails(Integer recieptId) {
//		return billRepository.getEventOrdersByRecieptId(recieptId);
//	}
//
//	@Override
//	public List<Club> getClubOrderDetails(Integer recieptId) {
//		List<Club> clubList=  billRepository.getClubOrdersByRecieptId(recieptId);
//		System.out.println(clubList);
//		 return clubList;
//	}
//
//	@Override
//	public List<RoomCategory> getBookedRoomDetails(Integer receiptId) {
//		return billRepository.getRoomDetails();
//	}
//
//	@Override
//	public Accomodation generateBill(Integer checkInNumber, Integer receiptNumber) {
//		List<Event> eventList=getEventOrderDetails(receiptNumber);
//		List<Club> clubList=getClubOrderDetails(receiptNumber);
//		List<RoomCategory> roomCategory=getBookedRoomDetails(receiptNumber) ;
//		
//		// calculating meal order charges
//		double eventCharges=0;
//		for(Event event:eventList) {
//			eventCharges +=event.getEventDetails().getEventPrice();
//		}
//		
//		// calculating sport activity charges
//		double clubCharges=0;
//		for(Club club:clubList) {
//			clubCharges +=club.getClubFacilityDetails().getFacilityPrice();
//		}
//		
//		// booked room charges
//		double roomCharges=0;
//		for(RoomCategory rc:roomCategory) {
//			roomCharges=roomCharges+rc.getCost();
//		}
// 		
//		// calculating total charges
//		double totalCharges=roomCharges+eventCharges+clubCharges;
//		
//		Accomodation accomodationBill= new Accomodation(roomCharges,eventCharges,clubCharges,totalCharges,false,new Booking(checkInNumber),new Receipt( receiptNumber));
//		Accomodation accomodation=accomodationRepository.save(accomodationBill);
//		return accomodation==null?null:accomodation;
//	}
//
//	
//
//}
