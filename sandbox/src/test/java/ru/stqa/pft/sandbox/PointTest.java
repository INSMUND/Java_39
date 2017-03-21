package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Pavel1 on 3/17/2017.
 */
public class PointTest {
    @Test
    public void testArea() {
    Point p1 = new Point(1, 1);
    Point p2 = new Point(1, 8);
        Assert.assertEquals(p1.distance(p2), 7.0);
}
}
