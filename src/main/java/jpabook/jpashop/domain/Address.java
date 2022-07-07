package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable //jpa의 내장 타입을 나타냄
@Getter
public class Address {
    private String city;
    private String street;
    private String zipcode;
}
