package com.payhere.payhere.domain;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
@Entity
public class AccountBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_book_id")
    private Long id;

    @Column(nullable = false, length = 50)
    private String consumedName;

    @Column(name = "price", nullable = false)
    private int price;

    @Lob
    @Column(nullable = false)
    private String consumedDetail;

    @Builder
    public AccountBook(String consumedName, int price, String consumedDetail){
        this.consumedName = consumedName;
        this.price = price;
        this.consumedDetail = consumedDetail;
    }

    public void update(int price, String consumedDetail) {
        this.price = price;
        this.consumedDetail = consumedDetail;
    }
}
