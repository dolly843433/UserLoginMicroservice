package com.user.login.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.user.login.entity.OrderDetail;

public interface OrderRepository  extends JpaRepository<OrderDetail, String>{

	@Query(value = "select * from order_detail where user_id=?",nativeQuery = true)
	public List<OrderDetail> getAllByUser(String userId);
}
