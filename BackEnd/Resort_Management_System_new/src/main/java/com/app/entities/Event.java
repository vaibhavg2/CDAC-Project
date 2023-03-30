//package com.app.entities;
//
//import java.sql.Timestamp;
//
//import javax.persistence.*;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//@Entity
//@Table(name="event_order")
//public class Event extends BaseEntity {
//	
//	@Column(name="check_in_number")
//	private int checkInNumber;
//	@OneToOne
//	@JoinColumn(name = "event_details_no")
//	private EventDetails eventDetails;
////	private int quantity;
//
//	@Column(name="order_time", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP",insertable =false)
//	private Timestamp orderTime;
//
//}
