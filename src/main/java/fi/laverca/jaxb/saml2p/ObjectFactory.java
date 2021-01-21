
package fi.laverca.jaxb.saml2p;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import fi.laverca.jaxb.saml2a.EncryptedElementType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fi.laverca.jaxb.saml2p package. 
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

    private final static QName _StatusMessage_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:protocol", "StatusMessage");
    private final static QName _SubjectQuery_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:protocol", "SubjectQuery");
    private final static QName _GetComplete_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:protocol", "GetComplete");
    private final static QName _RequesterID_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:protocol", "RequesterID");
    private final static QName _Artifact_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:protocol", "Artifact");
    private final static QName _NewEncryptedID_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:protocol", "NewEncryptedID");
    private final static QName _NewID_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:protocol", "NewID");
    private final static QName _ManageNameIDResponse_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:protocol", "ManageNameIDResponse");
    private final static QName _SessionIndex_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:protocol", "SessionIndex");
    private final static QName _LogoutResponse_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:protocol", "LogoutResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fi.laverca.jaxb.saml2p
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Extensions }
     * 
     */
    public Extensions createExtensions() {
        return new Extensions();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link StatusCode }
     * 
     */
    public StatusCode createStatusCode() {
        return new StatusCode();
    }

    /**
     * Create an instance of {@link StatusDetail }
     * 
     */
    public StatusDetail createStatusDetail() {
        return new StatusDetail();
    }

    /**
     * Create an instance of {@link AssertionIDRequest }
     * 
     */
    public AssertionIDRequest createAssertionIDRequest() {
        return new AssertionIDRequest();
    }

    /**
     * Create an instance of {@link AuthnQuery }
     * 
     */
    public AuthnQuery createAuthnQuery() {
        return new AuthnQuery();
    }

    /**
     * Create an instance of {@link RequestedAuthnContext }
     * 
     */
    public RequestedAuthnContext createRequestedAuthnContext() {
        return new RequestedAuthnContext();
    }

    /**
     * Create an instance of {@link AttributeQuery }
     * 
     */
    public AttributeQuery createAttributeQuery() {
        return new AttributeQuery();
    }

    /**
     * Create an instance of {@link AuthzDecisionQuery }
     * 
     */
    public AuthzDecisionQuery createAuthzDecisionQuery() {
        return new AuthzDecisionQuery();
    }

    /**
     * Create an instance of {@link AuthnRequest }
     * 
     */
    public AuthnRequest createAuthnRequest() {
        return new AuthnRequest();
    }

    /**
     * Create an instance of {@link NameIDPolicy }
     * 
     */
    public NameIDPolicy createNameIDPolicy() {
        return new NameIDPolicy();
    }

    /**
     * Create an instance of {@link Scoping }
     * 
     */
    public Scoping createScoping() {
        return new Scoping();
    }

    /**
     * Create an instance of {@link IDPList }
     * 
     */
    public IDPList createIDPList() {
        return new IDPList();
    }

    /**
     * Create an instance of {@link IDPEntry }
     * 
     */
    public IDPEntry createIDPEntry() {
        return new IDPEntry();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link StatusResponseType }
     * 
     */
    public StatusResponseType createStatusResponseType() {
        return new StatusResponseType();
    }

    /**
     * Create an instance of {@link ArtifactResolve }
     * 
     */
    public ArtifactResolve createArtifactResolve() {
        return new ArtifactResolve();
    }

    /**
     * Create an instance of {@link ArtifactResponse }
     * 
     */
    public ArtifactResponse createArtifactResponse() {
        return new ArtifactResponse();
    }

    /**
     * Create an instance of {@link ManageNameIDRequest }
     * 
     */
    public ManageNameIDRequest createManageNameIDRequest() {
        return new ManageNameIDRequest();
    }

    /**
     * Create an instance of {@link Terminate }
     * 
     */
    public Terminate createTerminate() {
        return new Terminate();
    }

    /**
     * Create an instance of {@link LogoutRequest }
     * 
     */
    public LogoutRequest createLogoutRequest() {
        return new LogoutRequest();
    }

    /**
     * Create an instance of {@link NameIDMappingRequest }
     * 
     */
    public NameIDMappingRequest createNameIDMappingRequest() {
        return new NameIDMappingRequest();
    }

    /**
     * Create an instance of {@link NameIDMappingResponse }
     * 
     */
    public NameIDMappingResponse createNameIDMappingResponse() {
        return new NameIDMappingResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:protocol", name = "StatusMessage")
    public JAXBElement<String> createStatusMessage(String value) {
        return new JAXBElement<String>(_StatusMessage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectQueryAbstractType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubjectQueryAbstractType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:protocol", name = "SubjectQuery")
    public JAXBElement<SubjectQueryAbstractType> createSubjectQuery(SubjectQueryAbstractType value) {
        return new JAXBElement<SubjectQueryAbstractType>(_SubjectQuery_QNAME, SubjectQueryAbstractType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:protocol", name = "GetComplete")
    public JAXBElement<String> createGetComplete(String value) {
        return new JAXBElement<String>(_GetComplete_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:protocol", name = "RequesterID")
    public JAXBElement<String> createRequesterID(String value) {
        return new JAXBElement<String>(_RequesterID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:protocol", name = "Artifact")
    public JAXBElement<String> createArtifact(String value) {
        return new JAXBElement<String>(_Artifact_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptedElementType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EncryptedElementType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:protocol", name = "NewEncryptedID")
    public JAXBElement<EncryptedElementType> createNewEncryptedID(EncryptedElementType value) {
        return new JAXBElement<EncryptedElementType>(_NewEncryptedID_QNAME, EncryptedElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:protocol", name = "NewID")
    public JAXBElement<String> createNewID(String value) {
        return new JAXBElement<String>(_NewID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatusResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:protocol", name = "ManageNameIDResponse")
    public JAXBElement<StatusResponseType> createManageNameIDResponse(StatusResponseType value) {
        return new JAXBElement<StatusResponseType>(_ManageNameIDResponse_QNAME, StatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:protocol", name = "SessionIndex")
    public JAXBElement<String> createSessionIndex(String value) {
        return new JAXBElement<String>(_SessionIndex_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatusResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:protocol", name = "LogoutResponse")
    public JAXBElement<StatusResponseType> createLogoutResponse(StatusResponseType value) {
        return new JAXBElement<StatusResponseType>(_LogoutResponse_QNAME, StatusResponseType.class, null, value);
    }

}
