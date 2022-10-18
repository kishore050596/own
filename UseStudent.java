package map;

import java.util.HashMap;

public class UseStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Student s1=new Student(10,"kishore","mechanical",80);
		 Student s2=new Student(11,"logesh","mechanical",90);
		 Student s3=new Student(12,"ajith","mechanical",70);
		 Student s4=new Student(13,"karthick","mechanical",100);
		 Student s5=new Student(14,"naveen","mechanical",85);
		 
		 HashMap<Integer,Student>hm=new HashMap<>();
		 
		 hm.put(s1.getId(),s1);
		 hm.put(s2.getId(),s2);
		 hm.put(s3.getId(),s3);
		 hm.put(s4.getId(),s4);
		 hm.put(s5.getId(),s5);
		 
		 System.out.println(hm);
		 
		 System.out.println("**************************************");
		 
		 for(Student s:hm.values())
		 {
			 System.out.println(s);
		 }
		 
		 System.out.println("**************************************");
		 
		 hm.values().forEach(v->System.out.println(v));
				 
		 

	}

}
