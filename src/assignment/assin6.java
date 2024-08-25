package assignment;

public class assin6 {
    public static void main(String[] args) {

            // Get the Java version
            String javaVersion = System.getProperty("java.version");

            if (javaVersion != null) {
                System.out.println("Java is installed on your system.");
                System.out.println("Java Version: " + javaVersion);
            } else {
                System.out.println("Java is not installed on your system.");
            }
}}
