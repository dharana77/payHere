package com.payhere.payhere.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AccountBookUpdateRequestDto {
    private String consumedDetail;
    private int price;

    @Builder
    public AccountBookUpdateRequestDto(String consumedDetail, int price){
        this.consumedDetail = consumedDetail;
        this.price = price;
    }
}
