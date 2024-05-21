package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Primary;

@SpringBootTest
public class BeanTest {

//    Bean이 두 개 이상일 때 등록하는 방법
//    1. 등록이 된 Bean의 이름을 명시 ( Bean 이름은 소문자 시작 )
//    @Autowired  // Autowired의 경우
//    Food pizza; // ( Bean은 Bean의 타입으로 먼저 연결을 시도하고, 2개 이상일 경우 받은 경우 Bean의 이름으로 찾는다. )
//
//    @Autowired
//    Food chicken;

//    2. Bean으로 선언된 클래스에 @Primary 어노테이션을 설정하면 우선적으로 Bean으로 등록된다.
    @Autowired
//    3. 클래스에 @Qualifier("pizza")를 선언한다. Qualifier 가 Primary 보다 우선순위가 높다.
    @Qualifier("pizza")
    Food food;

    @Test
    @DisplayName("테스트")
    void test1() {
        food.eat();
    }

}
