import java.io.*;

public class test {

	public static void main(String[] args) throws IOException {
		String fileName = "newFile.txt";
        String folderName = "IOstream";

        // Create a file
        createFile(fileName);

        // Write to the file
        writeFile(fileName, "Phan Thanh Phuc, Vietnam Korea University of Information and Communication Technolody," + "\n" + " 23ite1, software development major");

        // Read from the file
        String content = readFile(fileName);
        System.out.println("File content: " + content);

        // Get the file path
        String filePath = getPath(fileName);
        System.out.println("File path: " + filePath);

        // Delete the file
        deleteFile(fileName);

        // Create a folder
        createFolder(folderName);
	}
	
	public static void createFile(String name) {
		try {
			File file = new File(name);
			//check whether if file is created
			if(file.createNewFile()) {
				System.out.println("File created: " + name);
			}else {
				System.out.println("File already existed: " + name);
			}
		} catch (IOException e) {
			System.out.println("Error creating file");
		}
	}
	
	public static void writeFile(String name, String content) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(name));
			writer.write(content);
			writer.close();
		} catch (IOException e) {
			System.out.println("Error writing to file");
		}
	}
	
	public static String readFile(String name) {
		String content = "";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(name));
			String line;
			while ((line = reader.readLine()) != null) {
				content += line + "\n";
			}
			reader.close();
			return content;
		} catch (IOException e) {
			System.out.println("Error reading file");
			return "";
		}
	}
	
	public static String getPath(String name) {
		File file = new File(name);
		return file.getAbsolutePath();
	}
	
	public static void deleteFile(String name) {
		try {
			File file = new File(name);
			if(file.delete()) {
				System.out.println("File deleted: " + name);
			}else {
				System.out.println("Fail to delete file");
			}
		} catch (SecurityException e) {
			System.out.println("Error deleting file");
		}
	}
	
	public static void createFolder(String folderName) {
		try {
			File folder = new File(folderName);
			if(folder.mkdir()) {
				System.out.println("Folder created: " + folderName);
			}else {
				System.out.println("Folder already existed");
			}
		} catch (SecurityException e) {
			System.out.println("Error creating folder");
		}
	}
}
