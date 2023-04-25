package untitled.src.this关键字;

import java.util.Random;
import java.util.Scanner;

public class Custome {
    public static void main(String[] args) {
       /* Text01 ha = new Text01();
        ha.name = " 爱莉希雅";
        ha.Tx();
        Text01 hai = new Text01();
        hai.name = "赵鸣宇";
        hai.Tx();*/
       /* String a = "赵鸣宇";
        a = a.concat("赵鸣宇");
        System.out.println(a);*/
       /* String sys = "学生信息管理";// 字义一个字符串表示系统名称
        System.out.println("欢迎进入《" + sys + "》系统");// 输出系统名称
          System.out.println("请设置一个管理员密码：");
        Scanner a = new Scanner(System.in);
         String pass = a.next();// 获取用户输入的密码
        int length = pass.length();// 获取密码的长度
       b: if (length > 6 && length < 12) {
            System.out.println("密码长度符合规定。");
            System.out.println("已生效，请牢记密码：" + pass);
        } else if (length >= 12) {
            System.out.println("密码过长，请重新输入");

                   } else {

            System.out.println("密码过短，请重新输入");
 */
       /* String en = "The Day You Went Away";    // 定义原始字符串
        System.out.println("原始字符串："+en);
        System.out.println("使用 toLowerCase() 方法之后为："+en.toLowerCase());
        System.out.println("使用 toUpperCase() 方法之后为："+en.toUpperCase());
        //String 类的 toLowerCase() 方法可以将字符串中的所有字符全部转换成小写，而非字母的字符不受影响。语法格式如下
        //toUpperCase() 则将字符串中的所有字符全部转换成大写，而非字母的字符不受影响
        en = "sun sun 是太阳，圆圆挂在 SKY 上";    // 定义原始字符串
        System.out.println("原始字符串："+en);
        System.out.println("使用 toLowerCase() 方法之后为："+en.toLowerCase());
        System.out.println("使用 toUpperCase() 方法之后为："+en.toUpperCase());

        en = "select id,name,sex,address,birthday from students";
        System.out.println("原始字符串："+en);    // 定义原始字符串
        System.out.println("使用 toLowerCase() 方法之后为："+en.toLowerCase());
        System.out.println("使用 toUpperCase() 方法之后为："+en.toUpperCase());
        }*/
        /*// 定义一个空的字符串缓冲区，含有16个字符的容量
        StringBuffer str1 = new StringBuffer();
// 定义一个含有10个字符容量的字符串缓冲区
        StringBuffer str2 = new StringBuffer(10);
// 定义一个含有(16+4)的字符串缓冲区，"青春无悔"为4个字符
        StringBuffer str3 = new StringBuffer("青春无悔");

         *输出字符串的容量大小
         *capacity()方法返回字符串的容量大小

        System.out.println(str1.capacity());    // 输出 16
        System.out.println(str2.capacity());    // 输出 10
        System.out.println(str3.capacity());*/
        Random r = new Random();
        double d1 = r.nextDouble(); // 生成[0,1.0]区间的小数
        double d2 = r.nextDouble() * 7; // 生成[0,7.0]区间的小数
        int i1 = r.nextInt(10); // 生成[0,10]区间的整数
        int i2 = r.nextInt(18) - 3; // 生成[-3,15)区间的整数
        long l1 = r.nextLong(); // 生成一个随机长整型值
        boolean b1 = r.nextBoolean(); // 生成一个随机布尔型值
        float f1 = r.nextFloat(); // 生成一个随机浮点型值
        System.out.println("生成的[0,1.0]区间的小数是：" + d1);
        System.out.println("生成的[0,7.0]区间的小数是：" + d2);
        System.out.println("生成的[0,10]区间的整数是：" + i1);
        System.out.println("生成的[-3,15]区间的整数是：" + i2);
        System.out.println("生成一个随机长整型值：" + l1);
        System.out.println("生成一个随机布尔型值：" + b1);
        System.out.println("生成一个随机浮点型值：" + f1);
        System.out.print("下期七星彩开奖号码预测：");
        for (int i = 1; i < 8; i++) {
            int num = r.nextInt(9); // 生成[0,9]区间的整数
            System.out.print(num);
        }
    }}

