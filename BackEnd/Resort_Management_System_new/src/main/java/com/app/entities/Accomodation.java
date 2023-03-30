package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name="accomodation_tbl")
public class Accomodation extends BaseEntity {
	
	
	@Column(name="room_chareges")
	private double roomChareges;
	
//	@Column(name="event_chareges")
//	private double eventCharges;
//	
//	@Column(name="club_chareges")
//	private double clubCharges;
	
	@Column(name="total_chareges")
	private double totalcharges;
	
	private boolean isPaid;
	@OneToOne
	@JoinColumn(name = "ckeck_in_number",nullable = false)
	private Booking ckeckInNumber;
	
	
	
//	@OneToOne
//	@JoinColumn(name = "receipt_no",nullable = false)
//	private Receipt receiptNo;
	
}
