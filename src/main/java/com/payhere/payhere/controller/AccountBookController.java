package com.payhere.payhere.controller;

import com.payhere.payhere.dto.AccountBookResponseDto;
import com.payhere.payhere.dto.AccountBookSaveRequestDto;
import com.payhere.payhere.dto.AccountBookUpdateRequestDto;
import com.payhere.payhere.service.AccountBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class AccountBookController {
    private final AccountBookService accountBookService;

    @PostMapping("api/v1/accountBook/post")
    public Long save(@RequestBody AccountBookSaveRequestDto requestDto){
        return accountBookService.save(requestDto);
    }

    @PutMapping("api/v1/accountBook/update/{id}")
    public Long update(@PathVariable Long id, @RequestBody AccountBookUpdateRequestDto requestDto) {
        return  accountBookService.update(id, requestDto);
    }

    @GetMapping("api/v1/accountBook/get/{id}")
    public AccountBookResponseDto findById (@PathVariable Long id) {
        return accountBookService.findById(id);
    }

    @DeleteMapping("/api/v1/accountBook/delete/{id}")
    public Long delete(@PathVariable Long id) {
        accountBookService.delete(id);
        return id;
    }

}
