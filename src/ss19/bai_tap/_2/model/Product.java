package ss19.bai_tap._2.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String code;
    private String name;
    private String production;
    private int prices;
    private String describe;

    public Product() {
    }
    public Product(String code, String name, String production, int prices, String describe) {
        this.code = code;
        this.name = name;
        this.production = production;
        this.prices = prices;
        this.describe = describe;

    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", production='" + production + '\'' +
                ", prices=" + prices +
                ", describe='" + describe + '\'' +
                '}'+"\n";


//        return String.format("|%-6s|%-4s|%-14s|%-8s $|%-14s|\n", code, name, production,prices,describe);
    }
}
