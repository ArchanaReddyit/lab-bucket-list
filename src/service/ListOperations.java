package service;

import model.TouristPlace;
import java.util.ArrayList;
import java.util.List;

public class ListOperations{
	public static ArrayList<TouristPlace> al=new ArrayList<TouristPlace>();
	
	
	public List<TouristPlace> add(TouristPlace places)
	{
		al.add(places);
		return al;
	}
	
	public List<TouristPlace> remove(TouristPlace places)
	{
		//System.out.println(al);
		al.remove(places);
		return al;
	}
	
	public Object sortByDestination(List<TouristPlace> places)
	{
		al.sort((d1,d2) -> d1.getDestination().compareTo(d2.getDestination()));
		return al;
	}
	
	public Object sortByRank(List<TouristPlace> places)
	{
		//ArrayList<TouristPlace> sr=new ArrayList<TouristPlace>();
		al.sort((d1,d2) -> d1.getRank().compareTo(d2.getRank()));
		return al;
	}
	
	public Object reset(List<TouristPlace> places)
	{
		//ArrayList<TouristPlace> list=new ArrayList<>();
		al.clear();
		return al;
	}
}
