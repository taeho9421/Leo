package org.comstudy21.model;

import java.util.ArrayList;

public class Dao {
	static public ArrayList<Dto> list = new ArrayList<>();
	static int seq = 1;
	static {
		list.add(new Dto(seq++,"",5000,20));
	}
}
