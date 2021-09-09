package com.jaiv.WatchStore.service;


import com.jaiv.WatchStore.model.Shop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

   public List<Shop> getProducts(){
      List<Shop> shops  = new ArrayList<>();

      Shop shop1 = new Shop(1, "https://cdn.shopify.com/s/files/1/0027/2357/7914/articles/A22A1281_1200x.jpg?v=1597178612",
              "Test1", "$2323");

      Shop shop2 = new Shop(2, "https://cdn.shopify.com/s/files/1/0027/2357/7914/articles/A22A1281_1200x.jpg?v=1597178612",
              "Test2", "$29823");

      Shop shop3 = new Shop(3, "https://cdn.shopify.com/s/files/1/0027/2357/7914/articles/A22A1281_1200x.jpg?v=1597178612",
              "Test3", "$222323");


      shops.add(shop1);
      shops.add(shop2);
      shops.add(shop3);

      return shops;
   }

   public List<Shop> searchProducts(String productName){
      List<Shop> shops  = new ArrayList<>();

      Shop shop1 = new Shop(1, "https://cdn.shopify.com/s/files/1/0027/2357/7914/articles/A22A1281_1200x.jpg?v=1597178612",
              productName, "$5698");



      shops.add(shop1);

      return shops;
   }
}
