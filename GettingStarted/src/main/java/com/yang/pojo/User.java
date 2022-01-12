package com.yang.pojo;


import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author zhangyang
 * @date 2022/01/10 23:06
 **/
public class User {
    private static final Logger logger = LoggerFactory.getLogger(User.class);

    private String name;

    // 注入 数组类型 属性
    private String[] courses;
    // 注入 list集合 属性
    private List<String> list;
    // 注入 map集合 属性
    private Map<String, String> maps;
    // 注入 set集合 属性
    private Set<String> sets;

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add() {
        logger.warn("add......");
    }
}
