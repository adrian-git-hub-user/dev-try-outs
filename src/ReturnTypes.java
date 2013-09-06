import java.util.ArrayList;
import java.util.List;


public class ReturnTypes {

	public static void main(String args[]) {

		List<Object> lo = new ArrayList<Object>();
		lo.add("String");
		
		for(Object s : lo){
			System.out.println(s);
		}
		List<?> to = new ArrayList<Object>();
		to.add(new String("here"));
		
	}

}
