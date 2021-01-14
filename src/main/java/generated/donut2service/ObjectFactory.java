
package generated.donut2service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.donut2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RecevoirDonut_QNAME = new QName("http://www.example.org/donut2/", "recevoirDonut");
    private final static QName _Topping_QNAME = new QName("http://www.example.org/donut2/", "topping");
    private final static QName _DonutDispoResponse_QNAME = new QName("http://www.example.org/donut2/", "donutDispoResponse");
    private final static QName _DeposerDonutResponse_QNAME = new QName("http://www.example.org/donut2/", "deposerDonutResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.donut2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DonutDispo }
     * 
     */
    public DonutDispo createDonutDispo() {
        return new DonutDispo();
    }

    /**
     * Create an instance of {@link ListOfDonuts }
     * 
     */
    public ListOfDonuts createListOfDonuts() {
        return new ListOfDonuts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/donut2/", name = "recevoirDonut")
    public JAXBElement<Integer> createRecevoirDonut(Integer value) {
        return new JAXBElement<Integer>(_RecevoirDonut_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/donut2/", name = "topping")
    public JAXBElement<String> createTopping(String value) {
        return new JAXBElement<String>(_Topping_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/donut2/", name = "donutDispoResponse")
    public JAXBElement<Integer> createDonutDispoResponse(Integer value) {
        return new JAXBElement<Integer>(_DonutDispoResponse_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/donut2/", name = "deposerDonutResponse")
    public JAXBElement<Boolean> createDeposerDonutResponse(Boolean value) {
        return new JAXBElement<Boolean>(_DeposerDonutResponse_QNAME, Boolean.class, null, value);
    }

}
