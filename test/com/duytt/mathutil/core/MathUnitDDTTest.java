/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duytt.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author T DUY
 */
@RunWith(value = Parameterized.class)  //class này cbi chơi trò tách data ra khỏi
                                    //câu lện xanh đỏ cho dễ kiểm soát các test case
                                    //Thư viện JUnit sẽ tự generate thêm code phía hậu trường
                                    //lúc biên dịch để giúp hiện thực hóa ý tưởng DDT
                                    //ví dụ nó sẽ tự biết lấy data ở mảng 2 chiều nào đó
                                    //nhồi vào hàm assertEquals()
                                    //ép ta phải viết code theo theo cách nào đó định trước 
                                    //mới chạy đc thư viện đó đc gọi tên mới: FRAMEWORK
public class MathUnitDDTTest {
    
    //ta tự tạo ra 1 hàm, tên tùy ý, trả về mảng 2 chiều chứa danh sách data ta dự định
    //nhồi bvaof hàm getF() và assertE() phần duyệt mảng để nhồi vào ham test, FRAMEWORK
    //sẽ tự lo,coder lo
    @Parameterized.Parameter(value = 0)
    public static Object[][] initdata() {
        int a[] = {5, 10, 15, 20, 25};
        //mảng có giá trị ngay lúc khai báo,
        //thì dùng (thì dùng các phần tử cách nhau ,)
        //Object arr1[][] = ((1, 0), (1, 1), (2, 2), (6, 3), (24, 4), (120, 5), (720, 6));
        return new Integer[][]{
                           {1,0}
                           {1,1}
                           {2,2}
                           {6,3}
                           {24,4}
                           {120,5}
                           {720,6}
        }
    }
    @Parameterized.Parameter(value = 0)
    public long expected; //biến này sẽ lưu gái trị kì vọng khi xài hàm
                          //getFractorial() -> expected
    
    @Parameterized.Parameter(value = 1)
    public int n; //biến này sẽ lưu giá trị đưa cho hàm getF() để check ta sẽ
                  //map/ánh xạ 2 biến này ứng với 2 cột của từng dòng cảu mảng ở trên!!!
                  //Ta phải quy ước biến expected map vào cột nào mình muốn thứ tự biến/ cột
                  //ko quan trọng, vì ta sẽ cấu hình việc map tương ứng này
    
    //test các test cases
    @Test
    public void testFractorialGivenRightArgumentReturnWell(){
        Assert.assertEquals(expected, Math);
    }
}

//DDT: Data Driven Tesitng, là 1 kĩ thuật viết code kiểm thử dùng trong UnitTest,
//     dùng để viết code test các hàm/class 1 cách dễ đọc hơn!!!
//     bằng cách tách data kiểm thử và câu lệnh test hàm thành 2 nơi khác nhau
//ví dụ cách cũ, non-DDT vừa lm xong!!!
//asserEquals(0, getF(0))
//asserEquals(1, getF(1))
//asserEquals(2, getF(2))
//asserEquals(6, getF(3))
//asserEquals(24, getF(4))
//asserEquals(120, getF(5))
//asserEquals(720, getF(6))
//cách này dễ viết nhưng khó kiểm tra đủ hết tập test cases cần test,
//trộn lẫn data đưa vào, và câu lệnh gọi hàm kiển thử
//KĨ THUẬT TÁCH DATA 00, 11, 22, 63, 244, 1205, 7206
//dể riêng ra 1 chỗ, sau đó nhồi fill/feed nạp chúng vào

//lệnh gọi hàm assertEquals(?, getF(?))
//giúp code trong sáng dễ hiểu
// kĩ thuật này gọi là: DATA       DRIVEN     TESTING
//                      tách data  hướng về   code kiểm thử
//tham số hóa data - BIẾN DATA RA 1 NƠI, ĐẶT CHO CHÚNG TÊN BIẾN LÁT HỒI NHỒI VÀO LÊNH SO SÁNH
//THAM SỐ HÓA - BIẾN DATA THÀNH BIẾN THAM SỐ - PARAMETERIZED

//JUNIT sẽ tự tách mảng ả thành các test case
//chạy so sánh Xanh Đỏ của từng test cases và đưa ra kết luận chung
//Xanh khi tất cả cùng xanh
//Chỉ 1 đỏ, tất cả đỏ - hàm phải đúng hết khi đc

//Khi đỏ, thì có 2 tình huống
//Đỏ: do có sự != nhau giữ EXPECTED VÀ ACTUAL
//Đỏ vì expected != actual, vậy ko = vì lý do gì???
//1. Expected là giá trị tính toán trước, hàm phải trả về bằng được gái trị này,
//và expected mình tính = tay khi chưa xài app, phải tính đúng
//Màu đỏ là do actual ko giống, tức là code sai, BUG!!!

//2. Expected mình tính = tay, và bị sai, kì vọng đã sai trước khi hàm đó trả về
//cho dù có đúng thì cũng bị màu đỏ
//kì vọng sai thì ko thể kết luận đc hàm có bug hay ko!!!

//BTVN: LÀM VIỆC NHÓM
//Hãy chọn 1 Unit Test Framework nhóm thik
//JAVA: JUNIT (cấm chọn do thầy demo rồi), TESTNG
//C#: NUnit, xunit, MSTest(NuGet)
//search Google "unit test framework for nnlt???" ra tên thư viện
//thứ 3 tuần 6 demo, mỗi nhóm 30'