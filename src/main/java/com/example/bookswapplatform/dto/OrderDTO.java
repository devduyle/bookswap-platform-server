package com.example.bookswapplatform.dto;

import com.example.bookswapplatform.entity.Order.OrderStatus;
import com.example.bookswapplatform.utils.DateTimeUtils;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private UUID id;
    private BigDecimal price;
    private String note;
    private boolean isConfirm;
    private boolean isPayment;
    private String city;
    private String district;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeUtils.DATE_FORMAT)
    private LocalDate startShipDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeUtils.DATE_FORMAT)
    private LocalDate finishShipDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeUtils.DATETIME_FORMAT)
    private LocalDateTime createDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeUtils.DATETIME_FORMAT)
    private LocalDateTime updateDate;
    private String createBy;
    private String updateBy;
    private OrderStatus orderStatus;
    private PostDTO postDTO;
    private Set<BookDTO> bookTradeDTOS;
    private Set<PaymentDTO> paymentDTOS;

}
