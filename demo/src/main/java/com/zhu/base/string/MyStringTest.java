package com.zhu.base.string;

import com.zhu.base.property.Mypropetry;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


/**
 * Created with IntelliJ IDEA.
 * Author: as
 * Time:  2017/9/28 15:31
 * Description:
 */
public class MyStringTest {

    @Test
    public void IOU() throws Exception{
        List<String> lines = new ArrayList<>();
        for (int i = 0 ; i < 100000 ; i++){
            lines.add("非凡之星-"+i);
        }
        String path = MyStringTest.class.getResource("/").getPath()+"1.txt";
        File file = new File(path);
        if(file.exists()==false){
            file.createNewFile();
        }
        IOUtils.writeLines(lines,  null, new FileOutputStream(path));
        FileInputStream fileInputStream = new FileInputStream(path);
        List<String> list = IOUtils.readLines(fileInputStream);

        FileUtils.writeLines(file, lines);

        System.out.print(list);

    }
    @Test
    public void STR() throws Exception{
        
//        System.out.println(StringUtils.isBlank(""));
//        System.out.println(StringUtils.isBlank(null));
//
//        System.out.println(StringUtils.isEmpty(""));
//        System.out.println(StringUtils.isEmpty(null));

//        System.out.println(StringUtils.trimToEmpty(null));
//        System.out.println(StringUtils.trimToNull(""));

        List<String> lines = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++){
            lines.add("非凡之星");
        }
        System.out.println(StringUtils.join(lines, ""));
        System.out.println(StringUtils.remove("asdf", "sd"));
    }

    @Test
    public void t4(){
        Long start1 = System.nanoTime();
        String a = "abc";
        a = a +"efg";
        Long end1 = System.nanoTime();
        System.out.println("time: "+(end1-start1));

        Long start2 = System.nanoTime();
        StringBuffer aa = new StringBuffer("abc");
        aa.append("efg");
        Long end2 = System.nanoTime();
        System.out.println("time: "+(end2-start2));

        Long start3 = System.nanoTime();
        StringBuilder aaa = new StringBuilder("abc");
        aaa.append("efg");
        aaa.toString();
        Long end3 = System.nanoTime();
        System.out.println("time: "+(end3-start3));

    }

    @Test
    public void t5(){
        String s = MyStringTest.class.getResource("/").getPath();
        System.out.println(s);
    }
}
