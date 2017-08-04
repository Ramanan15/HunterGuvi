import java.util.*;
public class P 14
 {
public static void main(String[] args) 
{
	List<String> ls=new ArrayList<String>();
	ls.add("A");
	ls.add("AN");

	ls.add("APPLE");
	ls.add("AWAY");
	ls.add("BALL");

	ls.add("CAT");
	ls.add("DAY");
	ls.add("DOCTOR");

	ls.add("KEEPS");
	ls.add("THE");
	String input = "An Apple An Day keeps the doctr keeps away";

	String inputcopy = input.toUpperCase();
	String words[]=input.split(" ");

	String wordscopy[]=inputcopy.split(" ");

	int countnumber[]=new int[input.length()];
	int countindexoriginal[]=new int[input.length()];

	int countindexlist[]=new int[input.length()];

	int g=0;
	String str = null;
	for( int i = 0;i < words.length ; i++)
 {
		int count=0;
		if(!(ls.contains(wordscopy[i])))
{
			 str=wordscopy[i];
			for(int h=0;h<ls.size();h++)
{
			String cmp=ls.get(h);	
			for(int j=0,k=0;j<str.length()&&k<cmp.length();j++,k++)
{
					if(str.charAt(j)==cmp.charAt(k))
{
						count++;
					}
				}	
			countindexoriginal[g]=i;
			countindexlist[g]=h;

			countnumber[g]=count;
			g++;
			}
		}
	}
		int max=0;
		int maxi=0;

		for(int p=0;p<g;p++)
{
			if(countnumber[p]>max)
{
				maxi=p;
				max=countnumber[p];
			}
		}
		System.out.println("The option for "+str+" is "+ls.get(maxi));
	}
}

