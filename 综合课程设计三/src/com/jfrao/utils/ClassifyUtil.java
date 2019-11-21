package com.jfrao.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;

public class ClassifyUtil {

    public static int classification(String message) {

        //读取词典文件
        StringBuffer bf = new StringBuffer();
        BufferedReader br = null;
        String text = null;
        try {
            br = new BufferedReader(new FileReader("D:\\IDEA\\ideaProject\\综合课程设计三\\web\\words"));
            String str = null;
            while ((str = br.readLine()) != null) {
                bf.append(str.trim());
            }
            text = bf.toString();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //划分词典
        String[] type = text.split(";");
        for (int i = 0; i < type.length; i++) {
            String[] tmp = type[i].split("\\s");
            HashSet<String> words = new HashSet<>(Arrays.asList(tmp));
            System.out.println(words);

            //分词判断
            String temp = null;
            String msg = message;
            while (msg.length() > 0) {
                for (int j = 0; j < msg.length(); j++) {
                    temp = msg.substring(j);
                    if (words.contains(temp)) {
                        return i;
                    }
                }
                msg = msg.substring(0, msg.length() - 1);
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int index = ClassifyUtil.classification("这是一条行政处罚");
        System.out.println(index);
    }
}