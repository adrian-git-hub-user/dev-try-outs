
public class AssertTest {
	
	public static void main(String args[]){
		
		assert 1 == 1 ;
		assert 1 == 2 ;
		
		java.util.List<String> l = new java.util.ArrayList<String>();
		l.add("a");
		l.add("n");
		l.add("c");
		

		for(String r : l){
			System.out.println(r);
			l.remove(r);
			//assert (l.remove(r));
		}

		System.out.println("Size is "+l.size());
	}

}
