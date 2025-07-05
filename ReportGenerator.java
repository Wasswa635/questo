import java.io.*;	
public class ReportGenerator {
public static void main(String[] args) {
FileWriter writer = null;
try {
writer = new FileWriter("report.txt");
writer.write("Patient Report");
} catch (IOException e) {
System.out.println("Error writing to file: " + e.getMessage());
} finally {
try {
if (writer != null) writer.close();
System.out.println("File closed");
} catch (IOException e) {
System.out.println("Error closing file: " + e.getMessage());
}
}
}
}
