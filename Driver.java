package pa2;

public class Driver {

  public static void main(String[] args) {
    if (args.length == 3) {
      ControllerPa1.controller(args);
    } else {
      Control controller = new Control();
      controller.run();
    }

  }
}
