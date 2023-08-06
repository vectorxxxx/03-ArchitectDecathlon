package com.vectorx.architectdecathlon;

import lombok.AllArgsConstructor;

/**
 * @description: Course
 * @author: VectorX
 * @date: 2022/9/5 21:07
 * @version: V1.0
 */
@AllArgsConstructor
public class Course implements Component
{
    private String name;

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public void show() {
        System.out.println("课程名称："+ name);
    }
}
