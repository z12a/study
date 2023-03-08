import java.text.BreakIterator;

public class text02 {
    public static void main(String[] args) {
        /*
         * for(int a=0; a<10;a+=2){
         * a+=2; 2 6 10
         * System.out.println(a);
         * }
         */
        /*
         * for(int a=0; a<10; ){
         * a+=2; 2 4 6 8 10
         * System.out.println(a);
         * }
         */
        /*
         * for(int a=0; a<10;a+=2){
         * System.out.println(a); 2 4 6 8
         * a+=2;
         * }
         */
        /*
         * for(int a=1;a<=100;a+=2){
         * System.out.println(a);
         * }
         */
        /*
         * for(int a=0;a<=100;++a){
         * if(a%2==1){
         * System.out.println(a);}
         * else{
         * System.out.println("偶数"+a);
         * }
         * }
         */
        /*
         * int sum=0;
         * for(int a=0; a<1000000000; ){
         * a+=2;
         * sum+=a;
         * } System.out.println("偶数"+sum);
         * for(int a=1;a<=10;++a){
         * for(int b=1;b<=10;++b){ //第1个for循环10次，第2个结果循环10次；结束break完成才算1次；
         * System.out.println(b);
         * }
         * }
         * // for(int c = 1 ; c <=9 ; c ++ )
         * for(int i = 1;i<=9;i++)
         * {for(int j =1;j<=i;j++)
         * {System.out.print(i+"*"+j+"="+(i*j+"\n"));}
         * }
         * String a="hello";
         * String b=a.substring(0,3);
         * System.out.print(b);
         * for(int i = 0;i <= 9;i++){
         * for(int j =1; j<=i;j++){
         * System.out.print(i+"*"+j+"="+(i*j)+" ");
         * " "之间可以加\t表示换行，不用System.out.println();
         * }
         * System.out.println();
         * }
         * 
         * for(int a = 1;a <=100;a++ ){
         * for(int b=a-1; 1<b;b--){
         * if(a%b==0){
         * System.out.print(a+" ");
         * }
         * }
         * }
         * int a=1,b = 2;
         * while(a>b){
         * System.out.print(" 呵呵");
         * }
         * System.out.print(" kk");
         * while(true){
         * 
         * }
         * int c=1;
         * while(c<=10){ do{boleen语句}while()
         * System.out.print(c);
         * c++;
         * }
         * System.out.print(" "+c);
         * for(int a=1;a<10;a++){
         * if(a==7){
         * }
         * System.out.print(a);
         * }
         * for1:for(int a=1;a<5;a++){
         * for2:for(int z=1;z<10;z++){
         * if(a==7){
         * break for1; break只终止最近的循环，可以控制终止那个循环
         * break循环名称
         * }
         * System.out.print(a);
         * }
         * }
         * 
         * for(int a=1;a<10;a++){
         * if(a==7){
         * continue ;                //continue表示跳过本轮剩下语句直接进行下一轮循环.break是跳出循环，continue是直接到下一循环
         * //continue循环名称
         * }
         * System.out.print(a);
         * }
         * 
         * for(int b=0;b<100;b++){
         * for(int a=0;a<=b;a++){
         * if(a%b!=0){
         * System.out.print(a+"是素数");
         * 
         * } else{
         * break;
         * }
         * }
         * }
         * int a=7;
         * boolean shu=true;
         * for(int b=0;b<a;b++){                                           //如果b=1，或0；7%1=0；不符合素数判断
         * if(a%b==0){
         * shu=false;
         * break;
         * 
         * }
         * }
         * System.out.print(shu ? a+" 是":a+" 不是");
         * java.util.Scanner c=new java.util.Scanner(System.in);
         * System.out.println("请输入数字");
         * int a=c.nextInt();{
         * boolean shu=true;
         * for(int b=2;b<a;b++){
         * if(a%b==0){
         * shu=false;
         * //或者：两个for里的判断写成i<=100,j<=100；i,j都从1开始，只要i%j==0的个数只有俩（一个1，一个自己），就可以判断输出i为素数
         * break;
         * 
         * }
         * }
         * System.out.println(shu ? a+" 是":a+" 不是");
         * }
         */
                                                    // 1既不是素数也不是和数
        int acc = 0;
        for (int a = 2; a < 100; a++) {
            boolean shu = true;                      //3目运算符
            for (int b = 2; b < a; b++) {
                if (a % b == 0) {
                    shu = false;
                    break;

                }
            }
            if (shu) {
                System.out.println(shu ? a + " 是" : a + " 不是");
                acc++;
                if (acc % 8 == 0) {                       // 8个换1行或者if(acc==8){System.out.println();acc=0; }
                    System.out.println();
                }
            }
        }
    }
}
