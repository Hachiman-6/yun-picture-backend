package com.djx.yunpicturebackend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Function;

//@SpringBootTest
class YunPictureBackendApplicationTests {

    @Test
    void contextLoads() {
        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> doubleIt = x -> x * 2;

        System.out.println(appply(square, 5));     // 输出 25
        System.out.println(appply(doubleIt, 5));   // 输出 10
    }

    // 接收一个 Function 对象作为参数
    public static int appply(Function<Integer, Integer> func, int x) {
        return func.apply(x);
    }

//    public static void main(String[] args) {
//        Function<Integer, Integer> square = x -> x * x;
//        Function<Integer, Integer> doubleIt = x -> x * 2;
//
//        System.out.println(apply(square, 5));     // 输出 25
//        System.out.println(apply(doubleIt, 5));   // 输出 10
//    }

}
