package com.payhere.payhere.repository;

import com.payhere.payhere.domain.AccountBook;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(properties = {"spring.config.location=classpath:application-test.yml"})
class AccountBookRepositoryTest {
    @Autowired
    AccountBookRepository accountBookRepository;

    @Test
    @DisplayName("가계부 저장 테스트")
    public void createAccountBookTest(){
        AccountBook accountBook = AccountBook.builder()
                .consumedName("테스트 가계부")
                .price(1000)
                .consumedDetail("테스트 가계부 메모")
                .build();
        AccountBook savedAccountBook = accountBookRepository.save(accountBook);
        System.out.println(savedAccountBook.toString());
    }
}