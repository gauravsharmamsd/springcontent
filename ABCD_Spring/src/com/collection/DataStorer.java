package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataStorer {
List list;
Set set;
Map<Integer,String>map;
public List getList() {
	return list;
}
public void setList(List list) {
	this.list = list;
}
public Set getSet() {
	return set;
}
public DataStorer(Set set) {
	this.set=set;
	
}
public Map<Integer, String> getMap() {
	return map;
}
public void setMap(Map<Integer, String> map) {
	this.map = map;
}
public DataStorer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "DataStorer [list=" + list + ", set=" + set + ", map=" + map + "]";
}


}
