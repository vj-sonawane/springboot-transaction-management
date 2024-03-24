package com.saksoft.transactionmanagement.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PAYMENT_INFO")
public class PaymentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "payment_Id")
    private Integer paymentID;

    @Column(nullable = false, name="passenger_name")
    private String accountNo;

    @Column(nullable = false, name="amount")
    private Double amount;

    @Column(nullable = false, name="card_type")
    private String cardType;

    @Column(nullable = false, name="passenger_secRef")
    private Long passengerID;

}
