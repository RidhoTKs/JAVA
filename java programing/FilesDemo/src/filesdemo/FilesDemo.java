/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesdemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author RTKS
 */
public class FilesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path dirPath = Paths.get("D:/coding/JavaProgramming/gameData");
        Path usersfilePath = Paths.get("Highscores.txt");
        Path settingsfilePath = Paths.get("Settings.txt");

        //create two variable for storing retirn value od checkfiles method
        Path users, settings;
        users = checkFiles(dirPath, usersfilePath);
        settings = checkFiles(dirPath, settingsfilePath);

        try {
            if (users != null) {
                displayFileStatus(users, settings);
            }
        } catch (IOException e) {
            System.err.println(e);
        }

        //invoke deletemethod
        deleteFile(settings);

    }

    //define method for deleting file or directory
    static void deleteFile(Path filePath) {
        // this will be delete the file/directory if it exists
        try {
            if (Files.exists(filePath)) {
                Files.delete(filePath);
                System.out.println(filePath.toString() + " deleted");
            } else {
                System.out.println(filePath.toString() + " not found!");
            }
        } catch (DirectoryNotEmptyException e) {
            System.err.println("The directory is not empty");
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    static Path checkFiles(Path dirPath, Path filePath) {
        //use resolve to add the directory path to the file path
        Path absPath = dirPath.resolve(filePath);
        try {
            if (Files.notExists(dirPath)) {
                Files.createDirectories(dirPath);
            }

            if (Files.notExists(absPath)) {
                Files.createFile(absPath);
            }
        } catch (IOException e) {
            System.err.println(e);
            return null;
        }
        return absPath;
    }

    static void displayFileStatus(Path users, Path settings) throws IOException {
        System.out.println("Readable : " + Files.isReadable(users));
        System.out.println("Writeable : " + Files.isWritable(users));
        System.out.println("Executable: " + Files.isExecutable(users));
        System.out.println("Hidden : " + Files.isHidden(users));
        System.out.println("Same files: " + Files.isSameFile(users,
                settings));
    }

}
