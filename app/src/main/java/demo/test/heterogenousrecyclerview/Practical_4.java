package demo.test.heterogenousrecyclerview;

/**
 * Created by rohitramaswamy on 27/06/17.
 */

public class Practical_4
{
	
	
	public static int COUNT;
	String subjectB1, subjectB2, subjectB3, teacherB1, teacherB2, teacherB3, time, roomB1, roomB2, roomB3;
	String subjectB4/*, subjectB5, subjectB6*/;
	String teacherB4/*, teacherB5, teacherB6*/;
	String roomB4/*, roomB5, roomB6*/;

//	public Practical_4(String subjectB1, String subjectB2, String subjectB3, String teacherB1, String teacherB2, String teacherB3, String time, String roomB1, String roomB2, String roomB3)
//	{
//		this.subjectB1 = subjectB1;
//		this.subjectB2 = subjectB2;
//		this.subjectB3 = subjectB3;
//		this.teacherB1 = teacherB1;
//		this.teacherB2 = teacherB2;
//		this.teacherB3 = teacherB3;
//		this.time = time;
//		this.roomB1 = roomB1;
//		this.roomB2 = roomB2;
//		this.roomB3 = roomB3;
//	}
	
	public Practical_4(String subjectB1, String subjectB2, String subjectB3, String subjectB4, String teacherB1, String teacherB2, String teacherB3, String teacherB4, String time, String roomB1, String roomB2, String roomB3, String roomB4)
	{
		this.subjectB1 = subjectB1;
		this.subjectB2 = subjectB2;
		this.subjectB3 = subjectB3;
		this.subjectB4 = subjectB4;
		this.teacherB1 = teacherB1;
		this.teacherB2 = teacherB2;
		this.teacherB3 = teacherB3;
		this.teacherB4 = teacherB4;
		this.time = time;
		this.roomB1 = roomB1;
		this.roomB2 = roomB2;
		this.roomB3 = roomB3;
		this.roomB4 = roomB4;
	}

//	public Practical_4(String subjectB1, String subjectB2, String subjectB3, String subjectB4, String subjectB5, String teacherB1, String teacherB2, String teacherB3, String teacherB4, String teacherB5, String time, String roomB1, String roomB2, String roomB3, String roomB4, String roomB5)
//	{
//		this.subjectB1 = subjectB1;
//		this.subjectB2 = subjectB2;
//		this.subjectB3 = subjectB3;
//		this.subjectB4 = subjectB4;
//		this.subjectB5 = subjectB5;
//		this.teacherB1 = teacherB1;
//		this.teacherB2 = teacherB2;
//		this.teacherB3 = teacherB3;
//		this.teacherB4 = teacherB4;
//		this.teacherB5 = teacherB5;
//		this.time = time;
//		this.roomB1 = roomB1;
//		this.roomB2 = roomB2;
//		this.roomB3 = roomB3;
//		this.roomB4 = roomB4;
//		this.roomB5 = roomB5;
//	}

//	public Practical_4(String subjectB1, String subjectB2, String subjectB3, String subjectB4, String subjectB5, String subjectB6, String teacherB1, String teacherB2, String teacherB3, String teacherB4, String teacherB5, String teacherB6, String time, String roomB1, String roomB2, String roomB3, String roomB4, String roomB5, String roomB6)
//	{
//		this.subjectB1 = subjectB1;
//		this.subjectB2 = subjectB2;
//		this.subjectB3 = subjectB3;
//		this.subjectB4 = subjectB4;
//		this.subjectB5 = subjectB5;
//		this.subjectB6 = subjectB6;
//		this.teacherB1 = teacherB1;
//		this.teacherB2 = teacherB2;
//		this.teacherB3 = teacherB3;
//		this.teacherB4 = teacherB4;
//		this.teacherB5 = teacherB5;
//		this.teacherB6 = teacherB6;
//		this.time = time;
//		this.roomB1 = roomB1;
//		this.roomB2 = roomB2;
//		this.roomB3 = roomB3;
//		this.roomB4 = roomB4;
//		this.roomB5 = roomB5;
//		this.teacherB6 = teacherB6;
//	}
	
	public String getSubjectB1()
	{
		return subjectB1;
	}
	
	public void setSubjectB1(String subjectB1)
	{
		this.subjectB1 = subjectB1;
	}
	
	public String getSubjectB2()
	{
		return subjectB2;
	}
	
	public void setSubjectB2(String subjectB2)
	{
		this.subjectB2 = subjectB2;
	}
	
	public String getSubjectB3()
	{
		return subjectB3;
	}
	
	public void setSubjectB3(String subjectB3)
	{
		this.subjectB3 = subjectB3;
	}
	
	public String getSubjectB4()
	{
		return subjectB4;
	}
	
	public void setSubjectB4(String subjectB4)
	{
		this.subjectB4 = subjectB4;
	}
	
	public String getTeacherB1()
	{
		return teacherB1;
	}
	
	public void setTeacherB1(String teacherB1)
	{
		this.teacherB1 = teacherB1;
	}
	
	public String getTeacherB2()
	{
		return teacherB2;
	}
	
	public void setTeacherB2(String teacherB2)
	{
		this.teacherB2 = teacherB2;
	}
	
	public String getTeacherB3()
	{
		return teacherB3;
	}
	
	public void setTeacherB3(String teacherB3)
	{
		this.teacherB3 = teacherB3;
	}
	
	public String getTeacherB4()
	{
		return teacherB4;
	}
	
	public void setTeacherB4(String teacherB4)
	{
		this.teacherB4 = teacherB4;
	}
	
	public String getTime()
	{
		return time;
	}
	
	public void setTime(String time)
	{
		this.time = time;
	}
	
	public String getRoomB1()
	{
		return roomB1;
	}
	
	public void setRoomB1(String roomB1)
	{
		this.roomB1 = roomB1;
	}
	
	public String getRoomB2()
	{
		return roomB2;
	}
	
	public void setRoomB2(String roomB2)
	{
		this.roomB2 = roomB2;
	}
	
	public String getRoomB3()
	{
		return roomB3;
	}
	
	public void setRoomB3(String roomB3)
	{
		this.roomB3 = roomB3;
	}
	
	public String getRoomB4()
	{
		return roomB4;
	}
	
	public void setRoomB4(String roomB4)
	{
		this.roomB4 = roomB4;
	}
	
	
}
