import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Teste {

	public static void main(String[] args) throws IOException {
		
		FileWriter fstream = new FileWriter("out.txt");
		BufferedWriter out = new BufferedWriter(fstream);
		String s = "Hello Java";
		out.write(s);
		out.close();
		
	}
	
}
