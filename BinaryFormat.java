public class BinaryFormat {
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        // Check if the input string is a valid binary string
        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException("Invalid binary string: " + binaryString);
            }
        }

        // Convert the binary string to a decimal number
        int decimal = 0;
        int power = 0;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        return decimal;
    }

    public static void main(String[] args) {
        try {
            String binaryString = "1010101"; // Replace with your binary string
            int decimal = bin2Dec(binaryString);
            System.out.println("Decimal equivalent of " + binaryString + " is: " + decimal);
        } catch (BinaryFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
