import java.util.*;
class MirrorImageStringEx2
{
	public static void main(String[] args)
	{
		MirrorImageStringEx2 mi=new MirrorImageStringEx2();
		String finalres=mi.getImage("SUN");
		System.out.println("Output "+ finalres);
		
	}	


	String getImage(String s1)
	{	
	
		System.out.println(s1);
		StringBuffer sn= new StringBuffer(s1);
		sn.reverse();
		String fin=s1.concat("|")+sn;
		return fin;
	}
		


	
}