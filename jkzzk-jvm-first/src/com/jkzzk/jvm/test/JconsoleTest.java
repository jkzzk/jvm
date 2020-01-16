package com.jkzzk.jvm.test;

import java.util.ArrayList;
import java.util.List;

public class JconsoleTest {

    /*
    *   jdk自带的内存监控工具  jconsole
    *
    *   java技术体系：
    *       1.java程序设计语言
    *       2.各个平台上的java虚拟机
    *       3.Class格式，java编译
    *       4.java类库、第三方类库
    * */
    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(6000);
        fill(10000);

    }

    private static void fill(int n) throws InterruptedException {
        List<Demo> demoList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Thread.sleep(100);
            demoList.add(new Demo());
        }
    }

}
