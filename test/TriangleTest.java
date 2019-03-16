package test;

import org.junit.Test;
import static org.junit.Assert.*;
import main.Triangle;

public class TriangleTest
{
	@Test
	public void testIsRightAngleTriangle()
	{
	Triangle triangle = new Triangle(3,4,5);
	assertTrue(triangle .isRight());
	}

	@Test
	public void testIsNotRightAngleTriangle()
	{
	Triangle triangle = new Triangle(2,4,5);
	assertFalse(triangle.isRight());
	}

	@Test
	public void testIsScaleneTriangle()
	{
	Triangle triangle=new Triangle(1,2,3);
	assertTrue(triangle.isScalene());
	}

	@Test
	public void testIsNotScaleneTriangle()
	{
	Triangle triangle=new Triangle(2,2,3);
	assertFalse(triangle.isScalene());
	}

	@Test
	public void testIsIsosceles()
	{
	Triangle triangle=new Triangle(2,1,2);
	assertTrue(triangle.isIsosceles());
	}

	@Test
	public void testIsNotIsosceles()
	{
	Triangle triangle=new Triangle(1,2,3);
	assertFalse(triangle.isIsosceles());
	}

	@Test
	public void testIsEquilateral()
	{
	Triangle triangle=new Triangle(2,2,2);
	assertTrue(triangle.isEquilateral());
	}

	@Test
	public void testIsNotEquilateral()
	{
	Triangle triangle=new Triangle(1,2,2);
	assertFalse(triangle.isEquilateral());
	}

}