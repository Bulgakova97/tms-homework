public class Lesson10 {

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

    public class DocumentNumberValidator {
        public static void main(String[] args) {
            if (args.length != 1) {
                System.out.println("Usage: java DocumentNumberValidator <inputFileName>");
                return;
            }

            String inputFileName = args[0];

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
                String line;
                try (BufferedWriter validWriter = new BufferedWriter(new FileWriter("valid_documents.txt"));
                     BufferedWriter invalidWriter = new BufferedWriter(new FileWriter("invalid_documents.txt"))) {

                    while ((line = reader.readLine()) != null) {
                        // Убираем лишние пробелы
                        line = line.trim();

                        if (isValidDocumentNumber(line)) {
                            validWriter.write(line + "\n");
                        } else {
                            invalidWriter.write(line + " - Невалидный номер документа\n");
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static boolean isValidDocumentNumber(String documentNumber) {
            // Проверка на валидность номера документа
            return documentNumber.matches("^(docnum|contract)[A-Za-z0-9]{13}$");
        }
    }
}
