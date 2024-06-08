package entities;

public class Rectangle {

    public double width;
    public double heigth;

    public double area(){

        return width*heigth;
    }

    public double perimeter(){

        return 2*width + 2*heigth;
    }

    public double diagonal(){

        return Math.sqrt(heigth*heigth + width*width);
    }

    public String toString(){

        return 
        String.format("AREA = %.2f\n",area()) + 
        String.format("PERIMETER = %.2f\n",perimeter()) + 
        String.format("DIAGONAL = %.2f\n",diagonal());
    }
}
