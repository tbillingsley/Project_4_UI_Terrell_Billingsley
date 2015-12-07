/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package billingsley_pkg;

/**
 *
 * @author Terrell
 */
import java.text.NumberFormat; //for formatting
public class Circle {
    //declare member (field) variables
    private double radius;
    private static int circleCount;
//constructor that has radius as an argument
public Circle (double radius )
{
    this.radius = radius;
    circleCount++; //update counter
}
public double getCircumference()
{
    double circumference = Math.PI*2*radius ;
    return circumference;
}
//formatted circumference
public String getFormattedCircumference()
{
    String fn = this.FormatNumber(this.getCircumference());
    return fn;
}
public double getArea()
{
    double area = Math.PI*Math.pow(radius, 2 );
    return area;
}
public String getFormattedArea()
{
    String fn = this.FormatNumber(this.getArea());
    return fn;
}
//create your own FormatNumber method
public String FormatNumber(double d)
{
    NumberFormat number=NumberFormat.getNumberInstance();
    number.setMaximumFractionDigits(2);
    return number.format(d);
}
//get circleCount() method
public static int getCircleCount()
{
return circleCount;
}
}