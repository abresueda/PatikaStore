public class Main {
    public static void main(String[] args) {
        try {
            PatikaStore store = new PatikaStore();
            store.run();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}