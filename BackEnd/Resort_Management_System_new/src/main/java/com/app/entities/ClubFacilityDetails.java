//package com.app.entities;
//
//import javax.persistence.Entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//import javax.persistence.*;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@Entity
//@Table(name = "club_tbl")
//public class ClubFacilityDetails extends BaseEntity {
//	
//	@Column(name = "club_facility_Name", nullable = false)
//	private String facilityName;
//	
//	@Column(name="facility_desc", length=1000,nullable = false)
//	private String facilityDesc;
//	
//	@Column(name = "facility_Price", nullable = false)
//	private double facilityPrice;
//
//	public ClubFacilityDetails(Integer Id, String facilityName, double facilityPrice) {
//		super(Id);
//		this.facilityName = facilityName;
//		this.facilityPrice = facilityPrice;
//	}
//	
//}
