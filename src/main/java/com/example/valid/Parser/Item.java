package com.example.valid.Parser;


import lombok.Data;

@Data
public class Item {

    private String label;
    private String brand;
    private String barcode;
    private String special_code;
    private double buyingPrice;
    private String categoryTree;

    private double price1;
    private double price2;
    private double price3;
    private double price4;
    private double price5;

    private double vendor_price_1;
    private double vendor_price_2;
    private double vendor_price_3;
    private double vendor_price_4;
    private double vendor_price_5;

    private double discounted_price;

    private double vendor_price_1_discounted;
    private double vendor_price_2_discounted;


    private double vendor_price_3_discounted;
    private double vendor_price_4_discounted;
    private double vendor_price_5_discounted;

    private int tax;

    private String currency;

    private String stockType;
    private String details;
    private  String simpleDetail;
    private int stockCode;
    private int stockAmount;
    private String picture1Path;
    private String picture2Path;
    private String metaDescription;
    private String color;
    private int width;
    private int height;
    private int depth;
    private int weight;
    private double deci;
}
