public class lesson9 {

        public static void main(String[] args) {
            String documentNumber = "1234-abc-5678-xyz-xzxy";

            printFirstTwoBlocks(documentNumber);
            printMaskedDocumentNumber(documentNumber);
            printLettersFormat(documentNumber);
            printUpperCaseLettersFormat(documentNumber);
            checkContainsSequence(documentNumber, "abc");
            checkStartsWithSequence(documentNumber, "555");
            checkEndsWithSequence(documentNumber, "1a2b");
        }

        public static void printFirstTwoBlocks(String documentNumber) {
            String[] blocks = documentNumber.split("-");
            if (blocks.length >= 2) {
                System.out.println(blocks[0] + "-" + blocks[1]);
            }
        }

        public static void printMaskedDocumentNumber(String documentNumber) {
            String masked = documentNumber.replaceAll("[a-zA-Z]{3}", "***");
            System.out.println(masked);
        }

        public static void printLettersFormat(String documentNumber) {
            String[] blocks = documentNumber.split("-");
            StringBuilder result = new StringBuilder();
            for (String block : blocks) {
                String letters = block.replaceAll("[0-9]", "");
                result.append(letters.toLowerCase()).append("/");
            }
            result.deleteCharAt(result.length() - 1);
            System.out.println(result);
        }

        public static void printUpperCaseLettersFormat(String documentNumber) {
            String[] blocks = documentNumber.split("-");
            StringBuilder result = new StringBuilder("Letters:");
            for (String block : blocks) {
                String letters = block.replaceAll("[0-9]", "").toUpperCase();
                result.append(letters).append("/");
            }
            result.deleteCharAt(result.length() - 1);
            System.out.println(result);
        }

        public static void checkContainsSequence(String documentNumber, String sequence) {
            if (documentNumber.toLowerCase().contains(sequence.toLowerCase())) {
                System.out.println("Contains sequence: " + sequence);
            } else {
                System.out.println("Does not contain sequence: " + sequence);
            }
        }

        public static void checkStartsWithSequence(String documentNumber, String sequence) {
            if (documentNumber.startsWith(sequence)) {
                System.out.println("Starts with sequence: " + sequence);
            } else {
                System.out.println("Does not start with sequence: " + sequence);
            }
        }

        public static void checkEndsWithSequence(String documentNumber, String sequence) {
            if (documentNumber.endsWith(sequence)) {
                System.out.println("Ends with sequence: " + sequence);
            } else {
                System.out.println("Does not end with sequence: " + sequence);
            }
        }
    }

