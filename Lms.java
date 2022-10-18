package map;

import java.util.HashMap;
import java.util.Iterator;

public class Lms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(10, "kishore");
		hm.put(-4, "sheela");
		hm.put(30, "vignesh");
		
		System.out.println(hm);
		
		
	int ma=0;
	for(Integer i:hm.keySet())
	{
		
		{
		
		}
			
	
	}
	
	
	System.out.println("1***************************************************");
	String max="";
	for(String str:hm.values())
	{
		if(str.length()>=max.length())
		{
			max=str;
		}
	}
	  System.out.println(max);	
	
	
	System.out.println("2**************************************************");
	
	hm.forEach((k,v)->{
		System.out.println(k+" "+v);
	});
	
	
	
	System.out.println("3***************************************************");
	
	
	System.out.println("####################################################");
	
	for(Integer i:hm.keySet())
	{
		String str=hm.get(i);
		
		System.out.println(i+" "+str);
	}
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	
	hm.keySet().forEach(k-> {
	System.out.println(k);
	}
	);
	hm.values().forEach(v-> {
		System.out.println(v);
	});
	
	System.out.println(")))))))))))))))))))))))");
	
	
	for(Integer i:hm.keySet())
	{
		if(i == 10)
		{
			System.out.println();
		}
	}
	
	System.out.println("/////////////////////////////////");
	
	Iterator<Integer>itr=hm.keySet().iterator();
	
	while (itr.hasNext())
	{
		System.out.println(itr.next());
		
		
		
	}
	
	Iterator<String>itr1=hm.values().iterator();
	
	while(itr1.hasNext())
	{
		//itr1.remove();
	}
	hm.values().forEach(x->System.out.println(x));
	
	
	

	
	}
}

