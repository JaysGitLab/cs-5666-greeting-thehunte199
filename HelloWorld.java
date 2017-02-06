public class HelloWorld {

  public static void main(String[] args) {
    String name = "yourname";
    if (args.length > 0){
        name = args[0];
    }
    String capName = name.substring(0, 1).toUpperCase() + name.substring(1);
    System.out.println("Helloo, " + capName);
    
}

}
