package com.saksoft.transactionmanagement.controller;

import com.saksoft.transactionmanagement.dto.BookingRequest;
import com.saksoft.transactionmanagement.dto.BookingResponse;
import com.saksoft.transactionmanagement.exception.InsufficientBalanceException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface BookingControllerAPI {
    @PostMapping(value = "/booking", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    BookingResponse bookTicket(@RequestBody BookingRequest bookingRequest);



}
