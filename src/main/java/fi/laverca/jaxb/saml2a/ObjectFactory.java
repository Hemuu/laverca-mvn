
package fi.laverca.jaxb.saml2a;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fi.laverca.jaxb.saml2a package. 
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

    private final static QName _Issuer_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:assertion", "Issuer");
    private final static QName _AssertionIDRef_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:assertion", "AssertionIDRef");
    private final static QName _EncryptedID_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedID");
    private final static QName _NameID_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:assertion", "NameID");
    private final static QName _SubjectConfirmationData_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:assertion", "SubjectConfirmationData");
    private final static QName _AuthnContextDeclRef_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContextDeclRef");
    private final static QName _AuthnContextClassRef_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContextClassRef");
    private final static QName _AttributeValue_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:assertion", "AttributeValue");
    private final static QName _AssertionURIRef_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:assertion", "AssertionURIRef");
    private final static QName _Condition_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:assertion", "Condition");
    private final static QName _Audience_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:assertion", "Audience");
    private final static QName _EncryptedAssertion_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedAssertion");
    private final static QName _Statement_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:assertion", "Statement");
    private final static QName _AuthnContextDecl_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContextDecl");
    private final static QName _AuthenticatingAuthority_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthenticatingAuthority");
    private final static QName _EncryptedAttribute_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedAttribute");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fi.laverca.jaxb.saml2a
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NameIDType }
     * 
     */
    public NameIDType createNameIDType() {
        return new NameIDType();
    }

    /**
     * Create an instance of {@link Subject }
     * 
     */
    public Subject createSubject() {
        return new Subject();
    }

    /**
     * Create an instance of {@link EncryptedElementType }
     * 
     */
    public EncryptedElementType createEncryptedElementType() {
        return new EncryptedElementType();
    }

    /**
     * Create an instance of {@link SubjectConfirmation }
     * 
     */
    public SubjectConfirmation createSubjectConfirmation() {
        return new SubjectConfirmation();
    }

    /**
     * Create an instance of {@link SubjectConfirmationDataType }
     * 
     */
    public SubjectConfirmationDataType createSubjectConfirmationDataType() {
        return new SubjectConfirmationDataType();
    }

    /**
     * Create an instance of {@link Attribute }
     * 
     */
    public Attribute createAttribute() {
        return new Attribute();
    }

    /**
     * Create an instance of {@link Action }
     * 
     */
    public Action createAction() {
        return new Action();
    }

    /**
     * Create an instance of {@link Evidence }
     * 
     */
    public Evidence createEvidence() {
        return new Evidence();
    }

    /**
     * Create an instance of {@link Assertion }
     * 
     */
    public Assertion createAssertion() {
        return new Assertion();
    }

    /**
     * Create an instance of {@link Conditions }
     * 
     */
    public Conditions createConditions() {
        return new Conditions();
    }

    /**
     * Create an instance of {@link AudienceRestriction }
     * 
     */
    public AudienceRestriction createAudienceRestriction() {
        return new AudienceRestriction();
    }

    /**
     * Create an instance of {@link OneTimeUse }
     * 
     */
    public OneTimeUse createOneTimeUse() {
        return new OneTimeUse();
    }

    /**
     * Create an instance of {@link ProxyRestriction }
     * 
     */
    public ProxyRestriction createProxyRestriction() {
        return new ProxyRestriction();
    }

    /**
     * Create an instance of {@link Advice }
     * 
     */
    public Advice createAdvice() {
        return new Advice();
    }

    /**
     * Create an instance of {@link AuthnStatement }
     * 
     */
    public AuthnStatement createAuthnStatement() {
        return new AuthnStatement();
    }

    /**
     * Create an instance of {@link SubjectLocality }
     * 
     */
    public SubjectLocality createSubjectLocality() {
        return new SubjectLocality();
    }

    /**
     * Create an instance of {@link AuthnContext }
     * 
     */
    public AuthnContext createAuthnContext() {
        return new AuthnContext();
    }

    /**
     * Create an instance of {@link AuthzDecisionStatement }
     * 
     */
    public AuthzDecisionStatement createAuthzDecisionStatement() {
        return new AuthzDecisionStatement();
    }

    /**
     * Create an instance of {@link AttributeStatement }
     * 
     */
    public AttributeStatement createAttributeStatement() {
        return new AttributeStatement();
    }

    /**
     * Create an instance of {@link KeyInfoConfirmationDataType }
     * 
     */
    public KeyInfoConfirmationDataType createKeyInfoConfirmationDataType() {
        return new KeyInfoConfirmationDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NameIDType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:assertion", name = "Issuer")
    public JAXBElement<NameIDType> createIssuer(NameIDType value) {
        return new JAXBElement<NameIDType>(_Issuer_QNAME, NameIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:assertion", name = "AssertionIDRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAssertionIDRef(String value) {
        return new JAXBElement<String>(_AssertionIDRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptedElementType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EncryptedElementType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:assertion", name = "EncryptedID")
    public JAXBElement<EncryptedElementType> createEncryptedID(EncryptedElementType value) {
        return new JAXBElement<EncryptedElementType>(_EncryptedID_QNAME, EncryptedElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NameIDType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:assertion", name = "NameID")
    public JAXBElement<NameIDType> createNameID(NameIDType value) {
        return new JAXBElement<NameIDType>(_NameID_QNAME, NameIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectConfirmationDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubjectConfirmationDataType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:assertion", name = "SubjectConfirmationData")
    public JAXBElement<SubjectConfirmationDataType> createSubjectConfirmationData(SubjectConfirmationDataType value) {
        return new JAXBElement<SubjectConfirmationDataType>(_SubjectConfirmationData_QNAME, SubjectConfirmationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:assertion", name = "AuthnContextDeclRef")
    public JAXBElement<String> createAuthnContextDeclRef(String value) {
        return new JAXBElement<String>(_AuthnContextDeclRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:assertion", name = "AuthnContextClassRef")
    public JAXBElement<String> createAuthnContextClassRef(String value) {
        return new JAXBElement<String>(_AuthnContextClassRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:assertion", name = "AttributeValue")
    public JAXBElement<Object> createAttributeValue(Object value) {
        return new JAXBElement<Object>(_AttributeValue_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:assertion", name = "AssertionURIRef")
    public JAXBElement<String> createAssertionURIRef(String value) {
        return new JAXBElement<String>(_AssertionURIRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConditionAbstractType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConditionAbstractType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:assertion", name = "Condition")
    public JAXBElement<ConditionAbstractType> createCondition(ConditionAbstractType value) {
        return new JAXBElement<ConditionAbstractType>(_Condition_QNAME, ConditionAbstractType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:assertion", name = "Audience")
    public JAXBElement<String> createAudience(String value) {
        return new JAXBElement<String>(_Audience_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptedElementType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EncryptedElementType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:assertion", name = "EncryptedAssertion")
    public JAXBElement<EncryptedElementType> createEncryptedAssertion(EncryptedElementType value) {
        return new JAXBElement<EncryptedElementType>(_EncryptedAssertion_QNAME, EncryptedElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatementAbstractType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatementAbstractType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:assertion", name = "Statement")
    public JAXBElement<StatementAbstractType> createStatement(StatementAbstractType value) {
        return new JAXBElement<StatementAbstractType>(_Statement_QNAME, StatementAbstractType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:assertion", name = "AuthnContextDecl")
    public JAXBElement<Object> createAuthnContextDecl(Object value) {
        return new JAXBElement<Object>(_AuthnContextDecl_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:assertion", name = "AuthenticatingAuthority")
    public JAXBElement<String> createAuthenticatingAuthority(String value) {
        return new JAXBElement<String>(_AuthenticatingAuthority_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptedElementType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EncryptedElementType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:assertion", name = "EncryptedAttribute")
    public JAXBElement<EncryptedElementType> createEncryptedAttribute(EncryptedElementType value) {
        return new JAXBElement<EncryptedElementType>(_EncryptedAttribute_QNAME, EncryptedElementType.class, null, value);
    }

}
