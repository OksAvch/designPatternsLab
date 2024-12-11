package org.homework.templatemethod;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Bakery {
    List<String> orders;

    public void bakeProducts(){
        for(String order : orders){

            String result = switch(order){
                case "cake" -> new CakeFlow().produceProduct();
                case "gingerbread" -> new GingerBreadFlow().produceProduct();
                default -> "Product not found: " + order;
            };

            System.out.printf(result);
        }
    }
}
