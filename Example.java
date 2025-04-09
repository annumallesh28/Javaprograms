package Javaprograms;
class Example {
    int value;

    // Constructor using 'this' keyword
    Example(int value) {
        this.value = value; // 'this' refers to the instance variable
    }

    // Method to display the value
    void displayValue() {
        System.out.println("The value is: " + this.value);
    }

    public static void main(String[] args) {
        Example obj = new Example(10); // Creating an object with value 10
        obj.displayValue(); // Calling the method to display the value
    }
}
