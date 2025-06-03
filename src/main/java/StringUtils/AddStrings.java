package StringUtils;

public class AddStrings {
    /**
     * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和并以字符串形式返回结果。
     * 你不能使用任何内建的处理大整数的库（比如 BigInteger）， 也不能使用语言库内建的方法直接将输入的字符串转换为整数形式。
     * 备注
     * 1 <= num1.length和num2.length <= 104
     * num1 和num2 都只包含数字 0-9
     * num1 和num2 都不包含任何前导零
     * @param args
     */
    public static void main(String[] args) {
//        LocalDateTime startOfYear = LocalDateTime.now().withDayOfYear(1).withHour(0).withMinute(0).withSecond(0).withNano(0);
//        LocalDateTime endOfYear = startOfYear.plusYears(1).minusNanos(1);
//        Date startDate = Date.from(startOfYear.atZone(ZoneId.systemDefault()).toInstant());
//        Date endDate = Date.from(endOfYear.atZone(ZoneId.systemDefault()).toInstant());
//        System.out.println(startDate);
//        System.out.println(endDate)
//        ;
        String num1 = "123";
        String num2 = "987";
        //System.out.println(addSting(num1, num2));
        System.out.println(reverse(2147483647));

    }

    public static String addSting(String num1,String num2){
        StringBuilder sb = new StringBuilder();
        int i = num1.length()-1,j = num2.length()-1, carry = 0;
        while (i>= 0|| j>=0||carry!=0){
            int n1 = (i>=0)? num1.charAt(i) - '0':0;
            int n2 = (j>=0)?num2.charAt(j) - '0':0;
            int sum = n1+n2+carry;
            sb.append(sum%10);
            carry = sum/10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
    /**
     * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
     *
     * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
     *
     * 假设环境不允许存储 64 位整数（有符号或无符号）。
     */

    public static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int pop = x % 10;       // 取出最低位
            x = x / 10;             // 去掉最低位

            // 判断溢出
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            res = res * 10 + pop;
        }
        return res;
    }



}
