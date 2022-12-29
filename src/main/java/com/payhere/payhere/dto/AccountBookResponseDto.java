package com.payhere.payhere.dto;

import com.payhere.payhere.domain.AccountBook;
import lombok.Getter;

@Getter
public class AccountBookResponseDto {
    private Long id;
    private String consumedName;
    private int price;
    private String consumedDetail;

    public AccountBookResponseDto(AccountBook entity){
        this.id = entity.getId();
        this.consumedName = entity.getConsumedName();
        this.price = entity.getPrice();
        this.consumedDetail = entity.getConsumedDetail();
    }
}
