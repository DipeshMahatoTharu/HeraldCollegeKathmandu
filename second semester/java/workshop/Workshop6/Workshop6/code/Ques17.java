//Develop a Java program to check if a given string represents a file with a ".txt" extension
public class Ques17 {
	    public static void main(String[] args) {
	        String filename1 = "document.txt";
	        String filename2 = "report.docx";

	        System.out.println(filename1 + " is a .txt file: " + isTxtFile(filename1));
	        System.out.println(filename2 + " is a .txt file: " + isTxtFile(filename2));
	    }

	    public static boolean isTxtFile(String filename) {
	        return filename.endsWith(".txt");
	    }
}

