package com.simon.reflection;

/**
 * created by Simon on 2020/12/12 15:06
 */
public class ReflectionTest {

    public static void main(String[] args) {
        try {
            Class targetClass1 = Class.forName("com.simon.reflection.TargetClass");
            Class targetClass2 = Class.forName("com.simon.reflection.TargetClass");
            Class targetClass3 = Class.forName("com.simon.reflection.TargetClass");
            //一个类在内容中只有一个Class对象，所以以下打印的内容都是相同的。
            System.out.println(targetClass1.hashCode());
            System.out.println(targetClass2.hashCode());
            System.out.println(targetClass3.hashCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        /**
         * 1.获取class对象的几种方式
         * Target.class 最为安全可靠，性能最高
         * 2.已知该类的实例，调用该类的getClass()方法获取Class实例(getClass为Object中的方法)
         * TargetClass targetClass = new TargetClass("Simon", 20);
         * Class tc = targetClass.getClass();
         * 3已知一个类的全类名，且该类在类路径下，可通过Class的类的静态方法forName()获取
         * 可能抛出ClassNotFoundException
         * Class targetClass1 = Class.forName("com.simon.reflection.TargetClass");
         */


    }
}


