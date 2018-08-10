/**
 * Created by expert on 6/26/18.
 */
public class product {
    int productid;
    String productname;
    float price;

    product(int productid, String productname, float price) {
        this.productid = productid;
        this.productname = productname;
        this.price = price;
    }
     product(){}//for calling display function we create a default constructor
    public void displayDetails(product product[]) {//syntax:displayfunction(classname arrayname[])
        for (product b : product) {//iterating values
            if (b.price < 100)//condition
                System.out.println("productid:" + b.productid + "productname:" + b.productname + "price:" + b.price);
        }

    }

    public static void main(String[] args) {
        product p = new product(12, "pen", 100);
        product p1 = new product(11, "pen", 50);
        product parray[] = {p, p1};//product class te object tee array create cheyan
        //FOR PRINTING VALUES WITHOUT DISPLAY FUNCTION
       // for (product a : parray) {
          //  System.out.println("productid:" + a.productid + "productname:" + a.productname + "price:" + a.price);
       product p3=new product();//object created for default constructor
        p3.displayDetails(parray);//calling display function using created object
    }
    }

