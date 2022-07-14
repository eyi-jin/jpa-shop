package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable //jpa의 내장 타입을 나타냄
@Getter //값 타입은 getter만 만든다
public class Address {
    private String city;
    private String street;
    private String zipcode;

    protected Address(){ //JPA 스펙상 리플렉션, 프록시 기술 적용하기 위함

    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
