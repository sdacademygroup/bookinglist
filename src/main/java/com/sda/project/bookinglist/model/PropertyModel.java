package com.sda.project.bookinglist.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PropertyModel {

    private Long propertyId;

    private String propertyName;

    private String propertyDescription;

    private BigDecimal startsFrom;

    private String resultPageImageUrl;

    private List<String> mediaLinks;

    private List<AddressModel> addresses = new ArrayList<>();

    private List<RoomModel> rooms = new ArrayList<>();

    private List<String> amenities;

}
