/**
 * Author :  suzeyu
 * Time   :  2016-11-11  下午9:32
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *          问题: 给定两个字符串s1和s2 要求判定s2是否能够被s1做循环移位得到的字符串包含.
 *          例如: 给定s1= AABCD 和 s2=CDAB, 返回true
 *               给定s1 = ABCD 和 s2=ACBD, 则返回false
 */
public class StrRotateContainer {

    /**
     * 给定测试为真 的两个字符串
     */
    public static String s1="AABCD",s2 ="CDAB";

    /**
     * 给定测试为假 的两个字符串
     */
    public static String s3="ABCD",s4 ="ACBD";

    public static void main(String args[]){

        boolean result = resolver_1( s1,  s2);
        System.out.println("条件为真的结果:" + result);

        boolean result_2 = resolver_1( s3,  s4);
        System.out.println("条件为假的结果:" + result_2);
    }

    /**
     *      最简单,直接就是把要进行匹配的模板进行收尾相接. 直接逐位判断.
     *      例如判断 a可以循环移位是否包含b
     *              a=abc    直接先处理成abcabc即可
     */
    private static boolean resolver_1(String s1, String s2) {

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        // 进行收尾拼接
        char[] copyChars = new char[s1.length() * 2];

        System.arraycopy(c1, 0, copyChars,0,c1.length);
        System.arraycopy(c1, 0, copyChars,c1.length-1, c1.length);

        // 创建外循环使用的起点标记
        int point = 0;

        for (int i = 0; i < c1.length; i++) {
            point = i;
            for (int j=0; j<c2.length; j++){
                if (copyChars[point]  == c2[j]){
                    point++;
                    // 判断是否已经是最后一位
                    if (j==c2.length-1){
                        return true;
                    }else {
                        continue;
                    }
                }
            }
        }

        return false;
    }
}
