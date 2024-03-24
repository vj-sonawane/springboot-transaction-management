package com.saksoft.transactionmanagement.dto;

import com.saksoft.transactionmanagement.model.entity.PassengerInfo;
import com.saksoft.transactionmanagement.model.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingRequest {
    private PaymentInfo paymentInfo;
    private PassengerInfo passengerInfo;

}
