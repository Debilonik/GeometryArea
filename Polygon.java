/**Набор решений задачи нахождения 
* площади правильного многоугольника.
* @author Alexey Gorovoy
* @author alexey.gorovoy.work@gmail.com
*/
public class Polygon {
	/**известны длина стороны и количество сторон
	* @param a сторона
	* @param n количество сторон
	* @return площадь многоугольника
	*/
	public static double storN(double a, double n) {
		double ctg = Math.pow( Math.tan(Circle.PI / n), -1);
		double result = 0.25 * n * a * a * ctg;
		return result;
	}
	
	/**известны радиус описанной окружности и количество сторон
	* @param R радиус описанной окружности
	* @param n количество сторон
	* @return площадь многоугольника
	*/
	public static double radiusbigN(double R, double n) {
		double tg = Math.tan(Circle.PI / n);
		double result = n * R * R * tg;
		return result;
	}
	
	/**известны радиус вписанной окружности и количество сторон
	* @param r радиус вписанной окружности
	* @param n количество сторон
	* @return площадь многоугольника
	*/
	public static double radiussmallN(double r, double n) {
		double sin = Math.sin(2 * Circle.PI / n);
		double result = 0.5 * n * r * r * sin;
		return result;
	}
	
	/**известны радиус вписанной окружности и периметр
	* @param r радиус вписанной окружности
	* @param P периметр
	* @return площадь многоугольника
	*/
	public static double radiussmallP(double r, double P) {
		return 0.5 * r * P;
	}
}