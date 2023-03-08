public class text04 {
    /*public static void main(String[] args){
        //text04.sum(10, 20);  
        int a = 10;
        text04.sum(a,30);                                  //实参,sum(10, 20); 也可以
    }
    public static void sum(int i,int j){                           //形参
        System.out.println(i+"+"+j+"="+(i+j));
    }
    public static void sum(int i,int j){                           
        System.out.println(i+"+"+j+"="+(i+j));
        text04.dosome();
    }
    public static void main(String[] args){
        text04.sum(20,30);
        System.out.println("hello world");             //方法调用不一定在main中，可以在其他方法中
    }
    public static void dosome(){
        System.out.println("dosome");
    }
    public static void main(String[] args){
        //text04.sum();flase参数数量不同
       // text04.sum(true, false);实参与形参类型不对，可以加强制转换
       text04.sum(10L, 20L);                                     //调用时要求实参形参类型数量相同；类型不同的时候要求可以自动类型转换，不能自动转换我们要强制转换
    }
    public static void sum(Long i,Long j){                           //形参
        System.out.println(i+"+"+j+"="+(i+j));
    }
    public static void main(String[] args){
        text04.dosome(args);
    }                                                        //修饰符列表中有static关键字，完整的调用方式：类名.方法名（）实参列表
    public static void dosome(String[] args){
        System.out.println("dosome");  
    }    
    public static void main(String[] args){
        A.dosome(args);
    }    
    class A{                                                    
    public static void dosome(String[] args){              //在一个java源文件中可以设置多个class字节码文件
        System.out.println("dosome");             //调用一个方法体当中的实参时，如果被调用的实际参数中还有其他实际参数，那么就以上而下的原则依次执行，然后返回继续往下执行方法体
    }  }  */                                       //非void，要return
    public static void main(String[] args){
         
        int i=divide(2, 2);
        System.out.println(i);
    }                                                   
    public static int  divide( int a , int b){ 
        int c =a/b;            
         return c;                          //可以是return a/b
    } 
    }    
