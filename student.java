import java.util.*;
class student
{
	public static void main(String args[])
	{
		int m1,m2,m3;
		string name,grade;
		double avg,total;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student name");
		name=sc.nextLine();
		System.out.println("enter marks for subject 1");
		m1=sc.nextInt();
		System.out.println("enter marks for subject 2");
		m2=sc.nextInt();
		System.out.println("enter marks for subject 3");
		m3=sc.nextInt();
		total=m1+m2+m3;
		avg=total/3;
		if(m1<35||m2<35||m3<35)
		{
			grade="fail";
		}
		else
		{
			if(avg>85)
			grade="distinction";
			else if(avg>60)
			grade="first class";
			else
			grade="second class";
		}
		System.out.println("student="+name);
		System.out.println("mark1="+m1);
		System.out.println("mark2="+m2);
		System.out.println("mark3="+m3);
		System.out.println("total="+total);
		System.out.println("avg="+avg);
		System.out.println("grade="+grade);
		sc.close();
	}
}
