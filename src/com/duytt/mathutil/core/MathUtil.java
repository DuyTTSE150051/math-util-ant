/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duytt.mathutil.core;

/**
 *
 * @author T DUY
 */
public class MathUtil {
    //trong class nafyta sẽ viết các hàm tiện ích/ dùng chung
    //cho nhiều class khác
    //thì thường sẽ thiết kế là STATIC
    
    //hàm này tính n! = 1.2.3.4...N
    //Quy ước: ko có giai thừa âm
    //         0! = 1! = 1
    //         chỉ tính n từ 0...20, vì
    //         21! vượt 18 con số 0, vượt long
    public static long getFactorial(int n){
        
        if (n < 0 || n > 20)
            //Illegal ctrl + backpage --> IllegalArgumentException
            throw new IllegalArgumentException("Invalid n. N must be between 0...20");
        //alt + shift F --> if (n < 0 || n > 20) //Illegal ctrl + backpage --> IllegalArgumentException
        //                  {
        //                      throw new IllegalArgumentException("Invalid n. N must be between 0...20");
        //                  }
        if (n == 0 || n == 1)
            return 1;
        
        long product = 1; //biến tích lũy acc/accumulation
        // for + tab
        for (int i = 2; i <= n; i++) {
            product *= i; //product = product * i;
        return product; //return ctrl + backpage
        }
        return 0;
    }
}

//Hoc kĩ thuật viết code được gọi là TDD = TEST DRIVEN DEVELOPMENT
//Là kĩ thuật ngay khi viết code/thiết kế ra tên hàm/class
//đã chuẩn bị luôn bộ kiểm thử - chuẩn bị luôn các TEST CASE
//chuẩn bị luôn các tình huống(case) sẽ xài hàm này như thế nào
//chuẩn bị luôn các tính huống test các hàm để xác định hàm/class đúng/sai
//viết code hướng về các bài kiểm thử đặt ra
//các test cases - các tình huống xài hàm 1 khi hàm viết xong

//Case #1: n=0; getFactorial(0) -> expected hy vọng hàm trả ra: 1
//Case #2: n=1; getFactorial(1) -> expected value == 1
//Case #3: n=5; getFactorial(5) -> expected value == 20
//Case #4: n=-5; getFactorial(-5) -> expected value: ko hợp lệ!!!
//Case #5: n=21; getFactorial(21) -> expected value: ko hợp lệ!!!
//                                              VALIDATOR

//TEST CASE: là 1 tình huống liểm thử app/màn hình/tính năng
//          xem nó chạy đúng không
//          bằng cách đưa data cụ thể nào đó, xem output nó đúng
//          như dự kiến trước đó hay ko, tức là
//          đưa data, chờ app xử lí, và so sánh kết quả(actual) với expected