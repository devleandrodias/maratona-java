package javacore.newio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * AtributosBasicosTest
 */
public class AtributosBasicosTest {

  public static void main(String[] args) throws IOException {
    Date primeiroDezembro = new GregorianCalendar(2015, Calendar.DECEMBER, 1).getTime();

    File file = new File("core\\Arquivo.txt");

    file.createNewFile();

    file.setLastModified(primeiroDezembro.getTime());

    System.out.println(file.lastModified());

    file.delete();

    Path ph = Paths.get("core/folder/arquivo_path.txt");

    Files.createFile(ph);

    FileTime ft = FileTime.fromMillis(primeiroDezembro.getTime());

    Files.setLastModifiedTime(ph, ft);

    Files.deleteIfExists(ph);

    System.out.println(Files.getLastModifiedTime(ph));

    System.out.println(Files.isReadable(ph));
    System.out.println(Files.isWritable(ph));
    System.out.println(Files.isExecutable(ph));

    // Atributoso todos OS , sistemas unix , sistemas windows
    // BasicFilesAtrributes, PosixFilesAtrributes, DosFilesAtrributes

    BasicFileAttributes basicFileAttributes = Files.readAttributes(ph, BasicFileAttributes.class);

    System.out.println(basicFileAttributes.creationTime());
    System.out.println(basicFileAttributes.lastModifiedTime());
    System.out.println(basicFileAttributes.lastAccessTime());
    System.out.println(basicFileAttributes.isDirectory());
    System.out.println(basicFileAttributes.isSymbolicLink());
    System.out.println(basicFileAttributes.isRegularFile());
  }
}