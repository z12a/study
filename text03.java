/*public class text03 {
    public static void main(String[] args){     
             text03.sum(1, 0);    
    }
    public static void sum(int a,int b){        //mySQL叫储存过程或者视图。EXCEL叫函数，c语言叫方法，access也叫方法，或调用Sub子程序
        System.out.print(a+"+"+b+"="+(a+b));    //方法定义在类体当中 方法体之外;“pubic class 类名{}”大括号中的代码就是类体
    } //修饰符  返回值变量 方法名称（形式参数）{};函数（方法）执行时（外联）编译器自动跳转到函数所在的地址执行，执行后返回主函数，所以，返回值为空时，不需要return

      boolean flag = false;
      for (int i = 0; i <= 3; i++) {
          if (i == 0) {
              System.out.println("0");
          } else if (i == 1) {
              System.out.println("1");
              continue;
          } else if (i == 2) {
              System.out.println("2");
              flag = true;
          } else if (i == 3) {
              System.out.println("3");
              break;
          } else if (i == 4) {
              System.out.println("4");
          }
          System.out.println("xixi");
      }
      if (flag) {
          System.out.println("haha");
          return;
      }
      System.out.println("heihei");*/
      public class text03 {

        public static void printVariable(String... args) {
            String[] var1 = args;
            int var2 = args.length;
    
            for(int var3 = 0; var3 < var2; ++var3) {
                String s = var1[var3];
                System.out.println(s);
            }
    
        }
         
    
    
    
  }



