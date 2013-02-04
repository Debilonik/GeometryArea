/**Набор решений задачи нахождения 
* площади трапеции.
* @author Alexey Gorovoy
* @author alexey.gorovoy.work@gmail.com
*/
public class Trapeze {
	/**известны оба основания и высота
	* @param a одно основание
	* @param b второе основание
	* @param h высота
	* @return площадь трапеции
	*/
	public static double osnov2height(double a, double b, double h) {
		return (a + b) * h / 2;
	}

	/**известны средняя линия и высота
	* @param m средняя линия
	* @param h высота
	* @return площадь трапеции
	*/
	public static double srlinHeight(double m, double h) {
		return m * h;
	}
	
	/**известны все 4 стороны
	* @param a сторона трапеции
	* @param b сторона трапеции
	* @param c сторона трапеции
	* @param d сторона трапеции
	* @return площадь трапеции, 0 в случае ошибки
	*/
	public static double stor4(double a, double b, double c, double d) {
		if (a == 0 || b == 0 || c == 0 || d == 0)
			return 0;
		double result = 0;
		double half = (a + b)/2;
		double tmp = ((b - a)*(b - a) + c*c - d*d)/(2 * (b - a));
		if (tmp == 0 || tmp >= c || b <= a)
			return 0;
		result = half * Math.sqrt(c*c - tmp*tmp);
		return result;
	}
	
	/**известны диагонали и угол между ними
	* @param d1 одна диагональ
	* @param d2 вторая диагональ
	* @param y угол между ними
	* @return площадь трапеции
	*/
	public static double diagonalsAng(double d1, double d2, double y) {
		double angle = Math.toRadians(y);
		return 0.5 * d1 * d2 * Math.sin(angle);
	}
}