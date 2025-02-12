import java.util.*;
public class user_class_reflec_api {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		
		Scanner sc = new Scanner(System.in);
		
		Mobile m1 = new Mobile();
		System.out.print("Enter Sim ");
		Class cls = Class.forName(sc.next());
		
		Object obj = cls.newInstance();
		
		if(obj instanceof Sim s1) {
			s1.call();
		}
	}
}
