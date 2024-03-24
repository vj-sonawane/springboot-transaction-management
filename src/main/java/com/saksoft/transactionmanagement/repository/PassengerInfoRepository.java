package com.saksoft.transactionmanagement.repository;

import com.saksoft.transactionmanagement.model.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}
