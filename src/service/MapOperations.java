package service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import model.TouristPlace;

public class MapOperations{
	Map<String, TouristPlace> hash=new HashMap<String, TouristPlace>();
	Map<String, TouristPlace> linked=new LinkedHashMap<String, TouristPlace>();
	Map<String, TouristPlace> tree=new TreeMap<String, TouristPlace>();
	
	public Map<String, TouristPlace> add(TouristPlace tp) {
		
//		int temp=Integer.parseInt(tp.getRank());
		hash.put(tp.getRank(),tp);
		linked.put(tp.getRank(),tp);
		tree.put(tp.getRank(),tp);
		return hash; 
	}
	

	public Map<String, TouristPlace> remove(TouristPlace tp)
	{
		
		//int temp=Integer.parseInt(tp.getRank());
		hash.remove(tp.getRank(),tp);
		linked.remove(tp.getRank(),tp);
		tree.remove(tp.getRank(),tp);
		return hash;
		
	}
	
//	public Object sortByDestination(TouristPlace tp)
//	{
//		Map<Integer,TouristPlace> sd=new HashMap<>();
//		int temp=Integer.parseInt(tp.getRank());
//		sd.put( temp, tp);
//		return sd;
//
//	}
//	
//	public Object sortByRank(TouristPlace tp)
//	{
//		Map<Integer,TouristPlace> m=new HashMap<Integer,TouristPlace>();
//		//Map<Integer,TouristPlace> m=new HashMap<Integer,TouristPlace>();
//	sortByRank(tp);
//		return m;
//	}

	public Map<String, TouristPlace> sortRandom(Map<String, TouristPlace> bucketList) {
		return hash;
	}
	
	public Map<String, TouristPlace> sortInEntryOrder(Map<String, TouristPlace> bucketList) {
		return linked;
	}
	public Map<String, TouristPlace> sortAlphabetically(Map<String, TouristPlace> bucketList) {
		return tree;
	}
//	public Object reset(HashMap<Integer,TouristPlace> tp) {
//		Map<Integer,TouristPlace> resetPlaces=new HashMap<>();
//		resetPlaces.clear();
//		return resetPlaces;
//		
//	}

	public Object reset(Map<String, TouristPlace> bucketList)
	{
		//Map<Integer,TouristPlace> m=new HashMap<Integer,TouristPlace>();
		bucketList.clear();
		return bucketList;
	}


	



	
	
}
