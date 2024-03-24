package com.saksoft.transactionmanagement.dto;

import com.saksoft.transactionmanagement.model.entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {
    private String status;
    private double totalFare;
    private String pnr;
    private PassengerInfo passengerInfo;
}
