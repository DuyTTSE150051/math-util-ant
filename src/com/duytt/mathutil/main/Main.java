/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duytt.mathutil.main;

import com.duytt.mathutil.core.MathUtil;

/**
 *
 * @author T DUY
 */
public class Main {
    // psvm phim nóng cho public static void main
    public static void main(String[] args) {
        
        //Test case #1: n = 0 -> expected getF(0) -> trả về 1;
        long expected = 1;
        long actual = MathUtil.getFactorial(0); //long actual = getF ctrl + backpage
        System.out.println("0! status: expected = " + expected
                                        + "| actual = " + actual);
        
        //Test case #2: n = 1 -> expected getF(1) -> trả về 1 luôn;
        System.out.println("1! status: expected =" + expected
                                        + "| actual = " + MathUtil.getFactorial(1));
        
        //Test case #3: n = 5 -> expected getF(5) -> trả về 120;
        System.out.println("5! status: expected =" + expected
                                        + "| actual = " + MathUtil.getFactorial(5));
        
        //Test case #4: n = -5 -> expected getF(-5) -> nhận cái chửi;
        
        //System.out.println("-5! status: expected = EXCEPTION"
        //                                + "| actual = " + MathUtil.getFactorial(-5));
        
        System.out.println("-5! status: expected = EXCEPTION"
                                        + "| actual = "); 
        MathUtil.getFactorial(-5);
        //NẾU CÓ EXPECTION XẢY RA, MỪNG RƠI NƯỚC MẮT
        //VÌ HÀM CHẠY NHƯ THIẾT KẾ VỚI -5
        
        
    }
}

//VIỆC CHYAJ BỘ TEST/ XEM TỪNG DINGF KẾT QUẢ ĐƯỢC IN RA, ĐỂ KẾT LUẬN
//SO SÁNH, ĐỂ KẾT LUẬN HÀM ĐÚNG/SAI -> VỤ NÀY MẤT SỨC
//VÌ PHẢI DÙNG MẮT + SUY LUẬN -> MANUAL TEST, RẤT CẢM GIÁC THỦ CÔNG

//KO HIỆU QUẢ NẾU CODE ĐƯỢC CHỈNH SỬA, TA PHẢI LUẬN LẠI KẾT QUẢ
//BẰNG THỦ CÔNG: MẮT QUÉT QUA CÁC KẾT QUẢ, TỰ SO SÁNH, TỰ KẾT LUẬN

//KĨ THUẬT THỨ 2 XUẤT HIỆN: TEST AUTOMATION
//TỨC LÀ VẪN CHẠY BỘ TEST NHƯ MANUAL, NHƯNG KO CẦN DÙNG MẮT NHÌN
//TỪNG KẾT QUẢ ĐỂ SO SÁNH, KẾT LUẬN, MÁY DƯ SỨC SO SÁNH
//MÁY KẾT LUẬN DÙM LUÔN, TA CHỈ NHÌN 2 THỨ DUY NHẤT SAU KHI
//CHẠY QUA 1 ĐÁM TEST CASE: ĐÚNG SAI/XANH ĐỎ/ĐÚNG: XANH, SAI: ĐỎ
