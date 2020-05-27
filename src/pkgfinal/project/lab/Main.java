package pkgfinal.project.lab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dimensional d1 = new Dimensional(22, 12, 22, "D1", "des1", 34);
        Dimensional d2 = new Dimensional(22, 12, 22, "D2", "des2", 34);

        Weighted w1 = new Weighted(23, 23, "w1", "des1", 34);
        Weighted w2 = new Weighted(23, 23, "w2", "des2", 34);

        Product[] products = new Product[100];

        products[0] = d1;
        products[1] = d2;
        products[2] = w1;
        products[3] = w2;

        Scanner input = new Scanner(System.in);
        int selectedChoice = 0;
        char selectedPoductType = 'd';
        while (true) {

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

                    System.out.print("Enter product type (D/W):");
                    selectedPoductType = input.next().charAt(0);
                    switch (selectedPoductType) {
                        case 'D':
                            for (int i = 0; i < 4; i++) {
                                if (products[i] instanceof Dimensional) {
                                    System.out.println(products[i].toString());;

                                }

                            }

                            break;

                        case 'W':
                            for (int i = 0; i < 4; i++) {
                                if (products[i] instanceof Weighted) {
                                    System.out.println(products[i].toString());;

                                }

                            }
                            break;
                        default:
                            System.err.println("wrong choice you have to choice D or W!!!");

                    }

                    break;

                case 2:
                    System.out.println("chocie 2");
                    break;

                case 3:
                    System.out.println("chocie 3");
                    break;

                case 4:
                    System.out.println("chocie 4");
                    break;

                case 5:
                    System.out.println("chocie 5");
                    break;

                case 6:
                    System.out.println("chocie 6");
                    break;

                case 7:
                    System.out.println("chocie 7");
                    break;

                default:
                    System.out.println("wrong choice");

            }
        }
//        System.err.println("test");
    }

}
