package pkgfinal.project.lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static Product readProductFromkeyboard(char DorW) {
        Product pro = null;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your product id: ");
        int productId = input.nextInt();

        System.out.print("Enter your product name: ");
        String productName = input.next();

        System.out.print("Enter your product descrtiption: ");
        String productDesc = input.next();

        System.out.print("Enter your product price: ");
        int productPrice = input.nextInt();

        if (DorW == 'D') {

            System.out.print("Enter your product length: ");
            int productLength = input.nextInt();

            System.out.print("Enter your product width: ");
            int productWidth = input.nextInt();

            pro = new Dimensional(productId, productName, productDesc, productWidth, productLength, productPrice);

        } else {

            System.out.print("Enter your product weight: ");
            int productWeight = input.nextInt();
            pro = new Weighted(productId, productName, productDesc, productWeight, productPrice);

        }
        return pro;
    }

    public static void main(String[] args) {

        ArrayList<Product> products = FileReader.readFromFile();
//        System.out.println(products.size());
        Scanner input = new Scanner(System.in);
        int selectedChoice = 0;
        int productId = 0;

        char selectedPoductType = 'd';
          while (true) {
              try{
    
            System.out.println("1- Show All Products");
            System.out.println("2- Add Product");
            System.out.println("3- Delete Product");
            System.out.println("4- Edit Product");
            System.out.println("5- Calculate Total Price");
            System.out.println("6- Save data to file");
            System.out.println("7- Exit");
            System.out.print("Enter your choice: ");
            selectedChoice = input.nextInt();
            switch (selectedChoice) {
                case 1:
//                    Product products[] = FileReader.readFromFile();

                    System.out.print("Enter product type (D/W):");
                    selectedPoductType = input.next().charAt(0);
                    switch (selectedPoductType) {
                        case 'D':

                            for (Product product : products) {
                                if (product instanceof Dimensional) {
                                    System.out.println(product.toString());;
                                }
                            }
                            break;
                        case 'W':
                            for (Product product : products) {
                                if (product instanceof Weighted) {
                                    System.out.println(product.toString());;
                                }
                            }

                            break;
                        default:
                            System.err.println("wrong choice you have to choice D or W!!!");

                    }

                    break;

                case 2:
                    System.out.print("Enter product type (D/W):");
                    selectedPoductType = input.next().charAt(0);
                    switch (selectedPoductType) {
                        case 'D':

                            Product res1 = readProductFromkeyboard('D');
                            products.add(res1);
                            System.out.println(res1.getName());
                            ;
                            break;
                        case 'W':

                            Product res2 = readProductFromkeyboard('D');

                            break;
                        default:
                            System.err.println("wrong choice you have to choice D or W!!!");

                    }

                    System.out.println("chocie 2");
                    break;

                case 3:
                    System.out.print("Enter product id: ");
                    productId = input.nextInt();
                    Product p = null;
                    for (Product product : products) {
                        if (product.getId() == productId) {
                            p = product;
                        }
                    }
                    products.remove(p);

                    System.out.println("deleted ^-^");
                    break;

                case 4:
                    System.out.print("Enter product id: ");
                    productId = input.nextInt();
                    Product p2 = null;
                    for (Product product : products) {
                        if (product.getId() == productId) {
                            p2 = product;
                        }                        }

                        products.remove(p2);

                        System.out.println(p2.toString());

                        switch ((p2 instanceof Weighted) ? 'W' : 'D') {
                            case 'D':

                                Product res1 = readProductFromkeyboard('D');
                                products.add(res1);
                                System.out.println(res1.getName());
                                ;
                                break;
                            case 'W':

                                Product res2 = readProductFromkeyboard('D');

                                break;
                            default:
                                System.err.println("wrong choice you have to choice D or W!!!");

                        }

                        System.out.println("chocie 2");
                        break;

                    
            
        
    

case 5:
    int total = 0;
    for (Product pro : products) {
total += pro.calcPay();
    }
    System.out.println("total price: "  + total);
                    break;

       case 6:
                        String FilePath = "C:\\Users\\Mosab\\Documents\\NetBeansProjects\\final-project-lab\\src\\pkgfinal\\project\\lab\\data.txt";
                       PrintWriter writer;
                writer = new PrintWriter(FilePath, "UTF-8");
                 for (Product product : products) {
                            writer.println(product.toStringFile());

                        }
                        writer.close();
       
                        System.out.println("chocie 6");
                        break;
                    
                case 7:
                                        System.out.println("by by...");

                    System.exit(0);
                    break;

                default:
                    System.out.println("wrong choice");

            }
        }

              catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }catch(java.util.InputMismatchException ex){
                System.err.println("enter a numric value??");
            }
                       }
      
//        System.err.println("test");
    }

}
