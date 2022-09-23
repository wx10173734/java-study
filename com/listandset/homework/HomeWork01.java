package com.listandset.homework;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @title: HomeWork01
 * @Author luozouchen
 * @Date: 2022/9/23 23:00
 * @Version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        News news1 = new News("新冠病毒确诊病例超千万，数百万印度教信徒赴恒河“圣域”引民众担忧");
        News news2 = new News("男子突然想起两个月前钓的鱼还在网兜里，捞起一看赶紧放生");
        List arrayList = new ArrayList<>();
        arrayList.add(news1);
        arrayList.add(news2);
        Collections.reverse(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
            News news = (News) arrayList.get(i);
            System.out.println(processTitle(news.getTitle()));
        }
    }

    //专门写一个方法，处理显示新闻标题
    public static String processTitle(String title) {
        if (title == null) {
            return "";
        }
        if (title.length() > 15) {
            return title.substring(0, 15) + "...";//范围[0,15)
        } else {
            return title;
        }
    }
}

class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "news{" +
                "title='" + title + '\'' +
                '}';
    }
}
