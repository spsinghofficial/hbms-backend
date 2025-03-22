package com.netneus.hotel_service.entity;

import java.util.*; // Should trigger AvoidStarImport
import java.io.*; // Should trigger AvoidStarImport

// Bad class naming convention (should be PascalCase)
public class bad_code_example { 
    
    public static final String MESSAGE="This is a constant"; // Missing space around "="
    private int unusedVariable; // Unused variable should be flagged
    int defaultAccess; // Should be private
    static int STATIC_VALUE=10; // No space around "=" and incorrect naming

    // No constructor (empty class behavior warning)
    
    public void badMethod( ) { // Extra space before parentheses
        // No spaces after control statements
        for(int i=0;i<10;i++){
            System.out.println("Line "+i);
        }
        
        // Bad variable names
        int a = 5; // Non-descriptive variable name
        String s = "test"; // Non-descriptive variable name
        
        // Missing braces
        if (a > 3)
            System.out.println("Greater than 3");
        
        // Long line that will likely exceed line length limits
        System.out.println("This is a very very very very very very very very very very very very very very very very very very very very long line");
        
        // Redundant if statement
        boolean flag = true;
        if (flag == true) { // Should be 'if (flag)'
            System.out.println("True");
        }
        
        // Unused variables and imports
        List<String> list = new ArrayList<>(); // Unused variable
        
        // Magic numbers
        int result = a * 42; // Should be replaced with a constant
        
        // Extra whitespace
        System.out.println( "Extra spaces"  );

        // Nested loops with bad indentation
        for(int i = 0; i < 5; i++)
          for(int j=0;j<3;j++)  // Should be properly indented
              System.out.println("Bad indentation");

        // Improper method naming
        bad_Method(); // Method should be camelCase

        emptyMethod(); // Empty method should be removed or documented
    }
    
    public void bad_Method(){ // Should be 'badMethod'
        
        // Unused local variable
        int unused = 10; 
        
        // Calling deprecated method
        Date date = new Date();
        date.getYear(); // Deprecated API
        
        // Unnecessary semicolon
        int x = 5;;
        
        // Too many parameters (should trigger parameter number rule)
        overloadedMethod(1,2,3,4,5,6);
        
        // Hardcoded password (security issue)
        String password = "123456"; // Hardcoded credentials
        
        // Empty try-catch block
        try {
            int y = 10 / 0;
        } catch (Exception e) { }
        
        // Catching generic exception
        try {
            int y = 10 / 0;
        } catch (Exception e) { 
            System.out.println("Caught exception"); 
        }
        
        // Unnecessary else after return
        if (x > 0) {
            return;
        } else { // Else is not needed
            System.out.println("Unnecessary else");
        }

    }
    
    // Extra blank line above
    private void emptyMethod() {} // Should contain a comment or meaningful content
    
    // Too many parameters
    public void overloadedMethod(int a, int b, int c, int d, int e, int f) {
        System.out.println("Too many parameters");
    }

    // Static method inside non-utility class
    public static void staticMethod() { 
        System.out.println("Static method in non-utility class");
    }

    // Unused private method
    private void unusedMethod() {
        System.out.println("This method is never used");
    }

    // Avoid inline conditionals
    public void badConditional() {

                                                        int value = (true) ? 1 : 0; // Should be replaced with if-else
    }
}
