import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Editor {
    Canvas canvas;
    List<Shape> objects;
    public Editor(){
        objects=new LinkedList<Shape>();
    }
    public void addShape(Shape t){
        objects.add(t);
    }
    public Shape[] getShapes(){
        return objects.toArray(new Shape[0]);
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public Canvas getCanvas() {
        return canvas;
    }
}
