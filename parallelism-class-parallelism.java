import java.util.*;
import java.util.stream.*;
  
public class Parallelism {
  public static void main(String args[]) {
    List<String> welcome = Arrays.asList("Welcome","to","streams!");
    welcome.stream().forEach(y->System.out.println(y));
  }
}
