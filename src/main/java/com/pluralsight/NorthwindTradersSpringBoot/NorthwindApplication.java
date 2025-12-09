package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.DAO.IProductDao;
import com.pluralsight.NorthwindTradersSpringBoot.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Scanner;

public class NorthwindApplication {

    @Autowired
    @Qualifier("jdbcProductDao") // choose where to get the films(can switch between DB [jdbcFilmDao] and 'simpleFilmDAO')
    private IProductDao filmDAO;

    @Override
    public void run (String...args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("""
                    === Welcome to the Product Admin Menu ===
                            1) List All Products
                            2) Add a Product
                            3)Exit the app
                    Enter your Choice:
                    """);
            switch (scanner.nextInt()){
                case 1:
                    displayAllProducts();
                    break;

                case 2:
                    AddProduct();
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }


    }
    private void AddProduct() {

        System.out.println("We are adding a new film");

        Products theProduct = new Products();

        try {
            // Delay for 3000 milliseconds (5 seconds)
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            // Restore interrupted state and handle gracefully
            Thread.currentThread().interrupt();
            System.err.println("Delay was interrupted!");
            return;
        }
        System.out.println("Film added ✅");
    }

    private void displayAllProducts() {

        List<Products> Products = Product.getAll();
        Products.forEach(System.out::println);
    }
}




}
