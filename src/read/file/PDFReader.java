package read.file;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class PDFReader {
	static InputStream inputStream;

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\amitk\\Documents\\digitalcommons.kennesaw.edu_cgi_viewcontent.pdf");

		try {
			inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

		int data;
		while ((data = inputStream.read()) >= 0) {
			outputStream.write(data);
		}

		inputStream.close();
	}
}
