package HomeWork;

import java.sql.SQLOutput;

public class Main {
    public static void main (String [] args){

    Triangle triangle = new Triangle(5,3,7,14);
    Rectangle rectangle = new Rectangle(10,20);
    Circle circle = new Circle(10,3.14f);
    Triangle triangle1 = new Triangle(3,5,7,17);
    Rectangle rectangle1 = new Rectangle(13,22);

        System.out.println("Периметр треугольника: "+triangle.P()+ " " + "Площадь треугольника: " + triangle.S());
        System.out.println("Периметр прямоугольника: "+rectangle.P()+ " "  + "Площадь прямоугольника: " + rectangle.S());
        System.out.println("Периметр круга: "+circle.P()+ " "  + "Площадь круга: " + circle.S());
        System.out.println();

        Figures [] array = new Figures[5];
        array[0] = rectangle;
        array[1] = triangle;
        array[2] = circle;
        array[3] = triangle1;
        array[4] = rectangle1;

        double sum = 0;
        for(Figures i: array){
            sum += i.P();
        }

        System.out.println("Сумма периметров: " + sum);


    }
}
