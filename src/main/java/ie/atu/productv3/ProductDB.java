package ie.atu.productv3;

import ie.atu.productv3.Book;
import ie.atu.productv3.Software;

public class ProductDB {

    public static Product getProduct(String productCode) {

        Product myProduct = null;

        ie.atu.productv3.Book myBook = null;
        if (productCode.equalsIgnoreCase("java")) {
            myBook = new ie.atu.productv3.Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            myBook = new ie.atu.productv3.Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
        } else if (productCode.equalsIgnoreCase("mysql")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
        }


        ie.atu.productv3.Software mySoftware = null;
        if (productCode.equalsIgnoreCase("studios")) {
            mySoftware = new ie.atu.productv3.Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
        } else if (productCode.equalsIgnoreCase("oracle")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
        }
        ie.atu.productv3.TV myTv = null;
        if (productCode.equalsIgnoreCase("549410")) {
            myTv = new ie.atu.productv3.TV();
            myTv.setCode(productCode);
            myTv.setDescription("Smart 4K ultra HD HDR LED TV");
            myTv.setPrice(379.00);
            myTv.setManufacture("LG 43UR78006LK");
            myTv.setScreensize(" 43' ");
            myProduct = myTv;
        }

        if (productCode.equalsIgnoreCase("601510")) {
            myTv = new ie.atu.productv3.TV();
            myTv.setCode(productCode);
            myTv.setDescription("HD ready LED TV");
            myTv.setPrice(219.00);
            myTv.setManufacture("Panasonic TX-32M33OB");
            myTv.setScreensize(" 32' ");
            myProduct = myTv;
        }

        if (productCode.equalsIgnoreCase("529217")) {
            myTv = new ie.atu.productv3.TV();
            myTv.setCode(productCode);
            myTv.setDescription("Smart Full HD LED TV");
            myTv.setPrice(249.00);
            myTv.setManufacture("Toshiba 43LV2E63DB");
            myTv.setScreensize(" 43' ");
            myProduct = myTv;
        }

        return myProduct;
    }
}
//  public static Book or Software getProduct(String productCode) {
// In a more realistic application, this code would get the data for the product from a file or database
// For now, this code just uses if/else statements to return the correct product data
