package com.vectorx.architectdecathlon;

/**
 * @description: IMooc
 * @author: VectorX
 * @date: 2022/9/5 21:18
 * @version: V1.0
 */
public class IMooc
{
    public static void main(String[] args) {
        Composite suite1 = new Composite("架构师成长直通车");
        suite1.add(new Course("单体应用"));
        suite1.add(new Course("分布式应用"));
        suite1.add(new Course("Spring Cloud"));
        suite1.add(new Course("容器化"));
        suite1.add(new Course("性能调优"));

        Composite suite2 = new Composite("架构师二期课程");
        suite2.add(new Course("架构设计"));
        suite2.add(new Course("质量控制"));
        suite2.add(new Course("微服务"));
        suite2.add(new Course("混沌工程"));
        suite2.add(new Course("源码阅读"));

        Composite suite3 = new Composite("架构师体系课程");
        suite3.add(suite1);
        suite3.add(suite2);

        suite3.show();
    }
}
