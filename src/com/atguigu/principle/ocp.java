package com.atguigu.principle;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/23 14:57
 *
 *
 * 开闭原则
 * 1)	优点是比较好理解，简单易操作。
 * 2)	缺点是违反了设计模式的 ocp 原则，即对扩展开放(提供方)，对修改关闭(使用方)。即当我们给类增加新功能的时候，尽量不修改代码，或者尽可能少修改代码.
 * 3)	比如我们这时要新增加一个图形种类 三角形，我们需要做如下修改，修改的地方较多
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
        if (s.m_type == 1){
            drawRextangle();
        }else {
            if (s.m_type == 2){
                drawCircle();
            }
        }
    }

    private   void drawRextangle(){
        System.out.println("绘制矩形");
    }

    private   void drawCircle(){
        System.out.println("绘制圆形");
    }
}

// Shape类，基类
class Shape{
    int m_type;
}
// 矩形
class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }
}
// 圆形
class Circle extends Shape{
    Circle(){
        super.m_type = 2;
    }
}