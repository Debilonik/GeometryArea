public class Tester
{
	private static void triangleTest(){
		System.out.println("\n***\nTest triangle\n");
		
		System.out.println("2 storony i ugol: stor2Ang1(5, 5, 60)");
		System.out.println(Triangle.stor2Ang1(5, 5, 60) + "\n");
		
		System.out.println("Storona i vysota: storHeight(5, 4.33)");
		System.out.println(Triangle.storHeight(5, 4.33) + "\n");
		
		System.out.println("Formula Gerona: heronus(5, 5, 5)");
		System.out.println(Triangle.heronus(5, 5, 5) + "\n");
		
		System.out.println("Storona i ugly: stor1Ang2(5, 60, 60)");
		System.out.println(Triangle.stor1Ang2(5, 60, 60) + "\n");
		
		System.out.println("3 vysoty: heights3(4.33, 4.33, 4.33)");
		System.out.println(Triangle.heights3(4.33, 4.33, 4.33) + "\n");
	}

	private static void rectangleTest(){
		System.out.println("\n***\nTest rectangle\n");
		
		System.out.println("Dve storony: stor2(5, 5)");
		System.out.println(Rectangle.stor2(5, 5) + "\n");
		
		System.out.println("Diagonal' i ugol mezhdu nimi: diagonalsAng(7.07, 45)");
		System.out.println(Rectangle.diagonalsAng(7.07, 90) + "\n");
		
		System.out.println("Storona i diagonal': storDiag(5, 7.07)");
		System.out.println(Rectangle.storDiag(5, 7.07) + "\n");
	}
	
	private static void rhombTest(){
		System.out.println("\n***\nTest rhomb\n");
		
		System.out.println("Dve diagonali: diagonals(4, 6)");
		System.out.println(Rhomb.diagonals(4, 6) + "\n");
		
		System.out.println("Storona i vysota: storHeight(4, 3)");
		System.out.println(Rhomb.storHeight(4, 3) + "\n");
		
		System.out.println("Storona i ugol: storAng(4, 48.60)");
		System.out.println(Rhomb.storAng(4, 48.60) + "\n");
	}
	
	private static void parallelogramTest(){
		System.out.println("\n***\nTest parallelogram\n");
		
		System.out.println("Dve storony i ugol: stor2ang1(4, 6, 35)");
		System.out.println(Parallelogram.stor2ang1(4, 6, 35) + "\n");
		
		System.out.println("Storona i vysota: storHeight(4, 3)");
		System.out.println(Parallelogram.storHeight(4, 3) + "\n");
		
		System.out.println("Diagonali i ugol: diagonalsAng(4, 8, 60)");
		System.out.println(Parallelogram.diagonalsAng(4, 8, 60) + "\n");
	}
	
	private static void trapezeTest(){
		System.out.println("\n***\nTest trapeze\n");
		
		System.out.println("Oba osnovania i vysota: osnov2height(4, 6, 5)");
		System.out.println(Trapeze.osnov2height(4, 6, 5) + "\n");

		System.out.println("Sred linia i vysota: srlinHeight(4, 7)");
		System.out.println(Trapeze.srlinHeight(4, 7) + "\n");

		System.out.println("4 storony: stor4(5, 7, 4, 4)");
		System.out.println(Trapeze.stor4(5, 7, 4, 4) + "\n");
		
		System.out.println("Diagonali i ugol: diagonalsAng(4, 5, 17)");
		System.out.println(Trapeze.diagonalsAng(4, 5, 17) + "\n");
	}
	
	private static void polygonTest(){
		System.out.println("\n***\nTest polygon\n");
		
		System.out.println("Storona i N: storN(4, 6)");
		System.out.println(Polygon.storN(4, 6) + "\n");
		
		System.out.println("Radius R i N: radiusbigN(4, 6)");
		System.out.println(Polygon.radiusbigN(4, 6) + "\n");
		
		System.out.println("Radius r i N: radiussmallN(4, 6)");
		System.out.println(Polygon.radiussmallN(4, 6) + "\n");
		
		System.out.println("Radius r i perimetr: radiussmallP(4, 16)");
		System.out.println(Polygon.radiussmallP(4, 16) + "\n");
	}
	
	private static void circleTest(){
		System.out.println("\n***\nTest circle\n");
		
		System.out.println("Radius: radius(4)");
		System.out.println(Circle.radius(4) + "\n");
		
		System.out.println("Length: length(42)");
		System.out.println(Circle.length(42) + "\n");
		
		System.out.println("Sector - radius i ugol: SectorRadisAng(4, 45)");
		System.out.println(Circle.SectorRadisAng(4, 45) + "\n");
	}
	
	private static void ellipseTest(){
		System.out.println("\n***\nTest ellipse\n");
		
		System.out.println("Oba radiusa: radiuses(4, 6)");
		System.out.println(Ellipse.radiuses(4, 6) + "\n");
		
		System.out.println("Zadan uravneniem Ax^2 + Bxy + Cy^2 = 1: uravn(5, 3, 4)");
		System.out.println(Ellipse.uravn(5, 3, 4) + "\n");
	}
	
	public static void main(String[] args)
	{
		triangleTest();
		
		rectangleTest();
		
		rhombTest();
		
		parallelogramTest();
		
		trapezeTest();
		
		polygonTest();
		
		circleTest();
		
		ellipseTest();
	}
}