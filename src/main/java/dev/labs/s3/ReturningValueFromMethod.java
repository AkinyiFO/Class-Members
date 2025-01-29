package dev.labs.s3;

public class ReturningValueFromMethod {

    public static void main(String[] args) {

        ReturningValueFromMethod test = new ReturningValueFromMethod();

        test.completesAllStatements(); // Invoked method
        System.out.println("Continues after invoked completesAllStatements() returns to this code.");

        test.returnsAValue(5,2); // Invoked method
        System.out.println("Continues after invoked returnsAValue() returns to this code.");

    }

    void completesAllStatements(){
        System.out.println("Statement one");
        System.out.println("Statement two");
        System.out.println("Last statement");
        // Redundant but allowed
        //        return 6; // Compile-time error
    }

    int returnsAValue(int x, int y){
        System.out.println("Before return statement.");
        return x+y; // Required
    }

    // Can also return a reference datatype
    Database bestDatabase(Database oracle, Database postgres) {
        // Code to compare performance scores
        return postgres;
    }

}