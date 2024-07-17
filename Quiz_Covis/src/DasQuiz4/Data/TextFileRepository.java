package DasQuiz4.Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class TextFileRepository implements FileRepository{

    private Path filePath;

    public TextFileRepository(String fileName) {
        this.filePath = Paths.get(fileName);
    }

    @Override
    public List<String> readAllLines() throws IOException {

        return Files.readAllLines(filePath);
    }

    @Override
    public void create(String line) throws IOException {
        Files.write(filePath, (line + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }

    @Override
    public String readLine(int lineNumber) throws IOException {
        List<String> lines = readAllLines();
        if (lineNumber < 0 || lineNumber >= lines.size()) {
            throw new IndexOutOfBoundsException("Ungültige Zeilennummer: " + lineNumber);
        }
        return lines.get(lineNumber);
    }

    @Override
    public void updateLine(int lineNumber, String newline) throws IOException {
        List<String> lines = readAllLines();
        if (lineNumber < 0 || lineNumber >= lines.size()) {
            throw new IndexOutOfBoundsException("Ungültige Zeilennummer: " + lineNumber);
        }
        lines.set(lineNumber, newline);
        Files.write(filePath, lines);
    }

    @Override
    public void deleteLine(int lineNumber) throws IOException {
        List<String> lines = readAllLines();
        if (lineNumber < 0 || lineNumber >= lines.size()) {
            throw new IndexOutOfBoundsException("Ungültige Zeilennummer: " + lineNumber);
        }
        lines.remove(lineNumber);
        Files.write(filePath, lines);
    }

    @Override
    public void delete(String filePath) throws IOException {
        Files.deleteIfExists(Path.of(filePath));
    }

}
