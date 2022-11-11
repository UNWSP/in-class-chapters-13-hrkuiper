import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

import javax.imageio.IIOException;

public class ch131 {
	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();
		
		// getting both files
		Path path = Paths.get("c:\\ users\\ haydenkuiper\\ song lyric");
		Path word = Paths.get("c:\\ users\\ haydenkuiper\\ thing");
		
		try {
			
			// scanning files hopefully 
			BasicFileAttributes attrText = Files.readAttributes(path, BasicFileAttributes.class);
			BasicFileAttributes attrText1 = Files.readAttributes(word, BasicFileAttributes.class);
			
			long textSize = attrText.size();
			long wordSize = attrText.size();
			double ratio = textSize * 100.0 / wordSize;
			
			System.out.println(textSize);
			System.out.println(wordSize);
			System.out.println(ratio);
			
			
		}
		catch (IOException e)
		{
			System.out.println("not working");
		}
		
		
		
	}

}
