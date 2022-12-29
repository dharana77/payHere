package com.payhere.payhere.service;

import com.payhere.payhere.domain.AccountBook;
import com.payhere.payhere.dto.AccountBookResponseDto;
import com.payhere.payhere.dto.AccountBookSaveRequestDto;
import com.payhere.payhere.dto.AccountBookUpdateRequestDto;
import com.payhere.payhere.repository.AccountBookRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AccountBookService {
    private final AccountBookRepository accountBookRepository;

    @Transactional
    public Long save(AccountBookSaveRequestDto requestDto){
        return accountBookRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, AccountBookUpdateRequestDto requestDto) {
        AccountBook accountBook = accountBookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 가계부가 없습니다. id =" + id));
        accountBook.update(requestDto.getPrice(), requestDto.getConsumedDetail());
        return id;
    }

    public AccountBookResponseDto findById (Long id) {
        AccountBook entity = accountBookRepository.findById(id).orElseThrow( () -> new IllegalArgumentException("해당 게시글이 없습니다. id =" + id));

        return  new AccountBookResponseDto(entity);
    }
}
