/* Create class Rectangle
length, breadth
area()
perimeter()   */

class Rectangle{
    int length;
    int breadth;
    Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    int area(){
        return length*breadth;
    }
    int perimeter(){
        return 2*(length + breadth);
    }
}

public class Rectangleclass {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(20,40);
        System.out.println("Area of rectangle :"+obj.area());
        System.out.println("Perimeter of rectangle :" +obj.perimeter());
    }
    
}
