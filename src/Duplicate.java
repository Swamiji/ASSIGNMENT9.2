import java.util.*;
public class Duplicate {
public static void main(String args[]){
	ArrayList<String>al=new ArrayList<String>();
	al.add("Amit");
	al.add("Monali");
	al.add("Amit");
	al.add("Ankita");
	Iterator itr=al.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
