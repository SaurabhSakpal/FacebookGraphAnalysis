package com.socialComputing.p2.config;
import java.util.HashMap;

public class Config {
	
	public static final String BASE_LOCATION = "/home/saurabh/workspace_2/FacebookGraphAnalysis/resources/";
	
	public static final int EGO_NETWORKS [] = {0, 107, 1684, 1912, 3437, 348, 3980, 414, 686, 698};
	
	public static HashMap<Integer, String> egoEdgeMap = new HashMap<Integer, String>();
	public static HashMap<Integer, String> egoCircleMap = new HashMap<Integer, String>();
	public static HashMap<Integer, String> egoFeatureNamesMap = new HashMap<Integer, String>();
	public static HashMap<Integer, String> egoAlterFeatureMap = new HashMap<Integer, String>();	
	public static HashMap<Integer, String> egoFeatureMap = new HashMap<Integer, String>();
	
	
	public static void initialize()
	{
		egoEdgeMap.put(0, BASE_LOCATION + "0.edges");
		egoEdgeMap.put(107, BASE_LOCATION + "107.edges");
		egoEdgeMap.put(1684, BASE_LOCATION + "1684.edges");
		egoEdgeMap.put(1912, BASE_LOCATION + "1912.edges");
		egoEdgeMap.put(3437, BASE_LOCATION + "3437.edges");
		egoEdgeMap.put(348, BASE_LOCATION + "348.edges");
		egoEdgeMap.put(3980, BASE_LOCATION + "3980.edges");
		egoEdgeMap.put(414, BASE_LOCATION + "414.edges");
		egoEdgeMap.put(686, BASE_LOCATION + "686.edges");
		egoEdgeMap.put(698, BASE_LOCATION + "698.edges");
		
		egoCircleMap.put(0, BASE_LOCATION + "0.circles");
		egoCircleMap.put(107, BASE_LOCATION + "107.circles");
		egoCircleMap.put(1684, BASE_LOCATION + "1684.circles");
		egoCircleMap.put(1912, BASE_LOCATION + "1912.circles");
		egoCircleMap.put(3437, BASE_LOCATION + "3437.circles");
		egoCircleMap.put(348, BASE_LOCATION + "348.circles");
		egoCircleMap.put(3980, BASE_LOCATION + "3980.circles");
		egoCircleMap.put(414, BASE_LOCATION + "414.circles");
		egoCircleMap.put(686, BASE_LOCATION + "686.circles");
		egoCircleMap.put(698, BASE_LOCATION + "698.circles");
		
		egoFeatureNamesMap.put(0, BASE_LOCATION + "0.featnames");
		egoFeatureNamesMap.put(107, BASE_LOCATION + "107.featnames");
		egoFeatureNamesMap.put(1684, BASE_LOCATION + "1684.featnames");
		egoFeatureNamesMap.put(1912, BASE_LOCATION + "1912.featnames");
		egoFeatureNamesMap.put(3437, BASE_LOCATION + "3437.featnames");
		egoFeatureNamesMap.put(348, BASE_LOCATION + "348.featnames");
		egoFeatureNamesMap.put(3980, BASE_LOCATION + "3980.featnames");
		egoFeatureNamesMap.put(414, BASE_LOCATION + "414.featnames");
		egoFeatureNamesMap.put(686, BASE_LOCATION + "686.featnames");
		egoFeatureNamesMap.put(698, BASE_LOCATION + "698.featnames");
		
		egoAlterFeatureMap.put(0, BASE_LOCATION + "0.feat");
		egoAlterFeatureMap.put(107, BASE_LOCATION + "107.feat");
		egoAlterFeatureMap.put(1684, BASE_LOCATION + "1684.feat");
		egoAlterFeatureMap.put(1912, BASE_LOCATION + "1912.feat");
		egoAlterFeatureMap.put(3437, BASE_LOCATION + "3437.feat");
		egoAlterFeatureMap.put(348, BASE_LOCATION + "348.feat");
		egoAlterFeatureMap.put(3980, BASE_LOCATION + "3980.feat");
		egoAlterFeatureMap.put(414, BASE_LOCATION + "414.feat");
		egoAlterFeatureMap.put(686, BASE_LOCATION + "686.feat");
		egoAlterFeatureMap.put(698, BASE_LOCATION + "698.feat");
		
		egoFeatureMap.put(0, BASE_LOCATION + "0.egofeat");
		egoFeatureMap.put(107, BASE_LOCATION + "107.egofeat");
		egoFeatureMap.put(1684, BASE_LOCATION + "1684.egofeat");
		egoFeatureMap.put(1912, BASE_LOCATION + "1912.egofeat");
		egoFeatureMap.put(3437, BASE_LOCATION + "3437.egofeat");
		egoFeatureMap.put(348, BASE_LOCATION + "348.egofeat");
		egoFeatureMap.put(3980, BASE_LOCATION + "3980.egofeat");
		egoFeatureMap.put(414, BASE_LOCATION + "414.egofeat");
		egoFeatureMap.put(686, BASE_LOCATION + "686.egofeat");
		egoFeatureMap.put(698, BASE_LOCATION + "698.egofeat");
	}
}
