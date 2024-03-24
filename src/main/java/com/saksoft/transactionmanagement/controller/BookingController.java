package com.saksoft.transactionmanagement.controller;

import com.saksoft.transactionmanagement.dto.BookingRequest;
import com.saksoft.transactionmanagement.dto.BookingResponse;
import com.saksoft.transactionmanagement.exception.InsufficientBalanceException;
import com.saksoft.transactionmanagement.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class BookingController implements BookingControllerAPI{

    @Autowired
    private BookingService bookingService;

    @Override
    public BookingResponse bookTicket(BookingRequest bookingRequest)  {
        return bookingService.bookTicket(bookingRequest);
    }


}
