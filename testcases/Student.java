import java.util.*;
import java.math.*;
class Student
{
private int rollNumber;
private int courseCode;
private String name;
private String city;
private String state;

public Student()
{
this.rollNumber=0;
this.courseCode=0;
this.name="";
this.city="";
this.state="";
}
public void setRollNumber(int rollNumber)
{
this.rollNumber=rollNumber;
}
public int getRollNumber()
{
 return this.rollNumber;
}
public void setCourseCode(int courseCode)
{
this.courseCode=courseCode;
}
public int getCourseCode()
{
 return this.courseCode;
}
public void setName(java.lang.String name)
{
this.name=name;
}
public java.lang.String getName()
{
 return this.name;
}
public void setCity(java.lang.String city)
{
this.city=city;
}
public java.lang.String getCity()
{
 return this.city;
}
public void setState(java.lang.String state)
{
this.state=state;
}
public java.lang.String getState()
{
 return this.state;
}



}