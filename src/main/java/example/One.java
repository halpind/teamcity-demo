package example;

public class One {
  String message = "foo";

  public String foo() {
    return message;
  }

  public void uncoveredMethod() {
    for (int i = 0; i < 10; i++) {
    	;
    }
  }
}
