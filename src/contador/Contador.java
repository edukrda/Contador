package contador;
public class Contador {
        public static void main(String[] args) {
                try {
                    // Initialize and validate parameters
                    if (args.length != 2) {
                        throw new ParameterException("Please provide exactly two integer parameters.");
                    }

                    // Convert arguments to integers
                    int firstNumber = Integer.parseInt(args[0]);
                    int secondNumber = Integer.parseInt(args[1]);

                    // Process the numbers
                    processNumbers(firstNumber, secondNumber);

                } catch (NumberFormatException e) {
                    System.err.println("Error: Parameters must be valid integers.");
                } catch (ParameterException e) {
                    System.err.println("Error: " + e.getMessage());
                }
            }

            static void processNumbers(int firstNumber, int secondNumber) throws ParameterException {
                // Validate number order
                if (firstNumber > secondNumber) {
                    throw new ParameterException("The second parameter must be greater than the first");
                }

                // Calculate iterations needed
                int iterations = secondNumber - firstNumber;

                // Print numbers in sequence
                for (int i = 1; i <= iterations; i++) {
                    System.out.println("Printing number " + i);
                }
            }
        }

    class ParameterException extends Exception {
        public ParameterException(String message) {
            super(message);
        }
    }

