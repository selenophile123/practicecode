
/*Through this program iam implementing all 4 Pillers of Oops java      */
package OopsPillars;
import java.util.Scanner;

abstract class Shape {
    float area;
    abstract void acceptInput();
    abstract void compute();
    public void disp(){
        System.out.println("Area is "+area);

    }
}
class Square extends Shape{
    private float length;
    public void acceptInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A length of Square");
        length=sc.nextFloat();
    }
    public void compute() {
        area = length * length;
    }

}
class Rectangle extends Shape{
   private float length;
   private float breadth;
   public void acceptInput(){
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter length of rectangle");
       length=sc.nextFloat();
       System.out.println("breadth of the rectanle");
       breadth=sc.nextFloat();
   }
   public void compute(){
       area=length*breadth;
   }
}
class Circle extends Shape{
    private float radius;
    public void acceptInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius");
        radius=sc.nextFloat();
    }
    public void compute(){
        area = 3.14f*radius*radius;
    }

        }
    class Geometry{
      public void JaiHo(Shape ref){  // Here iam Achieving polyMorphism for loosCoupling
          ref.acceptInput();
          ref.compute();
          ref.disp();
      }

    }
    class Test{
    public static void main(String[] args){
        Square s= new Square();
        Rectangle r= new Rectangle();
        Circle c = new Circle();

        Geometry g= new Geometry();
        g.JaiHo(s);
        g.JaiHo(r);
        g.JaiHo(c);

    }
    }