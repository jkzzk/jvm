package com.jkzzk.jvm.test;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemory {
    /*
    *   将运行时错误Dump下来的命令：
    *       -XX:+HeapDumpOnOutOfMemoryError
    *   设置jvm运行初始内存和最大内存
    *       -Xms20m -Xmx20m
    * */
    public static void main(String[] args) {
        List<Demo> demoList = new ArrayList<>();

        while(true) {
            demoList.add(new Demo());
        }
    }
}
