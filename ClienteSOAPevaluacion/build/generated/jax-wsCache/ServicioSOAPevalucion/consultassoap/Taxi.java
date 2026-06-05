
package consultassoap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para taxi complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="taxi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="choferes" type="{http://ConsultasSOAP/}chofer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="idTaxi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxi", propOrder = {
    "anio",
    "choferes",
    "idTaxi",
    "marca",
    "modelo",
    "placa"
})
public class Taxi {

    protected int anio;
    @XmlElement(nillable = true)
    protected List<Chofer> choferes;
    protected String idTaxi;
    protected String marca;
    protected String modelo;
    protected String placa;

    /**
     * Obtiene el valor de la propiedad anio.
     * 
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Define el valor de la propiedad anio.
     * 
     */
    public void setAnio(int value) {
        this.anio = value;
    }

    /**
     * Gets the value of the choferes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the choferes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChoferes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Chofer }
     * 
     * 
     */
    public List<Chofer> getChoferes() {
        if (choferes == null) {
            choferes = new ArrayList<Chofer>();
        }
        return this.choferes;
    }

    /**
     * Obtiene el valor de la propiedad idTaxi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTaxi() {
        return idTaxi;
    }

    /**
     * Define el valor de la propiedad idTaxi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTaxi(String value) {
        this.idTaxi = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad placa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define el valor de la propiedad placa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

}
