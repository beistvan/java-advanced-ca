import java.util.*;
import java.util.stream.*;
  
public class Main {
  public static void main(String args[]) {  
    List<Integer> number = Arrays.asList(1,2,3,4);
    List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
    System.out.println("Squares: " + square);
    
    List<String> names = Arrays.asList("Omega","Alpha","Beta");
    List<String> find = names.stream().filter(s->s.startsWith("O")).collect(Collectors.toList());
    System.out.println("Name starts with O: " + find);

    List<String> sorted = names.stream().sorted().collect(Collectors.toList());
    System.out.println("Sorted names: " + sorted);

    List<Integer> numbers = Arrays.asList(1,2,3,4,1,2);
    Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
    System.out.println("Square set: " + squareSet);

    number.stream().map(x->x*x).forEach(y->System.out.println("  intermediate square: " + y));

    int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
    System.out.println("Reduce evens: " + even);
  }
}
