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
public class MathUtility {

    //fake class Math giống như thật
    //Math.sqrt() .abs()  .pow()   .sin()   .PI()
    public static final double PI = 3.1415;

    //tính n! = 1.2.3.4...n
    //21! tràn long rồi, âm giai thừa ko tính đc, vô nghĩa
    //bài này mình chỉ tính gt trong khoảng từ 0-20
    //Nếu đưa n cà chớn <0 hoặc >20 => chửi, ko tính, ko return
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0-20");
        }
        if (n == 0 || n == 1) {
            return 1; //n đặc biệt return luôn
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    //tự tin hàm chạy đúng như thiết kế
    //éo tin, phải test đã
    //có nhiều cách để test
    //kiểu gì cũng phải là : mình tính trước kết quả hàm cần trả về EXPECTED VALUE
    //                       mình gọi hàm coi nó chạy ra mấy, ACTUAL VALUE
    //so sánh coi EXPECTED VALUE = ACTUAL VALUE hay ko
    //                      Có bằng, hàm chạy đúng cho tình huống x
    //                      Ko bằng, hàm chạy sai cho tình huống x
    //ví dụ:
    //tao nghĩ rằng 5! phải là 120 (expected)
    //giờ tao gọi hàm getFactorial (5 đưa vào), coi ra kết quả mấy (actual)
    //nếu actual giả sử là 120 luôn, may quá hàm đúng cho 5! vì khớp kì vọng
    //case(tình huống) n = 5 hàm đúng
    //case             n = 6 hàm trả về 720 thì là hàm đúng
    //case             n = 0 hàm trả về 1 thì là hàm đúng
    //...
    //làm các case mà mình nghĩ là người dùng 
}
