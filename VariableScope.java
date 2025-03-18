public class VariableScope {
    // Global variable
    static int globalCount = 100;
    
    // Main method
    public static void main(String[] args) {
        // Print globalCount in main
        System.out.println("Global Count (from main): " + globalCount);
        
        // Call showScope method
        showScope();
    }
    
    // Method to demonstrate variable scope
    public static void showScope() {
        // Local variable
        int localCount = 50;
        
        // Print globalCount and localCount in showScope
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
