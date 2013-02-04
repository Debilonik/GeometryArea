/**Набор решений задачи нахождения 
* площади треугольника.
* @author Alexey Gorovoy
* @author alexey.gorovoy.work@gmail.com
*/
public class Triangle {
	/**известны две стороны и угол между ними
	* @param a длина одной стороны
	* @param b длина второй стороны
	* @param y угол в градусах
	* @return площадь треугольника
	*/
	public static double stor2Ang1(double a, double b, double y)
	{
		double result = 0, angle = Math.toRadians(y);
		result = 0.5 * a * b * Math.sin(angle);
		return result;
	}
	
	/**известны сторона и высота
	* @param a длина стороны
	* @param h длина высоты проведенной к ней
	* @return площадь треугольника
	*/
	public static double storHeight(double a, double h)
	{
		double result = 0;
		result = 0.5 * a * h;
		return result;
	}
	
	/**Формула Герона
	* @param a длина стороны a
	* @param b длина стороны b
	* @param c длина стороны c
	* @return площадь треугольника, либо 0 если произошла ошибка
	*/
	public static double heronus(double a, double b, double c)
	{
		double result = 0, p = (a + b + c) / 2;
		result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		if (result > 0) {
			return result;
		} else {
			return 0;
		}
	}

	/**известны сторона и прилежащие к ней углы
	* @param a сторона треугольника
	* @param ang1 первый угол в градусах
	* @param ang2 второй угол в градусах
	* @return площадь треугольника, 0 в случае ошибки
	*/
	public static double stor1Ang2(double a, double ang1, double ang2)
	{
		double result = 0, ang3 = 180 - (ang1 + ang2);
		double ang1_r = Math.toRadians(ang1);
		double ang2_r = Math.toRadians(ang2);
		double ang3_r = Math.toRadians(ang3);
		if (ang3_r <= 0)
			return 0;
		result = a * a * Math.sin(ang1_r) * Math.sin(ang2_r) / (2 * Math.sin(ang3_r));
		return result;
	}
	
	/**известны все три высоты
	* @param h1 высота треугольника
	* @param h2 высота треугольника
	* @param h3 высота треугольника
	* @return площадь треугольника, 0 в случае ошибки
	*/
	public static double heights3(double h1, double h2, double h3)
	{
		double result = 0;
		if ((h1 <= 0) || (h2 <= 0) || (h3 <= 0))
			return 0;
		result = 1 / Math.sqrt((1/h1 + 1/h2 + 1/h3) * (1/h3 + 1/h2 - 1/h1) 
													* (1/h1 + 1/h3 - 1/h2) 
													* (1/h1 + 1/h2 - 1/h3));
		return result;
	}
}
