package dsa;

import java.util.HashMap;

public class IsomorphicString
{
	public static boolean isIsomorphic(String s, String t) 
    {
        HashMap<Character,Character> hmp=new HashMap<>();
        if(s.length() != t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            char schar=s.charAt(i);
            char tchar=t.charAt(i);
            if(hmp.containsKey(schar))//o->a o->r
                {
                    if(hmp.get(schar)!=tchar)
                    {
                        return false;
                    }
                }
            else 
            {
                if(hmp.containsValue(tchar))//b->a;d->a
                {
                    return false;
                }
            hmp.put(schar,tchar);
            }

        }

        return true;
    }


	public static void main(String[] args) 
	{
		
		String s="foo";
		String t="bar";//not isomorphic
		System.out.println(isIsomorphic(s,t));
	}

}
