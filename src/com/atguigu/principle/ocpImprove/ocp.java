package com.atguigu.principle.ocpImprove;
import java.util.concurrent.*;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/23 14:57
 *
 *
 * 开闭原则
 */
public class ocp {
    public static void main(String[] args) {
        // 使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
    }
}

// 这是一个用于绘制图的类
class GraphicEditor{
// 接受Shape对象，然后根据Type，来绘制不同的图形
    public void drawShape(Shape s){
            s.draw();
    }
}

// Shape类，基类
abstract class  Shape{
    int m_type;
    public abstract void draw();
}

// 矩形
class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

// 圆形
class Circle extends Shape{
    Circle(){
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}