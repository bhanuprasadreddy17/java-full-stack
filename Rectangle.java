class Rectangle{
double length;
double breadth;

Rectangle(double length, double bredth) {
this.length = length;
this.breadth = breadth;
}

int getPerimeter() {
return 2*(length+breadth);
}
}

public class main
public static void main(String args[])
{
Rectangle loki=new Rectangle(2,6);
int perimeter = rc.getPerimeter();
System.out.print("Perimeter: " + perimeter);
}
}

.................


package lpu.com;

class Rectangle {
    int width;
    int height;

    Rectangle() {
        this.width = 0;
        this.height = 0;
    }
    int getPerimeter() {
        return 2*(width+height);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        System.out.println("witing Main");
        int perimeter = rc.getPerimeter();
        System.out.println("Perimeter: " + perimeter);
    }
}
