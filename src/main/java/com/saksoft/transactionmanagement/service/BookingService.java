package com.saksoft.transactionmanagement.service;

import com.saksoft.transactionmanagement.dto.BookingRequest;
import com.saksoft.transactionmanagement.dto.BookingResponse;

public interface BookingService {

    public BookingResponse bookTicket(BookingRequest bookingRequest) ;

}
