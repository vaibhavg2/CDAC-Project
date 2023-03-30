//package com.app.dao;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import com.app.entities.Club;
//import com.app.entities.Event;
//import com.app.entities.Receipt;
//import com.app.entities.RoomCategory;
//
//
//@Repository
//public interface BillRepository extends JpaRepository<Receipt, Integer> {
//
//	@Query("select rct.eventOrderList from Receipt rct join Event ml on rct.Id=ml.Id where rct.Id=:rId")
//	List<Event> getEventOrdersByRecieptId(@Param("rId") Integer rId);
//	
//	@Query("select rct.clubOrderList from Receipt rct join Club sp on rct.Id=sp.Id where rct.Id=:rId")
//	List<Club> getClubOrdersByRecieptId(@Param("rId") Integer rId);
//	
//	// get room and category details for pricing
//	@Query("select rct.roomCategory from  Receipt rct Join RoomCategory rc on rct.Id=rc.Id")
//	List<RoomCategory> getRoomDetails();
//	
//	// to avoid LazyInitialization Exception
//	@Query("select rct from Receipt rct Join fetch rct.clubOrderList ")
//	Receipt getReceiptAndClubOrderList(Integer recieptId) ;
//	
//	// to avoid LazyInitialization Exception
//	@Query("select rct from Receipt rct  Join fetch rct.eventOrderList where rct.Id=:rctId")
//	Receipt getReceiptAndEventOrderList(@Param("rctId") Integer rctId);
//}
