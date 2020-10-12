import java.util.ArrayList;
import java.util.List;

public class Index_out_of_Bound_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String>l=new ArrayList<String>();
		l.add("thirupathi");
		l.add("Alla");
		System.out.println(l.get(2));
		
	}

}
