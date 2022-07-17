package jpabook.jpashop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String name;

    @Embedded // Address.java의 @Embeddable 둘 중 하나만 사용해도 됨
    private Address address;

    @JsonIgnore
    @OneToMany(mappedBy = "member") //읽기 전용, 매핑된 거울!
    private List<Order> orders = new ArrayList<>();
}