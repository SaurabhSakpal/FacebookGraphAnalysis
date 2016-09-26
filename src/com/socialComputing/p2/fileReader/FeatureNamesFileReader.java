package com.socialComputing.p2.fileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.socialComputing.p2.core.Feature;
import com.socialComputing.p2.core.Graph;

public class FeatureNamesFileReader implements GraphFileReader {
	String fileLocation;
	public FeatureNamesFileReader(String fileLocation) {
		this.fileLocation = fileLocation;
	}
	

	@Override
	public void readFile() throws IOException {
		FileReader fileReader =  new FileReader(this.fileLocation);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		Graph graph = Graph.getInstance();
		
		String line;
		while((line = bufferedReader.readLine()) != null) {
			String featureNameInfo[] = line.trim().split(" ");
			int featureId = Integer.parseInt(featureNameInfo[0]);
			String featureName = featureNameInfo[1];
			int dependentFeatureId = Integer.parseInt(featureNameInfo[3]);
			Feature feature = new Feature(featureId, featureName, dependentFeatureId);
			graph.featureNames.add(feature);
			//System.out.println("Size : " + featureNameInfo.length + " : " + featureId + " : " +featureName + " : "+dependentFeatureId);
		}
		bufferedReader.close();	
	}

}
