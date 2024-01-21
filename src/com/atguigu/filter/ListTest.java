package com.atguigu.filter;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author xqrui
 * @date 2022/3/1
 * @dec 描述
 */
public class ListTest {
    public static void main(String[] args) {
        String str1="ZX2022-99";
        String str2="ZX2022-100";
        System.out.println(str1.length());
        System.out.println(str2.length());
         Son son= new Son();
         son.print();
    }

    class Overload{

    }


}
class  Father{
    public void print(){
        System.out.println("父类输出！");
    }
}

class Son extends  Father{

}
