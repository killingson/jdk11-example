package com.company.files;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Files 读写文本文件
 *
 * @author liujiada
 * @date 2021/7/25
 */
public class Example {

    public static void main(String[] args) throws Exception {
        String text = "Hello biezhi.";

        // 写入文本
        Files.writeString(Paths.get("hello.txt"), text);

        // 读取文本
        String readText = Files.readString(Paths.get("hello.txt"));
        System.out.println(text.equals(readText));

        // 删除文本
        Files.delete(Paths.get("hello.txt"));
    }

}