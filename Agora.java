import java.util.ArrayList;
import java.util.Scanner;

class body {
    ArrayList<String> products = new ArrayList<String>();
    ArrayList<String> price = new ArrayList<String>();
    ArrayList<String> user_name = new ArrayList<String>();
    ArrayList<String> admin_name = new ArrayList<String>();
    ArrayList<String> user_pass = new ArrayList<String>();
    ArrayList<String> admin_pass = new ArrayList<String>();
    int choice, totalPrice = 0, Count = 0, electronic_size = 1, meat_size = 1, food_size = 1, veg_size = 1,
            fish_size = 1, book_size = 1;
    String email_gmail, string_temp, new_product;
    ArrayList<Integer> cart = new ArrayList<Integer>();

    Scanner input = new Scanner(System.in);

    body() {
        user_name.add("miraz");
        user_pass.add("1234");
        admin_name.add("admin");
        admin_pass.add("admin");

        products.add("Apple Laptop");
        products.add("Beef Curry");
        products.add("Cucumber");
        products.add("Chicken(local)");
        products.add("Hilsha Fish");
        products.add("Prophet Muhammad Saw Lifestyle");

        price.add("250000");
        price.add("1000");
        price.add("100");
        price.add("400");
        price.add("1200");
        price.add("1500");

        home_section();
    }

    void sub_signup() {
        System.out.print("\tEnter Full Your Name : ");
        string_temp = input.nextLine();
        System.out.print("\tEnter Your Email : ");
        email_gmail = input.nextLine();
        System.out.print("\tEnter Your User Name : ");
        string_temp = input.nextLine();
        user_name.add(string_temp);
        System.out.print("\tCreate Your Password : ");
        string_temp = input.nextLine();
        user_pass.add(string_temp);
        System.out.print("\tConfirm Your Password : ");
        string_temp = input.nextLine();
        if (user_pass.get(user_pass.size() - 1).compareTo(string_temp) == 0) {
            System.out.println("\t\t\t\t\t\t\t*** Successfully Signed Up ***");
        } else {
            System.out.println("\t\t\t\t\t\t\t***Password Doesn't Match***");
        }
    }

    void signin_section() {
        Count = 0;
        String name, pass;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\t\t\t\t\t\t\t***Welcome To Agora again***");
        System.out.print("\tEnter your user name : ");
        name = input.nextLine();
        System.out.print("\tEnter your password : ");
        pass = input.nextLine();
        for (int i = 0; i < admin_name.size(); i++) {
            if ((name.compareTo(admin_name.get(i)) == 0) && (pass.compareTo(admin_pass.get(i)) == 0)) {
                Count = 1;
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Welcome To Agora Again Admin Panel***");
                admin_section();
                break;
            }
        }
        for (int i = 0; i < user_name.size(); i++) {
            if ((name.compareTo(user_name.get(i)) == 0) && (pass.compareTo(user_pass.get(i)) == 0)) {
                Count = 1;
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                user_Section();
                break;
            }
        }
        if (Count == 0) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("\t\t\t\t\t\t\t***Invalid user name or password***\n");
            home_section();
        }

    }

    void signup_section() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
        sub_signup();
        home_section();
    }

    void home_section() {
        int choice;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
        System.out.println("\t1.Sign In\n\t2.Sign Up");
        System.out.print("\tChoice From (1/2) : ");
        choice = input.nextInt();
        string_temp = input.nextLine();
        switch (choice) {
            case 1:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                signin_section();
                break;
            case 2:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                signup_section();
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Successfully sign up***\n");
                signin_section();
                break;
            default:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                System.out.println("\t\t\t\t\t\t\t*** Invalid Choice *** Try Again ***");
                home_section();
        }
    }

    void admin_section() {
        System.out.println(
                "\t1.Change user name\n\t2.Change Password\n\t3.Add Sub Admin\n\t4.Add Product\n\t5.Delete product\n\t6.Log Out\n\t0.Exit");
        System.out.print("\tChoice From (0/1/2/3/4/5/6) : ");
        choice = input.nextInt();
        string_temp = input.nextLine();
        switch (choice) {
            case 1:
                Count = 0;
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Welcome To Agora Again Admin Panel***");
                System.out.print("\tEnter Password : ");
                string_temp = input.nextLine();
                for (int i = 0; i < admin_name.size(); i++) {
                    if (string_temp.compareTo(admin_pass.get(i)) == 0) {
                        Count = 1;
                        admin_name.remove(i);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Welcome To Agora Again Admin Panel***");
                        System.out.print("\tEnter New User Name : ");
                        string_temp = input.nextLine();
                        admin_name.add(string_temp);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                        System.out.println("\t\t\t\t\t\t\t***User Name Change Successfullyn***");
                        home_section();
                        break;
                    }
                }
                if (Count == 0) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\t\t\t\t\t\t\t***Invalid Password***Try Again***\n");
                    signin_section();
                }
                break;
            case 2:
                Count = 0;
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Welcome To Agora Again Admin Panel***");
                System.out.print("\tEnter Password : ");
                string_temp = input.nextLine();
                for (int i = 0; i < admin_name.size(); i++) {
                    if (string_temp.compareTo(admin_pass.get(i)) == 0) {
                        Count = 1;
                        admin_pass.remove(i);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Welcome To Agora Again Admin Panel***");
                        System.out.print("\tEnter New Password : ");
                        string_temp = input.nextLine();
                        admin_pass.add(string_temp);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                        System.out.println("\t\t\t\t\t\t\t***User Name Change Successfully***n");
                        home_section();
                        break;
                    }
                }
                if (Count == 0) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\t\t\t\t\t\t\t***Invalid Password***Try Again***\n");
                    signin_section();
                }
                break;
            case 3:
                Count = 0;
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Welcome To Agora Again Admin Panel***");
                System.out.print("\tEnter Password : ");
                string_temp = input.nextLine();
                for (int i = 0; i < admin_name.size(); i++) {
                    if (string_temp.compareTo(admin_pass.get(i)) == 0) {
                        Count = 1;
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Welcome To Agora Again Admin Panel***");
                        System.out.print("\tEnter Sub Admin User Name : ");
                        string_temp = input.nextLine();
                        admin_name.add(string_temp);
                        System.out.print("\tEnter Sub Admin Password : ");
                        string_temp = input.nextLine();
                        admin_pass.add(string_temp);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                        System.out.println("\t\t\t\t\t\t\t***Sub Admin Added Successfully***\n");
                        admin_section();
                        break;
                    }
                }
                if (Count == 0) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\t\t\t\t\t\t\t***Invalid Password***Try Again***\n");
                    signin_section();
                }
                break;
            case 4:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Welcome To Agora Again Admin Panel***");
                System.out.print("\tEnter Product Type : ");
                string_temp = input.nextLine();
                switch (string_temp) {
                    case "electronics":
                        choice = electronic_size;
                        break;
                    case "food":
                        choice = electronic_size + food_size;
                        break;
                    case "vegetables":
                        choice = electronic_size + food_size + veg_size;
                        break;
                    case "meat":
                        choice = electronic_size + food_size + veg_size + meat_size;
                        break;
                    case "fish":
                        choice = electronic_size + food_size + veg_size + meat_size + fish_size;
                        break;
                    case "book":
                        choice = electronic_size + food_size + veg_size + meat_size + fish_size + book_size;
                        break;
                }
                System.out.print("\tEnter Product Name : ");
                new_product = input.nextLine();
                products.add(choice, new_product);
                System.out.print("\tEnter Price Of The Product : ");
                new_product = input.nextLine();
                price.add(choice, new_product);
                switch (string_temp) {
                    case "electronics":
                        electronic_size++;
                        break;
                    case "food":
                        food_size++;
                        break;
                    case "vegetables":
                        veg_size++;
                        break;
                    case "meat":
                        meat_size++;
                        break;
                    case "fish":
                        fish_size++;
                        break;
                    case "book":
                        book_size++;
                        break;
                }
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Welcome To Agora Again Admin Panel***");
                System.out.println("\t\t\t\t\t\t\t***Item Added Successfully***");
                admin_section();
                break;
            case 5:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Welcome To Agora Again Admin Panel***");
                for (int i = 0; i < products.size(); i++) {
                    System.out.println("\t" + i + "\t" + products.get(i) + "\t" + "USD " + price.get(i) + "$");
                }
                System.out.print("\tEnter Product Code : ");
                choice = input.nextInt();
                for (int i = 0; i < products.size(); i++) {
                    if (choice == i) {
                        products.remove(choice);
                    }
                }
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Welcome To Agora Again Admin Panel***");
                System.out.println("\t\t\t\t\t\t\t***Item Removed Successfully***\n");
                admin_section();
                break;
            case 6:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Welcome To Agora Again Admin Panel***");
                home_section();
                break;
            case 0:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Welcome To Agora Again Admin Panel***");
                System.out.println("\t\t\t\t\t\t\t\t***Have A Good Day***");
                System.exit(1);
                break;
            default:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Welcome To Agora Again Admin Panel***");
                System.out.println("\t\t\t\t\t\t\t*** Invalid Choice *** Try Again ***");
                admin_section();
        }
    }

    void user_Section() {
        System.out.println(
                "\t1.Change user name\n\t2.Change Password\n\t3.Buy Product\n\t4.PayBill\n\t5.View Cart\n\t6.Log Out\n\t0.Exit");
        System.out.print("\tChoice From (0/1/2/3/4/5): ");
        choice = input.nextInt();
        string_temp = input.nextLine();
        switch (choice) {
            case 1:
                Count = 0;
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                System.out.print("\tEnter Password : ");
                string_temp = input.nextLine();
                for (int i = 0; i < user_pass.size(); i++) {
                    if (string_temp.compareTo(user_pass.get(i)) == 0) {
                        Count = 1;
                        user_name.remove(i);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                        System.out.print("\tEnter New User Name : ");
                        string_temp = input.nextLine();
                        user_name.add(string_temp);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                        System.out.println("\t\t\t\t\t\t\t***User Name Change Successfully***\n");
                        home_section();
                        break;
                    }
                }
                if (Count == 0) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\t\t\t\t\t\t\t***Invalid Password***Try Again***\n");
                    signin_section();
                }
                break;
            case 2:
                Count = 0;
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                System.out.print("\tEnter Password : ");
                string_temp = input.nextLine();
                for (int i = 0; i < user_pass.size(); i++) {
                    if (string_temp.compareTo(user_pass.get(i)) == 0) {
                        Count = 1;
                        user_pass.remove(i);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                        System.out.print("\tEnter New Password : ");
                        string_temp = input.nextLine();
                        user_pass.add(string_temp);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                        home_section();
                        break;
                    }
                }
                if (Count == 0) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\t\t\t\t\t\t\t***Invalid Password***Try Again***\n");
                    signin_section();
                }
                break;
            case 3:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                System.out.println("\tCATEGORIES : ");
                System.out.println(
                        "\t\t1.Electronics\n\t\t2.Foods\n\t\t3.Vegetables\n\t\t4.Meats\n\t\t5.Fishes\n\t\t6.Books\n\t\t0.Main Menu");
                System.out.print("\t\tChoice Cateforie (0/1/2/3/4/5/6) : ");
                choice = input.nextInt();
                string_temp = input.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                        System.out.println("CATEGORIES : Electronics");
                        for (int i = 0; i < electronic_size; i++) {
                            System.out.println("\t" + i + "\t" + products.get(i) + "\t" + "USD " + price.get(i) + "$");
                        }
                        break;
                    case 2:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                        System.out.println("CATEGORIES : Foods");
                        for (int i = electronic_size; i < electronic_size + food_size; i++) {
                            System.out.println("\t" + i + "\t" + products.get(i) + "\t" + "USD " + price.get(i) + "$");
                        }
                        break;
                    case 3:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                        System.out.println("CATEGORIES : Vegetables");
                        for (int i = electronic_size + food_size; i < electronic_size + food_size + veg_size; i++) {
                            System.out.println("\t" + i + "\t" + products.get(i) + "\t" + "USD " + price.get(i) + "$");
                        }
                        break;
                    case 4:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                        System.out.println("CATEGORIES : Meats");
                        for (int i = electronic_size + food_size + veg_size; i < electronic_size + food_size + veg_size
                                + meat_size; i++) {
                            System.out.println("\t" + i + "\t" + products.get(i) + "\t" + "USD " + price.get(i) + "$");
                        }
                        break;
                    case 5:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                        System.out.println("CATEGORIES : Fishes");
                        for (int i = electronic_size + food_size + veg_size + meat_size; i < electronic_size + food_size
                                + veg_size + meat_size + fish_size; i++) {
                            System.out.println("\t" + i + "\t" + products.get(i) + "\t" + "USD " + price.get(i) + "$");
                        }
                        break;
                    case 6:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                        System.out.println("CATEGORIES : Books");
                        for (int i = electronic_size + food_size + veg_size + meat_size + fish_size; i < products
                                .size(); i++) {
                            System.out.println("\t" + i + "\t" + products.get(i) + "\t" + "USD " + price.get(i) + "$");
                        }
                        break;
                    case 0:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                        user_Section();
                        break;
                }
                System.out.print("\tEnter Product Code, Separeted By Space(-1 For Main Menu) : ");
                string_temp = input.nextLine();
                if (string_temp.compareTo("-1") == 0) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                    user_Section();
                }
                String[] itemCodeStr = string_temp.split(" ", products.size() * 3);
                for (int i = 0; i < itemCodeStr.length; i++) {
                    int temp = Integer.parseInt(itemCodeStr[i]);
                    cart.add(temp);
                    totalPrice += Integer.parseInt(price.get(temp));
                }
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                System.out.println("\t\t\t\t\t\t\t***Successfully Added To Cart***\n");
                user_Section();
                break;
            case 4:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                System.out.println("\tTotal Amount Is : " + totalPrice);
                System.out.print("\tEnter Account Number : ");
                string_temp = input.nextLine();
                System.out.print("\tEnter Password : ");
                string_temp = input.nextLine();
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                System.out.println("\t\t\t\t\t\t\t***Payment Successfull***\n");
                cart.clear();
                user_Section();
                break;
            case 5:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                System.out.println("\t\t\t\t\t\t\t\t***Cart Details***");
                if (cart.size() <= 0) {
                    System.out.println("\t\t\t\t\t\t\t\t\t Empty\n");
                }
                for (int i = 0; i < cart.size(); i++) {
                    for (int j = 0; j < products.size(); j++) {
                        if (cart.get(i) == j) {
                            System.out.println("\t" + j + "\t" + products.get(j) + "\t" + "USD " + price.get(j) + "$");
                        }
                    }
                }
                System.out.println();
                System.out.print("\tPress 1 For Main Menu Or 0 For Exit : ");
                choice = input.nextInt();
                string_temp = input.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                        user_Section();
                        break;
                    case 0:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                        System.out.println("\t\t\t\t\t\t\t\t***Have A Good Day***");
                        System.exit(1);
                        break;
                }
                break;
            case 6:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                home_section();
                break;
            case 0:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                System.out.println("\t\t\t\t\t\t\t\t***Have A Good Day***");
                System.exit(1);
                break;
            default:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\t\t\t\t\t\t\t***Here You Are At Agora Again***");
                System.out.println("\t\t\t\t\t\t\t*** Invalid Choice *** Try Again ***");
                admin_section();
        }
    }
}

public class Agora {
    public static void main(String[] args) {
        body child = new body();
        child.toString();
    }
}