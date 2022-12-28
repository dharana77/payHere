package com.payhere.payhere.repository;

import com.payhere.payhere.domain.AccountBook;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountBookRepository extends JpaRepository<AccountBook, Long> {
    @Override
    <S extends AccountBook> S save(S entity);

    @Override
    void delete(AccountBook entity);

    @Override
    <S extends AccountBook> long count(Example<S> example);

    @Override
    List<AccountBook> findAll(Sort sort);
}
