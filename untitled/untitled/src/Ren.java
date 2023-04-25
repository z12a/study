public class Ren {
    public static void main(String[] args) {
        Car ha = new Car();
        ha.setName("ha");
        ha.setAge(100);
        System.out.println(ha.getAge());
        System.out.println(ha.getName());
    }
//修改属性用set方法，为：public void getAge(int a){  age=a}
// 读取用get 为：public int getAge ( ){ return age;}
    //使用static关键字的方法存在静态区，不用实例化具体的对象即可使用，定义的工具类会使用
    //方法中没有static的用引用.方法名（），有static的用类名.方法名
}
