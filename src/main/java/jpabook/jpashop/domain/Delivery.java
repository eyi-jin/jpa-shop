package jpabook.jpashop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
@Getter
@Setter
public class Delivery {
    @Id
    @GeneratedValue
    @Column(name="delivery_id")
    private Long Id;

    @JsonIgnore
    @OneToOne (mappedBy = "delivery", fetch = LAZY)
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)//enum을 사용할 때는 해당 어노테이션을 무조건 사용!
    private DeliveryStatus status; //READY, COMP

}
