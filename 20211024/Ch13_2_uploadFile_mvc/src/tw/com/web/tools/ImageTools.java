package tw.com.web.tools;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImageTools {
	private static String imagePath;
	
	public static void setImagePath(String path ) {
			imagePath = path;
	}
	
	
	public static void uploadFile(String filePath,
			String fileName,InputStream inputStr)throws IOException {
		Path targetPath = Paths.get(filePath, fileName);
		Files.copy(inputStr,targetPath,
				StandardCopyOption.REPLACE_EXISTING);
	}
	
	public static void useDefaultImagePathUpload(
			String fileName,InputStream inputStr)throws IOException {
		  uploadFile(imagePath,fileName,inputStr);
	}
	
	
	public static List<String> getUseDefaultImageFileNames() throws IOException{
		List<String> fileNameList = new ArrayList<>();
		Path path = Paths.get(imagePath);
		fileNameList = Files.list(path).
				map(p->p.getFileName().toString()).
				collect(Collectors.toList());
		return fileNameList;
	}
	
}
