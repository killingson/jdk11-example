package com.company.var;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liujiada
 * @date 2021/7/25
 */
public class Example {

    public static void main(String[] args) throws Exception {
        var list   = new ArrayList<String>();   // 自动推断 ArrayList<String>
        var stream = list.stream();             // 自动推断 Stream<String>

        var newList = List.of("hello", "biezhi");
        newList.forEach(System.out::println);

        String fileName = "./pom.xml";

        var path  = Paths.get(fileName);
        var bytes = Files.readAllBytes(path);

        System.out.println("字节数组: " + bytes);

        for (var b : bytes) {
            // TODO
        }

        try (var foo = new FileInputStream(new File(""))) {
            System.out.println(foo);
        } catch (Exception e) {
            // ignore
        }

    }
}
