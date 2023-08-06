package com.vectorx.architectdecathlon;

/**
 * @description: Component
 * @author: VectorX
 * @date: 2022/9/5 21:06
 * @version: V1.0
 */
public interface Component
{
    void add(Component c);

    void remove(Component c);

    void show();
}
