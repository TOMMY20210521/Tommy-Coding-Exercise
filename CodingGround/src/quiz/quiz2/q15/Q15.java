package quiz.quiz2.q15;

import java.util.Optional;

class Person {
  private String firstName;

  private Person() {}

  public Optional<String> getFirstName() {
    return Optional.ofNullable((firstName));
  }

  public static Optional<Person> getInstance() {
    return 4%2==0 ? Optional.of(new Person()) : Optional.empty();
  }
}

public class Q15 {
  public static void main(String[] args) {
    Person.getInstance().ifPresent(p -> {
      System.out.println("Yes ");
      p.getFirstName().ifPresent(n -> System.out.println(n));
    });
    
  }
}

