public class HelloWorld {

  public static void main(String[] args) {
    String name = "yourname";
    String compName;
    if (args.length > 0){
        if (args.length > 1) {
            compName = args[0];
            name = args[1];
        }
        else {
            name = args[0];
        }
    }
    String capName = name.substring(0, 1).toUpperCase() + name.substring(1);
    System.out.println("Hello, " + capName + ".");
  }

}
