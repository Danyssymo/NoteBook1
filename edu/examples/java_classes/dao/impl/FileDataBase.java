package edu.examples.java_classes.dao.impl;

import java.io.*;
import java.util.*;

import edu.examples.java_classes.entity.Note;

public class FileDataBase {
    private static List<Note> notes = new ArrayList<>();
    static File file = new File("myFile.txt");
    static PrintWriter pw;

    static {
        try {
            pw = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static Scanner scanner;

    {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static BufferedReader br;

    static {
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("myFile.txt"), "cp1251"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static FileReader fr;

    static {
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static FileOutputStream fos;

    static {
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static ObjectOutputStream oos;

    static {
        try {
            oos = new ObjectOutputStream(fos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static FileInputStream fis;

    static {
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static ObjectInputStream ois;

    static {
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Note> readFromFile() {
        try {
            while (fr!= null){
                notes.add((Note) ois.readObject());
            }
        } catch (IOException e) {
            System.out.println("Не смог прочесть файл1");;
        } catch (ClassNotFoundException e) {
            System.out.println("Не смог прочесть файл2");
        }
        return notes;
    }

    public static void writeToFile(Note n) {
        try {
            oos.writeObject(n);
        } catch (IOException e) {
            System.out.println("Не смог добавить в файл файл");
        }
    }



//    public static void clear() {
//        notes.clear();
//    }

//    public static void delete(int idDelete) {
//        notes.remove(idDelete);
//    }

//    public static void sortNotesTitle() {
//        Collections.sort(notes);
//    }

//    public static void sortNotesContent() {
//        Comparator<Note> contentComparator = new SortingItems();
//        notes.sort(contentComparator);
//    }

//
    public static int countOfNotes() {
        return notes.size();
    }
}