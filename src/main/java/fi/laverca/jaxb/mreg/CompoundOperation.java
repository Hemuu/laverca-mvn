
package fi.laverca.jaxb.mreg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompoundOperationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompoundOperationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.methics.fi/MSSPRegistration/v1.0.0#}OperationInputType"&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompoundOperationType", namespace = "http://www.methics.fi/MSSPRegistration/v1.0.0#")
@XmlRootElement(name = "CompoundOperation", namespace = "http://www.methics.fi/MSSPRegistration/v1.0.0#")
public class CompoundOperation
    extends OperationInputType
{


}
