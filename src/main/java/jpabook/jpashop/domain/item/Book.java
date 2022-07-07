package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("B") //싱글 테이블 전략이므로, DB 입장에서 저장할 떄, 구분할 수 있도록 하는 전략/ default값 = 클래스명
@Getter
@Setter
public class Book extends Item {
    private String author;
    private String isbn;
}
