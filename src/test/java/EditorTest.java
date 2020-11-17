import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.awt.*;

public class EditorTest extends TestCase {
    Editor editor;
    @BeforeClass
    public void setUp(){
        editor=new Editor();

    }

    @Test
    public void testAddShape() {
        editor.addShape(new Rectangle());
        editor.addShape(null);
        Shape[] obj=editor.getShapes();


        Assert.assertEquals(editor.getShapes(),obj); //фактически сравнивает
        Assert.assertSame(editor.getShapes(),obj); //сравнивает ссылки
    }
    @Test
    public void testAddShape_NOT_NULL() {
        editor.addShape(new Rectangle());
        editor.addShape(null);
        Shape[] obj=editor.getShapes();
        Assert.assertNotNull(obj[0]);

        Assert.assertNotNull(obj[1]);//не проходит
    }

    @Test
    public void testSetCanvas() {
        editor.setCanvas(null);
    }

    @Test
    public void testGetCanvas_NOT_NULL(){
        editor.setCanvas(new Canvas());
        Assert.assertNotNull(editor);
    }
}