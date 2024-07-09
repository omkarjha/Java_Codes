package test;
public class AccessSpecifiersExample {
    public int publicInt = 10;
    private double privateDouble = 3.14;
    protected String protectedString = "Hello, World!";
    int defaultInt = 42; // No access specifier, package-private

    public void printVariables() {
        System.out.println("Public Int: " + publicInt);
        System.out.println("Private Double: " + privateDouble);
        System.out.println("Protected String: " + protectedString);
        System.out.println("Default Int: " + defaultInt);
    }
}
