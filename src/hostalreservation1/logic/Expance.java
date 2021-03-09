
package hostalreservation1.logic;

import java.io.Serializable;


public class Expance implements Serializable
{
    public String product;
    public String price;

    public Expance(String product, String price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
}
