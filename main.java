public class main {
      
  public static void main(String args[]) {
    Library library;

    library = Library.get();
    Simulation simulation = new Simulation(library);
  }
}
