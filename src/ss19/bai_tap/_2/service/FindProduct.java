package ss19.bai_tap._2.service;

import ss19.bai_tap._2.model.Product;

import java.util.List;

public class FindProduct {
    public static void Find(List<Product> product,String input){
        for (int i = 0; i < product.size(); i++) {
            if(input.equals(product.get(i).getCode())){
                System.out.println(product.get(i));
                break;
        }

        }
    }
}
