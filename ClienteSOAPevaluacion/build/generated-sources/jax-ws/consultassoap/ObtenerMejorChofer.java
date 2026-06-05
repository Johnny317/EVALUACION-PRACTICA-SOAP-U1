
package consultassoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerMejorChofer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerMejorChofer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cedulaPropietario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerMejorChofer", propOrder = {
    "cedulaPropietario"
})
public class ObtenerMejorChofer {

    protected String cedulaPropietario;

    /**
     * Obtiene el valor de la propiedad cedulaPropietario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedulaPropietario() {
        return cedulaPropietario;
    }

    /**
     * Define el valor de la propiedad cedulaPropietario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedulaPropietario(String value) {
        this.cedulaPropietario = value;
    }

}
