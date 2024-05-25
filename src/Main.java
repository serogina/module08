import java.time.chrono.IsoChronology;

public class Main {
    public static void main(String[] args) {
       ShapePrinter shapePrinter = new ShapePrinter();

       Shape circle = new Circle();
       shapePrinter.printShape(circle);

       Shape quad = new Quad();
       shapePrinter.printShape(quad);

       Shape triangle = new Triangle();
       shapePrinter.printShape(triangle);

       Shape oval = new Oval();
       shapePrinter.printShape(oval);

       Shape rhombus = new Rhombus();
       shapePrinter.printShape(rhombus);
    }
}