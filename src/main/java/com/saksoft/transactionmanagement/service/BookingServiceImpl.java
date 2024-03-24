package com.saksoft.transactionmanagement.service;

import com.saksoft.transactionmanagement.dto.BookingRequest;
import com.saksoft.transactionmanagement.dto.BookingResponse;
import com.saksoft.transactionmanagement.exception.InsufficientBalanceException;
import com.saksoft.transactionmanagement.model.entity.PassengerInfo;
import com.saksoft.transactionmanagement.model.entity.PaymentInfo;
import com.saksoft.transactionmanagement.repository.PassengerInfoRepository;
import com.saksoft.transactionmanagement.repository.PaymentInfoRepository;
import com.saksoft.transactionmanagement.uitil.PaymentGatewaySimulator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;

    @Override
    @Transactional(rollbackFor = {InsufficientBalanceException.class, Exception.class}, readOnly = false,isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public BookingResponse bookTicket(BookingRequest bookingRequest) {

        BookingResponse bookingResponse = null;
        PassengerInfo passengerInfo = passengerInfoRepository.save(bookingRequest.getPassengerInfo());

        PaymentInfo paymentInfo = bookingRequest.getPaymentInfo();
        //Simulate transaction failure due to insufficient funds in accounts
        PaymentGatewaySimulator.validateBalanceCriteria(paymentInfo.getAccountNo(), passengerInfo.getFare());

        paymentInfo.setPassengerID(passengerInfo.getPassengerID());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);

        bookingResponse  = new BookingResponse();
        bookingResponse.setStatus("SUCCESS");
        bookingResponse.setPassengerInfo(passengerInfo);
        bookingResponse.setPnr(UUID.randomUUID().toString().split("-")[0]);
        bookingResponse.setTotalFare(passengerInfo.getFare());

        return bookingResponse;
    }
}

