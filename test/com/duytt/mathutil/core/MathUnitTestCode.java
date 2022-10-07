/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duytt.mathutil.core;


import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author T DUY
 */
public class MathUnitTestCode {
    
    //FrameWork ép dev phải viết code theo 1 khung dựng sẵn nào đó
    //thường dúng kí hiệu = @
    //annotation - flag đánh dấu 1 điều gì đó sẽ diễn ra
    //lúc biên dịch run time
    
    @Test //test thử hàm so sánh 2 giá trị expected và actual
    //máy tự so sánh giùm luôn, ko nhìn = mắt để tự so sánh
    //như bên hàm main() dùng sout()
    //mà FW JUnit tự generate ra code so sánh giá trị,
    //tự dùng bằng màu XANH ĐỎ mang ý nghĩa PASSED FAILED
    public void tryAssert(){
        Assert.assertEquals(100, 100);
    }
    
    //test hàm getFractorial() nhà mình, như bên main() nhưng chơi kiểu cah đỏ
    @Test   //quy tắc đặt tên hàm dành cho kiểm thử
            //tên hàm bao hàm ngữ nghĩa của việc kiểm thử
            //test anyf kiểm tra tính gt với tham số tử tế 0...20
    public void testFractorialGivenRightArgumentReturnWell(){
        
        //Test case #1: n = 0, 0! hy vọng trả về 1, thực tế
        //              hàm trả về mấy, chay moi biet
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        
        Assert.assertEquals(expected, actual);
        
        //Test case #2: n = 1, 1! hy vọng trả về 1, thực tế
        Assert.assertEquals(1, 1);
        
        //Test case #3: n = 2, 2! hy vọng trả về 2, thực tế
        Assert.assertEquals(2, 2);
    }
    public void testFractorialGivenRightArgumentReturnWellV2(){
         
         //Test case #4: n = 3, 3! hy vọng trả về 6, thực tế
        Assert.assertEquals(6, 3);
        
        //Test case #5: n = 4, 4! hy vọng trả về 24, thực tế
        Assert.assertEquals(240, 4);
    }
    
    //KIểm thử ngoại lệ khi đưa data cà chớn!!!
    //n < 0, ko tính gia thừa âm
    //n > 20, ko tính giai thừa tràn kiểu long
    //hàm đc thiết kế: NÉM RA NGOẠI LỆ TÊN LÀ ILLEGAL-ARGUMENT-EXCEPTION
    //thay vì nhận về 1 giá trị long, bạn nhận về 1 câu chửi
    //ta đo lường có câu chửi xuất hiện hay ko khi n = 5
    //thấy ngoại lệ mừng rơi nước mắt
    
    //nếu -5 mà app nếu ra ngoại lệ ILLEGAL-ARGUMENT-EXCEPTION
    //nghĩa là hàm ổn, chạy như thiết kế, như kì vọng
    //vậy nghĩa là hàm passed màu xanh!!!
    //đúng như kì vọng --- màu xanh!!!
    
    @Test(expected = Exception.class)
    public void testFractorialGivenWrongArgumentThrowException(){
        MathUtil.getFactorial(-5);
        
        //Test case #6: n = -5; expected: hy vọng thấy ngoại lệ
        //tên là ILLEGAL-ARGUMENT-EXCEPTION
    }
    
}

//@Test là 1 ký hiệu annomation báo với JUnit và JVM
//để generate cái hàm tryAssert() thành main() truyền thống
//và gửi cho JVM để chạy. App chạy từ main()
//thiếu @Test tương đương app thiếu main() no-runable

//CHỐT DEAL XANH ĐỎ:
//NẾU TẤT CẢ CÁC TEST CASES, @TEST ĐỀU MÀU XANH -> KẾT LUẬN HÀM
//ĐÚNG CHO NHỮNG THỨ MÌNH ĐÃ TEST,
//XANH CUỐI CÙNG KHI TẤT CẢ @TEST PHẢI XANH
//1. XANH KHI TẤT CẢ CÙNG XANH

//NẾU TRONG TẤT CẢ CÁ TEST CÓ ÍT NHẤT 1 ĐỎ -> XEM NHƯ TẤT CẢ LÀ ĐỎ,
//Ý NGHĨA LÀ HÀM ĐÚNG THÌ PHẢI ĐÚNG HẾT, CÓ 1 SAI HÀM KO ỔN ĐỊNH VỀ KẾT QUẢ
//-> PHẢI GỌI LÀ HÀM SAI!

//2. ĐỎ KHI CÓ ÍT NHẤT 1 ĐỎ
//ĐỎ ĐẾN TỪ 1 TRONG NHỮNG TÌNH HUỐNG 
//EXPECTED ĐÃ TÍNH ĐÚNG, ACTUAL TRẢ VỀ SAI -> BUG CỦA HÀM
//EXPECTED ĐÃ TÍNH/GÕ SAI, ACTUAL SAI