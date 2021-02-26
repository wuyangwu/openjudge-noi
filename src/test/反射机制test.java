package test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class 反射机制test {
	public static void main(String[] args) throws Exception {
		User user = new User("123", 123);
		Class clz = user.getClass();
		Method aMethod = clz.getDeclaredMethod("getAge",null);
//		Object object = aMethod.invoke(user);
		System.out.println(aMethod.invoke(user));
		
	}
}
