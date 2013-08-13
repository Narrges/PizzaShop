/*
 * BookBean.java
 *
 */
package beans;

/**
 *
 * @author  Fredrik �lund, Olle Eriksson
 */
public class BookBean {

    // describe a book
    
    private int ingID;
    private String ingName;
    private int ingPrice;
    
    
    /** Creates a new instance of BookBean */
    public BookBean() {
    }
    
    public int getPrice() {
        return ingPrice;
    }
    
    public void setPrice(int _price) {
        ingPrice = _price;
    }
    
    public String getTitle() {
        return ingName;
    }
    
    public void setTitle(String _title) {
        ingName=_title;
    }

       public int getId() {
        return ingID;
    }
    
    public void setId( int _id) {
        ingID= _id;
        
    }
   
    // create an XML document describing the book
    
    public String getXml() {

	// use a Stringbuffer (not String) to avoid multiple
	// object creation

     StringBuffer xmlOut = new StringBuffer();
      
      xmlOut.append("<book>");
      xmlOut.append("<id>");
      xmlOut.append(ingID);
      xmlOut.append("</id>");      
      xmlOut.append("<title><![CDATA[");
      xmlOut.append(ingName);
      xmlOut.append("]]></title>");
      xmlOut.append("<price>");
      xmlOut.append(ingPrice);      
      xmlOut.append("</price>");
      xmlOut.append("</book>");
      
      return xmlOut.toString();
    
        
    }   
}
