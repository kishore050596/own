package map;

import java.util.HashMap;
import java.util.Iterator;

public class UseCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	CustomerDetails cd1=new CustomerDetails("vignesh",29,"vignesh@gmail.com",20000,1015845488445564l);
	CustomerDetails cd2=new CustomerDetails("bharath",24,"vignesh@gmail.com",20000,1015845488445564l);
	CustomerDetails cd3=new CustomerDetails("monika",28,"vignesh@gmail.com",20000,1015845488445564l);
	CustomerDetails cd4=new CustomerDetails("janu",21,"vignesh@gmail.com",20000,1015845488445564l);
	CustomerDetails cd5=new CustomerDetails("ajith",23,"vignesh@gmail.com",20000,1015845488445564l);
	
	HashMap<Integer,Object>hm=new HashMap<>();
	
	hm.put(01,cd1);
	hm.put(02,cd2);
	hm.put(03,cd3);
	hm.put(04,cd4);
	hm.put(05,cd5);
	
	System.out.println(hm);
	
	System.out.println();
	
	for(Object o:hm.values())
	{
		System.out.println(o);
	}
	
	System.out.println("*******************************************************************************");
	
	for(Object o:hm.keySet())
	{
		System.out.println(o);
	}
	
	System.out.println("*******************************************************************************");
	
	    hm.forEach((k,v)->System.out.println(k+" "+v));
	    
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	
	Iterator<Integer>itr=hm.keySet().iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("***************************");
	
	
	
	

	}

}
