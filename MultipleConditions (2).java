package day2;
//to test multiple conditions 
// if else if 
//wap to print grade of a student 
//if percentage <40 print fail 
//if percentage >40 and percentage <60 print C 
//if percentage >=60 and percentage <80 print B
//if percentage >80 print A

public class MultipleConditions {

	public static void main(String[] args) {

		int percent=199;
		
		if(percent<40)
		{
			System.out.println("fail");
		}
		else if(percent>=40 && percent<60)
		{
			System.out.println("c grade");
		}
		else if(percent>=60 && percent<80)
		{
			System.out.println("b grade");
		}
		else if(percent>=80 && percent<100)
		{
			System.out.println("A grade");
		}
		else 
			System.out.println("wrong input");
	}

}


 