package ca.bcit.comp2526;

import java.io.*;
import java.util.Scanner;

/**
 * File handling
 */
class Main {

    public static void main(String[] args) {

        final File file;


        file = new File("test.txt"); // "." tell what the currently working directory is
//        System.out.println(file.getAbsolutePath()); // prints where the file is running from
//        System.out.println(file.exists()); // boolean, true if exists

        try(final Scanner scanner = new Scanner( new BufferedReader( new FileReader(file)))){

           final String line;
           final int value;

            if(scanner.hasNextLine()){

                line = scanner.nextLine();
            } else {
                throw new RuntimeException();
            }
            if(scanner.hasNextInt()){

                value = scanner.nextInt();
            } else {
                value = -1;
            }

            System.out.println(line);
            System.out.println(value);


        } catch (IOException e) {
            e.printStackTrace();
        }

        //-----------

//        try(final BufferedReader reader = new BufferedReader( new FileReader(file))){
//            int c;
//            c = reader.read();
//            System.out.println((char)c); //Prints only H
//            final String line;
//            line = reader.readLine(); // Prints the whole line
//            System.out.println(line);
//        } catch (IOException e) {}

    }
}
