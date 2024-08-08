import Products.Brand;
import Products.MobilePhone;
import Products.Notebook;
import Products.Product;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class PatikaStore {

    Scanner input = new Scanner(System.in);
    static ArrayList<Product> notebooks = new ArrayList<>();
    static ArrayList<Product> phones = new ArrayList<>();

    int notebookCounter = 0;
    int phoneCounter = 0;

    static TreeSet<Brand> brands = new TreeSet<>();

    static {
        Brand samsung = new Brand(1, "Samsung");
        Brand lenovo = new Brand(2, "Lenovo");
        Brand apple = new Brand(3, "Apple");
        Brand huawei = new Brand(4, "Huawei");
        Brand casper = new Brand(5, "Casper");
        Brand asus = new Brand(6, "Asus");
        Brand hp = new Brand(7, "HP");
        Brand xiami = new Brand(8, "Xiami");
        Brand monster = new Brand(9, "Monster");

        brands.add(samsung);
        brands.add(lenovo);
        brands.add(apple);
        brands.add(huawei);
        brands.add(casper);
        brands.add(asus);
        brands.add(hp);
        brands.add(xiami);
        brands.add(monster);

        Notebook notebook1 = new Notebook(1, "Samsung", 1200, samsung, 124, 12, 16, 10, 20);
        Notebook notebook2 = new Notebook(2, "Apple", 1800, apple, 512, 16, 32, 5, 15);

        notebooks.add(notebook1);
        notebooks.add(notebook2);

        MobilePhone phone1 = new MobilePhone(1, "Phone A", 800, samsung, 64, 6, 6, 5, 15, 12, 4000, "Black");
        MobilePhone phone2 = new MobilePhone(2, "Phone B", 1000, apple, 128, 5, 8, 10, 10, 16, 3500, "White");

        phones.add(phone1);
        phones.add(phone2);

    }

    public void run() {

        System.out.println("Welcome to Patika Store! ");

        while (true) {
            printMenu();
            System.out.println();
            System.out.print("Choose an option: ");
            int select = input.nextInt();

            switch (select) {
                case 1:
                    notebookOperations();
                    break;
                case 2:
                    phoneOperations();
                    break;
                case 3:
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("Brands");
                    for (Brand brand : brands) {
                        System.out.println(brand);
                    }
                    break;
                case 4:
                    System.out.println("Logging out...");
                    System.out.println("See you!");
                    return;
                default:
                    System.out.println("Wrong choice. Enter again!");
                    break;
            }
        }
    }


    public void notebookOperations() {
        while (true) {
            notebookSubMenu();
            System.out.println();
            System.out.print("Choose an option: ");
            int select = input.nextInt();

            switch (select) {
                case 1:
                    addNotebook();
                    break;
                case 2:
                    deleteNotebook();
                    break;
                case 3:
                    printNotebook();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Wrong choice. Enter again!");
                    break;
            }
        }
    }

    public void phoneOperations() {
        while (true) {
            phoneSubMenu();
            System.out.println();
            System.out.print("Choose an option: ");
            int select = input.nextInt();

            switch (select) {
                case 1:
                    addPhone();
                    break;
                case 2:
                    deletePhone();
                    break;
                case 3:
                    printPhones();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Wrong choice. Enter again!");
                    break;
            }
        }
    }

    public void addNotebook() {
        for (Brand brand : brands) {
            System.out.println(brand.getID() + " - " + brand.getName());
        }
        System.out.print("Enter brand ID: ");
        int brandID = input.nextInt();
        input.nextLine();

        //Checking if there is a brand with the given ID.
        Brand selectedBrand = null;
        for (Brand brand : brands) {
            if (brand.getID() == brandID) {
                selectedBrand = brand;
                break;
            }
        }

        if (selectedBrand == null) {
            System.out.println("Invalid brand ID. Please try again.");
            return;
        }

        System.out.print("Enter Notebook name: ");
        String name = input.nextLine();
        System.out.print("Enter Notebook price: ");
        double price = input.nextDouble();
        System.out.print("Enter Notebook sale: ");
        double sale = input.nextDouble();
        System.out.print("Enter Notebook stock: ");
        int stock = input.nextInt();
        System.out.print("Enter Notebook storage (GB): ");
        int storage = input.nextInt();
        System.out.print("Enter Notebook screen size: ");
        int screenSize = input.nextInt();
        System.out.print("Enter RAM (GB): ");
        int RAM = input.nextInt();

        //Adding new notebook.
        Product newProduct = new Notebook(++notebookCounter, name, price, selectedBrand, storage, screenSize, RAM, sale, stock);
        notebooks.add(newProduct);
        System.out.println("Notebook added successfully!");
    }

    public void addPhone() {
        for (Brand brand : brands) {
            System.out.println(brand.getID() + " - " + brand.getName());
        }
        System.out.println("Enter brand ID: ");
        int brandId = input.nextInt();
        input.nextLine();

        Brand selectedBrand = null;
        for (Brand brand : brands) {
            if (brand.getID() == brandId) {
                selectedBrand = brand;
                break;
            }
        }

        if (selectedBrand == null) {
            System.out.println("Invalid brand ID. Please try again.");
            return;
        }

        System.out.print("Enter Mobile Phone name: ");
        String name = input.nextLine();

        System.out.print("Enter Mobile Phone price: ");
        double price = input.nextDouble();

        System.out.print("Enter Mobile Phone sale: ");
        double sale = input.nextDouble();

        System.out.print("Enter Mobile Phone stock: ");
        int stock = input.nextInt();

        System.out.print("Enter Mobile Phone storage (GB): ");
        int storage = input.nextInt();

        System.out.print("Enter Mobile Phone screen size: ");
        int screenSize = input.nextInt();

        System.out.print("Enter RAM (GB): ");
        int RAM = input.nextInt();

        System.out.print("Enter Camera (MP): ");
        int camera = input.nextInt();

        System.out.print("Enter Battery capacity (mAh): ");
        int battery = input.nextInt();
        input.nextLine();

        System.out.print("Enter color: ");
        String color = input.nextLine();

        //Adding new mobile phone.
        Product newProduct = new MobilePhone(++phoneCounter, name, price, selectedBrand, storage, screenSize, RAM, sale, stock, camera, battery, color);
        phones.add(newProduct);
        System.out.println("Mobile phone added successfully!");
    }

    public void deleteNotebook() {
        printNotebook();
        System.out.print("Enter the ID of the notebook you want to delete: ");
        int deleteID = input.nextInt();
        Product toDelete = null;

        for (Product notebook : notebooks) {
            if (notebook.getID() == deleteID) {
                toDelete = notebook;
            }
        }

        notebooks.remove(toDelete);
        System.out.println(toDelete + " is successfully deleted!");
    }

    public void deletePhone() {
        printPhones();
        System.out.print("Enter the ID of the phone you want to delete: ");
        int deleteID = input.nextInt();
        Product toDelete = null;

        for (Product phone : phones) {
            if (phone.getID() == deleteID) {
                toDelete = phone;
            }
        }

        phones.remove(toDelete);
        System.out.println(toDelete + " is successfully deleted!");
    }


    private static void printMenu() {

        System.out.println();
        System.out.println("***Patika Store Product Management Panel***");
        System.out.println(" 1- Notebook Operations\n " +
                "2- Mobile Phone Operations\n " +
                "3- List All Brands\n " +
                "4- Exit ");
    }

    public void printNotebook() {
        System.out.println("Notebooks");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %2s | %-8s | %-18s | %-10s | %-6s | %-3s | %-7s | %-10s | %-5s | \n", "ID", "Brand", "Name", "Price", "Sale", "Stock", "Storage", "RAM", "ScreenSize");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        notebooks.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void printPhones() {
        System.out.println("Mobile Phones");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %2s | %-8s | %-18s | %-10s | %-6s | %-3s | %-7s | %-10s | %-5s | \n", "ID", "Brand", "Name", "Price", "Sale", "Stock", "Storage", "RAM", "ScreenSize");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        phones.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
    }

    private static void notebookSubMenu() {

        System.out.println(" 1- Add New Notebook\n " +
                "2- Delete Notebook\n " +
                "3- List All Notebook\n " +
                "4- Exit ");
    }

    private static void phoneSubMenu() {

        System.out.println(" 1- Add New Mobile Phone\n " +
                "2- Delete Mobile Phone\n " +
                "3- List All Mobile Phone\n " +
                "4- Exit ");
    }
}
