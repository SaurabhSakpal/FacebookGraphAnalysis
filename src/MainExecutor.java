import java.io.IOException;

public class MainExecutor {

	public static void main(String[] args) throws IOException {
		
		EdgeListReader reader = new EdgeListReader("/home/saurabh/workspace_2/FacebookGraphAnalysis/resources/0.edges");
		reader.readFile();
	}

}
