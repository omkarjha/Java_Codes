package test;

public class AccessExample {
    public static void main(String[] args) {
        AccessSpecifiersExample example = new AccessSpecifiersExample();

        // Accessing variables from the same package
        System.out.println("Accessing variables from the same package:");
        System.out.println("Public Int from AccessExample: " + example.publicInt);
        System.out.println("Private Double from AccessExample: " +
                example.privateDouble); // Error, private not accessible
        System.out.println("Protected String from AccessExample: " + example.protectedString);
        System.out.println("Default Int from AccessExample: " + example.defaultInt);

        // Accessing variables through a method
        System.out.println("\nAccessing variables through a method:");
        example.printVariables();
    }

}