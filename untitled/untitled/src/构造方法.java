public class 构造方法 {
    /*
    1构造方法名得和类名相同，2不能写返回值类型，3不能使用return来返回值，但是可以用来结束语句
    构造方法能不能对类里的成员变量进行操作
    new 构造方法名（实参列表）
    构造方法也是写在main方法，得先压栈主方法，然后在主方法里面调用构造方法，也就会创造对象，初始化对象属性了这些是在主方法里面的当然主方法先执行
    逐行分析，第五行中调用了u变量，在main方法中存储开辟了u的内存地址，然后add方法又调用了u变量，又开辟了新的内存空间，由于调用的是同一个user方法所以u的内存地址是不变的
    c从头到尾u赋的值都是20，没有边，无论这个u是存储在main方法中还是add方法中，里面保存的值都是20，只是从main“复制”过去到add方法去，都指向user对象
    所以“复制”过去的都是u的内存地址，实际上它们两个都指向了user对象，所以都是指向了user对象，保存了20这个值
    */

}
