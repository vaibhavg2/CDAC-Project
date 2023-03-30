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
//import com.app.dao.ClubFacilityRepository;
//import com.app.entities.ClubFacilityDetails;
//
//@Service
//@Transactional
//public class ClubFacilityDetailsImpl implements IClubFacilityDetails {
//
//	@Autowired
//	ClubFacilityRepository clubFacilityRepository;
//	
//	@Override
//	public List<ClubFacilityDetails> getAllClubFacilityDetails() {
//		List<ClubFacilityDetails> clubFacilityDetailsList= clubFacilityRepository.findAll();
//		return clubFacilityDetailsList;
//	}
//
//	@Override
//	public boolean addClubFacilityDetails(ClubFacilityDetails clubFacilityDetails) {
//		ClubFacilityDetails cFDetail=clubFacilityRepository.save(clubFacilityDetails);
//		return cFDetail==null?false:true;
//	}
//
//	@Override
//	public ClubFacilityDetails getClubFacilityDetailsById(Integer id) {
//		ClubFacilityDetails cFacilityDetails=clubFacilityRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("no Details Found"));
//	    return cFacilityDetails;
//	}
//
//}
