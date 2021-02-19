package org.comstudy21.ex07.di;

import java.util.Hashtable;
import java.util.function.BiFunction;

public class R {
	public static final TV tv = new LgTV();
	
	public static final Hashtable<String, TV> tvMapper= new Hashtable<>();
	static {
		tvMapper.put("lg", new LgTV());
		tvMapper.put("samsung", new SamsungTV());
	}
}
