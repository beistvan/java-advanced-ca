public class ConnectionTest {
  public static void main(String[] args) { 
    try {
      Class.forName("org.sqlite.JDBC");
      System.out.println("The driver was successfully loaded.");
    } catch (ClassNotFoundException e) {
      // Do something to handle error
      e.printStackTrace();
      System.out.println("The driver class was not found in the program files at runtime.");
      System.exit(1);
    }
  }
}
