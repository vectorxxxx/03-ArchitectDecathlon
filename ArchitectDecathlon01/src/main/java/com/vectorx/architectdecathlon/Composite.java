package com.vectorx.architectdecathlon;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: Composite
 * @author: VectorX
 * @date: 2022/9/5 21:12
 * @version: V1.0
 */
@RequiredArgsConstructor
public class Composite implements Component
{
    private List<Component> components = new ArrayList<>();

    @NonNull
    private String name;

    @Override
    public void add(Component c) {
        components.add(c);
    }

    @Override
    public void remove(Component c) {
        components.remove(c);
    }

    @Override
    public void show() {
        System.out.println("\n系列课程名称：" + name);
        System.out.println("=================");
        components.forEach(Component::show);
    }
}
