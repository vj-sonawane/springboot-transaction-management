package com.saksoft.transactionmanagement.repository;

import com.saksoft.transactionmanagement.model.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {
}
