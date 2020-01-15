package com.jkzzk.jvm.test;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemory {
    public static void main(String[] args) {
        List<Demo> demoList = new ArrayList<>();

        while(true) {
            demoList.add(new Demo());
        }
    }
}
