public class ConnectionTest {
  public static void main(String[] args) { 
    try {
      Class.forName("org.sqlite.JDBC");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
