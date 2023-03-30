//package com.app.service;
//
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.app.customExceptions.ResourceNotFoundException;
//import com.app.dao.EventDetailsRepository;
//import com.app.entities.EventDetails;
//
//@Service
//@Transactional
//public class EventDetailsImpl implements IEventService {
//
//	@Autowired
//	EventDetailsRepository eventRepository;
//	
//	@Override
//	public List<EventDetails> getAllEventDetails() {
//		List<EventDetails>eventDetailsList= eventRepository.findAll();
//		return eventDetailsList;
//	}
//
//	@Override
//	public boolean addEventDetails(EventDetails eventDetails) {
//		EventDetails eDetails=eventRepository.save(eventDetails);
//		return eDetails==null?false:true;
//	}
//
//	@Override
//	public EventDetails geteventDetailsById(Integer id) {
//		EventDetails eventDetails=eventRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("no Details Found"));
//	    return eventDetails;
//	}
//
//}
