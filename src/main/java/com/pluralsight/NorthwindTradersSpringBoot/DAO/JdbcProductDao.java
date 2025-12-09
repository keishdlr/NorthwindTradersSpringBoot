package com.pluralsight.NorthwindTradersSpringBoot.DAO;

import com.pluralsight.NorthwindTradersSpringBoot.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcProductDao implements IProductDao {

    @Autowired
    private DataSource dataSource;

    @Override
    public void add(Products products){

    }
    public List<Products> getAll(){
        // Create an empty list to hold the product objects we will retrieve.
        List<Products> products = new ArrayList<>();

        // This is the SQL SELECT statement we will run.
        String sql = "SELECT productid, productName, categoryId, unitPrice FROM products";

        // This is a "try-with-resources" block.
        // It ensures that the Connection, Statement, and ResultSet are closed automatically after we are done.
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // Loop through each row in the ResultSet.
            while (rs.next()) {
                // Create a new product object.
                Products product = new Products();

                product.setProductid(rs.getInt("Productid"));

                product.setProductName(rs.getString("ProductName"));

                product.setCategoryId(rs.getInt("CategoryID"));

                product.setUnitPrice(rs.getDouble("rUnitPrice"));

                products.add(product);
            }

        } catch (SQLException e) {
            // If something goes wrong (SQL error), print the stack trace to help debug.
            e.printStackTrace();
        }

        // Return the list of product objects.
        return products;
    }
    }

}
