package com.payhere.payhere.dto;

import com.payhere.payhere.domain.AccountBook;
import lombok.Builder;

public class AccountBookSaveRequestDto {
    private String name;
    private int price;
    private String memo;

    @Builder
    public AccountBookSaveRequestDto(String name, int price, String memo){
        this.name = name;
        this.price = price;
        this.memo = memo;
    }

    public AccountBook toEntity(){
        return AccountBook.builder()
                .consumedName(name)
                .price(price)
                .consumedDetail(memo)
                .build();
    }
}
