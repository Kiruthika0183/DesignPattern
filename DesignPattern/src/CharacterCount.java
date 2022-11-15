import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[]= {'a','b','a','c','i','k','i'};
		HashMap<Character,Integer> obj=CharacterCount.countcharacter(a);
		System.out.println(obj);
		

	}
	static HashMap<Character,Integer> countcharacter(char a[]){
		HashMap<Character,Integer> obj=new HashMap<Character,Integer>();
		for(char c:a){
		if(obj.containsKey(c)) {
			obj.put(c, obj.get(c)+1);
			
		}else
			obj.put(c, 1);
			
		}
		return obj;
	}

}
