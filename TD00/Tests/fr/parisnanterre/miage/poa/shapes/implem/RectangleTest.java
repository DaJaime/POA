package fr.parisnanterre.miage.poa.shapes.implem;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RectangleTest {

    Rectangle r1;

    @BeforeMethod
    public void setUp() throws Exception {
        Point2D p = new Point2D(0,0);
        r1 = new Rectangle(p, 4, 3);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        r1 = null;
    }

    @Test
    public void testPerimeter() throws Exception {
        double resu;
        resu = 14;
        assertEquals(r1.perimeter(),resu);
    }

    @Test
    public void testSurface() throws Exception {
        double resu;
        resu = 12;
        assertEquals(r1.surface(),resu);
    }

}