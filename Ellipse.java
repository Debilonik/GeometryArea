/**Набор решений задачи нахождения 
* площади круга.
* @author Alexey Gorovoy
* @author alexey.gorovoy.work@gmail.com
*/
public class Ellipse {
	/**известны меньший и больший радиусы эллипса
	* @param r1 меньший радиус
	* @param r2 больший радиус
	* @return площадь эллипса
	*/
	public static double radiuses(double r1, double r2) {
		return Circle.PI * r1 * r2;
	}
	
	/**эллипс задан уравнением вида Ax^2 + Bxy + Cy^2 = 1
	* @param A коэффициэнт A уравнения
	* @param B коэффициэнт B уравнения
	* @param C коэффициэнт C уравнения
	* @return площадь эллипса
	*/
	public static double uravn(double A, double B, double C) {
		double sqrt = Math.sqrt(4 * A * C - B * B);
		return 2 * Circle.PI / sqrt;
	}		
}