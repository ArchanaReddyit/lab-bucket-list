package service;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import model.TouristPlace;

public class SetOperations{
	
	public Set<TouristPlace> add(TouristPlace places)
	{
		HashSet<TouristPlace> hs=new HashSet<>();
		hs.add(places);
		return hs;
	}
	
	public Set<TouristPlace> remove(TouristPlace places)
	{
		HashSet<TouristPlace> rl=new HashSet<TouristPlace>();
		rl.remove(places);
		return null;
	}
	
	public Object sortbydestination(Set<TouristPlace> set) {
		TreeSet<TouristPlace> sd=new TreeSet<>((d1,d2)->d1.getDestination().compareTo(d2.getDestination()));
		return sd;
	}
	
	public Object sortbyrank(Set<TouristPlace> set) {
		TreeSet<TouristPlace> sd=new TreeSet<>((d1,d2)->d1.getRank().compareTo(d2.getRank()));
		return sd;
	}
	
	public Object reset(Set<TouristPlace> places)
	{
		HashSet<TouristPlace> set=new HashSet<TouristPlace>();
		set.clear();
		return set;
	}
}
