//package com.app.service;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.app.customExceptions.ResourceNotFoundException;
//import com.app.dao.BillRepository;
//import com.app.dao.EventOrderRepository;
//import com.app.entities.Event;
//import com.app.entities.Receipt;
//
//@Service
//@Transactional
//public class EventOrderServiceImpl implements IEventOrderService {
//
//	@Autowired
//	EventOrderRepository eventordeRepository;
//	@Autowired
//    BillRepository billRepository;
//	
//	@Override
//	public boolean saveEventOrderDetails(Event event,Integer recieptId) {
//		
//		Receipt receipt=billRepository.findById(recieptId).orElseThrow(()->new ResourceNotFoundException("no Receipt Entry Found"));
//		receipt.getEventOrderList().add(event);
//		Receipt rReceipt=billRepository.save(receipt);
//		return rReceipt==null?false:true;
//	}
//
//	@Override
//	public Event getEventDetails(Integer id) {
//		Event event=eventordeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Meal order Details Not Found"));
//		return event;
//	}
//
//}
