/**
 * A ShoppingBasket holds zero or more Products and can provide information
 * about the Products. One can add Products to a ShoppingBasket during its
 * lifetime, reset the ShoppingBasket, create a copy which contains Products of
 * at least a certain value, and make various queries to the ShoppingBasket.
 * (Thus, the number of Products that will be stored by a ShoppingBasket object
 * is not yet known when the new object is created, and it may grow and shrink
 * over the lifetime of a ShoppingBasket object.)
 *
 * @author Carsten Fuhs
 */
public class ShoppingBasket {

    // TO DO instance variables

    /* Constructors */

    /**
     * Constructs a new ShoppingBasket without any Products.
     */
    public ShoppingBasket() {
        // TO DO
    }

    /**
     * Constructs a new ShoppingBasket containing the non-null Products in
     * products. The products array may be modified by the caller afterwards
     * without affecting this ShoppingBasket, and it will not be modified by
     * this constructor.
     *
     * @param products must not be null; non-null elements are added to the
     *  constructed ShoppingBasket
     */
    public ShoppingBasket(Product[] products) {
        // TO DO
    }

    /* Modifiers */

    /**
     * Adds a Product e to this ShoppingBasket if e is not null; does not
     * modify this ShoppingBasket otherwise. Returns true if e is not null,
     * false otherwise.
     *
     * @param e an product to be added to this ShoppingBasket
     * @return true if e is not null, false otherwise
     */
    public boolean add(Product e) {
        // TO DO
        return false;
    }

    /**
     * Adds all non-null Products in products to this ShoppingBasket.
     *
     * @param products contains the Product objects to be added to
     *  this ShoppingBasket; must not be null (but may contain null)
     * @return true if at least one element of products is non-null;
     *  false otherwise
     */
    public boolean addAll(Product[] products) {
        // TO DO
        return false;
    }

    /**
     * Removes certain Products from this ShoppingBasket. Exactly those
     * Products are kept whose price in pence is greater than or equal to the
     * specified minimum price in pence.
     *
     * @param minProductPriceInPence the minimum price in pence for the
     *  Products that are kept
     */
    public void keepOnlyProductsWith(long minProductPriceInPence) {
        // TO DO
    }

    /* Accessors */

    /**
     * Returns the number of non-null Products in this ShoppingBasket.
     *
     * @return the number of non-null Products in this ShoppingBasket
     */
    public int numberOfProducts() {
        // TO DO
        return 0;
    }

    /**
     * Returns the total price of the Products in this ShoppingBasket.
     *
     * @return the total price of the Products in this ShoppingBasket.
     */
    public int totalPriceInPence() {
        // TO DO
        return 0;
    }

    /**
     * Returns the average price in pence of the (non-null) Products
     * in this ShoppingBasket. In case there is no Product in this
     * ShoppingBasket, -1.0 is returned.
     *
     * For example, if this ShoppingBasket has the contents
     *   new Product("Soda", 400, 1500)
     * and
     *   new Product("Water", 395, 1600),
     * the result is: 397.5
     *
     * @return the average price of the Products in this ShoppingBasket,
     *  or -1.0 if there is no such Product.
     */
    public double averagePriceInPence() {
        // TO DO
        return 0;
    }


    /**
     * Returns an array representation of the (non-null) Products in this
     * ShoppingBasket.
     *
     * @return an array representation of the (non-null) Products in this
     *  ShoppingBasket; the returned array is non-null and may be modified
     *  by the caller of the method without affecting this ShoppingBasket 
     */
    public Product[] toArray() {
        // TO DO
        return null;
    }

    /**
     * Returns a representation of the contents of this ShoppingBasket as
     * an array of arrays of Products such that none of the arrays of Products
     * has a total weight greater than maxParcelWeightInGrammes.
     *
     * The following (non-optimal) strategy is used to compute the result.
     *
     * If the number of Products in this ShoppingBasket is 0 or if
     * some Product in this ShoppingBasket has a weight greater than
     * maxParcelWeightInGrammes, the method returns null.
     *
     * Otherwise, the method creates a Shipment based on a two-dimensional
     * Product[][] array by visiting the entries of the array returned by
     * this.toArray() to fill the entries into "parcels" (of type Product[])
     * that are filled from left to right. If the maximum weight of a "parcel"
     * would be exceeded, a new parcel is started. 
     *
     * Example:
     * If this.toArray() returns a Product[] array of length 4 with Products
     * of weights 200, 300, 400, and 500 grammes at indices 0, 1, 2, and 3,
     * then for maxParcelWeightInGrammes == 1000, a Shipment would be created
     * based on a two-dimensional Product[][] array of length 2 that contains
     * at index 0 an array with the first three Products (they weigh together
     * 200+300+400 = 900 grammes, which is below maxParcelWeightInGrammes)
     * and at index 1 an array with just the Product of 500 grammes weight
     * (because 200+300+400+500 = 1400 > 1000) that needed to go into a
     * separate parcel.
     *
     * @param maxParcelWeightInGrammes the maximum weight of each "parcel" of
     *  the returned Shipment 
     * @return a Shipment with the contents of this ShoppingBasket
     *  such that none of the individual "parcels" has a weight greater than
     *  maxParcelWeightInGrammes, or null if this is not possible or this
     *  ShoppingBasket currently contains 0 products.
     */
    public Shipment toShipment(int maxParcelWeightInGrammes) {
        // TO DO
        return null;
    }

    /**
     * Returns a new ShoppingBasket with exactly those Products of this
     * ShoppingBasket whose price is greater than or equal to the specified
     * method parameter. Does not modify this ShoppingBasket.
     *
     * @param minProductPriceInPence the minimum price in pence for the
     *  Products in the new ShoppingBasket
     * @return a new ShoppingBasket with exactly those Products of this ShoppingBasket
     *  whose price is greater than or equal to the specified method parameter
     */
    public ShoppingBasket makeNewShoppingBasketWith(int minProductPriceInPence) {
        // TO DO
        return null;
    }

    /**
     * Returns a string representation of this ShoppingBasket. The string
     * representation consists of a list of the ShoppingBasket's contents,
     * enclosed in square brackets ("[]"). Adjacent Products are
     * separated by the characters ", " (comma and space). Products are
     * converted to strings as by their toString() method. The
     * representation does not mention any null references.
     *
     * So for
     *
     * Product p1 = new Product("Pen", 750, 60);
     * Product p2 = null;
     * Product p3 = new Product("Stamp", 80, 1);
     * Product[] products = { p1, p2, p1, p3 };
     * ShoppingBasket sb = new ShoppingBasket(products);
     *
     * the call sb.toString() will return one of the three following Strings:
     *
     * "[(Pen, 750p, 60g), (Pen, 750p, 60g), (Stamp, 80p, 1g)]"
     * "[(Pen, 750p, 60g), (Stamp, 80p, 1g), (Pen, 750p, 60g)]"
     * "[(Stamp, 80p, 1g), (Pen, 750p, 60g), (Pen, 750p, 60g)]"
     *
     * @return a String representation of this ShoppingBasket
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        // TO DO
        return null;
    }

    /* class methods */

    /**
     * Class method to return a ShoppingBasket with the highest total price
     * from an array of ShoppingBaskets. If we have an array with a
     * ShoppingBasket of 3000 pence and a ShoppingBasket with 4000 pence,
     * the ShoppingBasket with 4000 pence is returned.
     *
     * Entries of the array may be null, and your method should work also in
     * the presence of such entries. So, if in the above example we had an
     * additional third array entry null, the result would be exactly the same.
     *
     * If there are several ShoppingBaskets with the same price, it is up to
     * the method implementation to choose one of them as the result (i.e., the
     * choice is implementation-specific, and method users should not rely on
     * any particular behaviour).
     *
     * @param shoppingBaskets must not be null, but may contain null
     * @return one of the ShoppingBaskets with the highest total price among
     *  all ShoppingBaskets in the parameter array; null if there is no
     *  non-null reference in shoppingBaskets
     */
    public static ShoppingBasket mostValuedShoppingBasket(ShoppingBasket[] shoppingBaskets) {
        // TO DO
        return null;
    }
}
