package com.payhere.payhere.controller;

import com.payhere.payhere.dto.AccountBookSaveRequestDto;
import com.payhere.payhere.service.AccountBookPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class AccountBookController {
    private final AccountBookPostService accountBookPostService;

    @PostMapping("api/v1/postAccountBook")
    public Long save(@RequestBody AccountBookSaveRequestDto requestDto){
        return accountBookPostService.save(requestDto);
    }
}
