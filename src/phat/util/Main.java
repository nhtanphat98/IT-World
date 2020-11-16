/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phat.util;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        //kĩ thuật test căn bản: nhìn bằng mắt các test case để kết luận hàm 
        // đúng sai
        long expected = 120;
        long actual = MathUtility.getFactorial(5);
        //kì vọng 120, mày chạy thực tế ra cái gì thì t lưu ở actual
        //so sánh bằng mắt
        System.out.println("5! ? expected: " + expected + "; actual: " + actual);
        System.out.println("6! ? expected: 720; actual: " + MathUtility.getFactorial(6));
        System.out.println("0! ? expected: 1; actual: " + MathUtility.getFactorial(0));
        //Tao kì vọng mày ném về ngoại lệ nếu tao đưa âm giai thừa
        MathUtility.getFactorial(-5);
        //ko sout() vì chết ngay khi gọi hàm rồi
        //chống mắt xem có đúng ngoại lệ mình cần như thiết kế để chửi thằng xài
        //hàm ko đúng cách
    }
}
//nhược điểm của kĩ thuật này:
//cần phải dùng mắt để so sánh từng trường hợp xài hàm: so expected và actual
//nếu test nhiều tình huống, mắt đủ mệt mỏi vì phải dò từng output

//cách nâng cao:
//gom cả đám test cases này lại, chạy 1 lượt như ở trên
//máy so giùm ta luôn expected và actual
//sau đó
//Nếu tất cả các cases mà đều đúng, THẨY RA 1 MÀU XANH - ĐÈN XANH - CODE ỔN
//NẾU TẤT CẢ CÁC CASES ĐỀU ĐÚNG, NGOẠI TRỪ CÓ 1, 2 VÀI THẰNG NÀO ĐÓ
//EXPECTED KHÁC ACTUAL, THẨY RA 1 MÀU ĐỎ, HÀM Ý, HÀM SAI RỒI
//                          HÀM ĐÚNG GẦN HẾT, MÀ SAI 1 VÀI, KO TIN CẬY XÀI HÀM
//ĐỎ: CHỈ CÓ ÍT NHẤT 1 CẶP EXPECTED ACTUAL KO BẰNG NHAU, KẾT LUẬN NGAY HÀM SAI

//THAY VÌ NHÌN TỪNG CASE, TA SẼ NHÌN CHỈ MÀU XANH HOẶC ĐỎ LÀ ĐỦ RỒI
//TA CẦN THÊM BỘ THƯ VIỆN ĐỂ GIÚP TA VIỆC NÀY
//BỘ THƯ VIỆN NÓ LÀM 2 VIỆC: SO SÁNH GIÙM ACTUAL VS. EXPECTED
//          KHỚP -> THẨY RA MÀU XANH
//          KO KHỚP -> THẨY RA MÀU ĐỎ
//NÓ TỰ QUÉT HẾT CÁC CASE MÀ MÌNH ĐÃ THIẾT KẾ ĐỂ NÓ KẾT LUẬN, MẮT NHÌN DUY NHẤT
//MÀU LÀ ĐỦ
//BỘ THƯ VIỆN NÀY CHÍNH LÀ NHỮNG FILE .JAR, .DLL ĐC ADD THÊM VÀO PROJECT
//BỘ THƯ VIỆN NÀY MANG CÁI TÊN CHUNG CHO MỌI NGÔN NGỮ LẬP TRÌNH - Unit test
//riêng cho java: JUnit, TestNG
//          C# : NUnit
//          
