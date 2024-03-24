package com.saksoft.transactionmanagement.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PASSENGER_INFO")
    public class PassengerInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name="passenger_id")
    private Long passengerID;

    @Column(nullable = false, name="passenger_name")
    private String name;

    @Column(nullable = false, name="user_gender")
    private String gender;

    @Column(name="passenger_email")
    private String email;

    @Column(nullable = false, name="passenger_phone_number")
    private String contact;

    @Column(nullable = false, name="source_city")
    private String sourceCity;

    @Column(nullable = false, name="destination_city")
    private String destinationCity;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
    @Column(nullable = false, name="journey_date")
    private Date dateOfJourney;

    @Column(nullable = false, name="quota")
    private String quota;

    @Column(nullable = false, name="class")
    private String sittingClass;

    @Column(nullable = false, name="train_name")
    private String trainName;

    @Column(nullable = false, name="departure_time")
    private String departureTime;

    @Column(nullable = false, name="arrival_time")
    private String arrivalTime;

    @Column(nullable = false, name="fare")
    private Double fare;

}
