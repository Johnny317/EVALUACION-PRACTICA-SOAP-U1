
package consultassoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerGananciaChofer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerGananciaChofer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cedulaChofer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerGananciaChofer", propOrder = {
    "cedulaChofer"
})
public class ObtenerGananciaChofer {

    protected String cedulaChofer;

    /**
     * Obtiene el valor de la propiedad cedulaChofer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedulaChofer() {
        return cedulaChofer;
    }

    /**
     * Define el valor de la propiedad cedulaChofer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedulaChofer(String value) {
        this.cedulaChofer = value;
    }

}
