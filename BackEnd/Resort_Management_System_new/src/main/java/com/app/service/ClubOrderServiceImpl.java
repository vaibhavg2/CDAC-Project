//package com.app.service;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.app.customExceptions.ResourceNotFoundException;
//import com.app.dao.BillRepository;
//import com.app.dao.ClubOrderRepository;
//import com.app.entities.Club;
//import com.app.entities.Receipt;
//
//@Service
//@Transactional
//public class ClubOrderServiceImpl implements IClubOrderService {
//
//	@Autowired
//	ClubOrderRepository cluborderRepository;
//	@Autowired
//	BillRepository billRepository;
//	
//	@Override
//	public boolean saveClubOrderDetails(Club club,Integer recieptId) {
//		
//		Receipt receipt=billRepository.findById(recieptId).orElseThrow(()->new ResourceNotFoundException("No Reciept Entry Found !!"));
//		receipt.getClubOrderList().add(club);
//		Receipt rReceipt=billRepository.save(receipt);
//		return rReceipt==null?false:true;
//	}
//
//	@Override
//	public Club getClubDetails(Integer id) {
//		Club club = cluborderRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Meal order Details Not Found"));
//		return club;
//	}
//
//}
