package pkgfinal.project.lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    public static  ArrayList<Product>   readFromFile(){
        
//        Product[] products = new Product[100];
        ArrayList<Product> products = new ArrayList<Product>();


        // pass the path to the file as a parameter 
        File file
                = new File("C:\\Users\\Mosab\\Documents\\NetBeansProjects\\final-project-lab\\src\\pkgfinal\\project\\lab\\data.txt");
        Scanner sc;
        try {
            int counter = 0;
            sc = new Scanner(file);
            while (sc.hasNextLine()) {

                String stringToSplit = sc.nextLine();
                String[] tempArray;
                String delimiter = ",";
                tempArray = stringToSplit.split(delimiter);
                tempArray = stringToSplit.split(delimiter);
                if (tempArray[tempArray.length - 1].charAt(0) == 'D') {
                    Dimensional d1 = new Dimensional(Integer.parseInt(tempArray[0]), tempArray[1], tempArray[2], Integer.parseInt(tempArray[3]), Integer.parseInt(tempArray[4]), Integer.parseInt(tempArray[5]));
                  products.add(d1);
//                    products[counter] = d1;
                } else  if (tempArray[tempArray.length - 1].charAt(0) == 'W') {

                    Weighted w2 = new Weighted(Integer.parseInt(tempArray[0]), tempArray[1], tempArray[2], Integer.parseInt(tempArray[3]), Integer.parseInt(tempArray[4]));
                                      products.add(w2);

//                    products[counter] = w2;
                }else{
//                    System.out.println("nothing");
                }
                counter++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return products;
    }
}
