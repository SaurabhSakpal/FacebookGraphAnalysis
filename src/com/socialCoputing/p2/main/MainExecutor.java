package com.socialCoputing.p2.main;
import java.io.IOException;

import com.socialComputing.p2.config.Config;
import com.socialComputing.p2.core.Graph;
import com.socialComputing.p2.core.Hypothesis;
import com.socialComputing.p2.fileReader.AlterFeatureFileReader;
import com.socialComputing.p2.fileReader.CircleFileReader;
import com.socialComputing.p2.fileReader.EdgeListReader;
import com.socialComputing.p2.fileReader.FeatureNamesFileReader;

public class MainExecutor {
	
	
	public static void main(String[] args) throws IOException {
		
		Config.initialize();
		
		for(int egoNetworkId : Config.EGO_NETWORKS) {
			System.out.println("--------------------------- EGO " + egoNetworkId + " NETWORK STATISTICS ---------------------------");
				
			EdgeListReader edgeListFileReader = new EdgeListReader(Config.egoEdgeMap.get(egoNetworkId));
			edgeListFileReader.readFile();
			
			CircleFileReader circleFileReader = new CircleFileReader(Config.egoCircleMap.get(egoNetworkId));
			circleFileReader.readFile();
			
			FeatureNamesFileReader featureNameReader = new FeatureNamesFileReader(Config.egoFeatureNamesMap.get(egoNetworkId));
			featureNameReader.readFile();
			
			AlterFeatureFileReader alterFeatureReader = new AlterFeatureFileReader(Config.egoAlterFeatureMap.get(egoNetworkId));
			alterFeatureReader.readFile();
			
			Graph.getInstance().updateAlterAndEdgeCount();
			Graph.getInstance().betweennessCentrality();
			
			System.out.println("HYPOTHESIS 1 : ");
			new Hypothesis().proveFirstHypothesis();
			
			
			System.out.println("HYPOTHESIS 3 : ");
			new Hypothesis().proveThirdHypothesis(); 
			
			System.out.println("\n");
			Graph.flush();
		}
		
	}

}

