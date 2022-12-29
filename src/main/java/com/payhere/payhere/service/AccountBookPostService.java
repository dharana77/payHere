package com.payhere.payhere.service;

import com.payhere.payhere.dto.AccountBookSaveRequestDto;
import com.payhere.payhere.repository.AccountBookRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AccountBookPostService {
    private final AccountBookRepository accountBookRepository;

    @Transactional
    public Long save(AccountBookSaveRequestDto requestDto){
        return accountBookRepository.save(requestDto.toEntity()).getId();
    }
}
