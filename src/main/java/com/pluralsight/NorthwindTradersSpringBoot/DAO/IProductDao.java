package com.pluralsight.NorthwindTradersSpringBoot.DAO;

import com.pluralsight.NorthwindTradersSpringBoot.models.Products;

import java.util.List;

public interface IProductDao {

        void add(Products product);

        List<Products> getAll();

        // search method
        // delete method
        // update method
}
