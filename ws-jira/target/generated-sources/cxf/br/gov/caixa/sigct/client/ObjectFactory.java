
package br.gov.caixa.sigct.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.caixa.sigct.client package. 
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

    private final static QName _SOAPException_QNAME = new QName("http://client.sigct.caixa.gov.br/", "SOAPException");
    private final static QName _GetTermosAlterados_QNAME = new QName("http://client.sigct.caixa.gov.br/", "getTermosAlterados");
    private final static QName _GetContratacoesAlteradas_QNAME = new QName("http://client.sigct.caixa.gov.br/", "getContratacoesAlteradas");
    private final static QName _GetContratacoes_QNAME = new QName("http://client.sigct.caixa.gov.br/", "getContratacoes");
    private final static QName _GetContratacoesFaturamentoAtual_QNAME = new QName("http://client.sigct.caixa.gov.br/", "getContratacoesFaturamentoAtual");
    private final static QName _GetContratacoesFaturamentoAtualResponse_QNAME = new QName("http://client.sigct.caixa.gov.br/", "getContratacoesFaturamentoAtualResponse");
    private final static QName _GetContratacoesResponse_QNAME = new QName("http://client.sigct.caixa.gov.br/", "getContratacoesResponse");
    private final static QName _GetTermosAlteradosResponse_QNAME = new QName("http://client.sigct.caixa.gov.br/", "getTermosAlteradosResponse");
    private final static QName _GetTermosResponse_QNAME = new QName("http://client.sigct.caixa.gov.br/", "getTermosResponse");
    private final static QName _GetContratacoesAlteradasResponse_QNAME = new QName("http://client.sigct.caixa.gov.br/", "getContratacoesAlteradasResponse");
    private final static QName _GetTermos_QNAME = new QName("http://client.sigct.caixa.gov.br/", "getTermos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.caixa.sigct.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetContratacoes }
     * 
     */
    public GetContratacoes createGetContratacoes() {
        return new GetContratacoes();
    }

    /**
     * Create an instance of {@link GetContratacoesResponse }
     * 
     */
    public GetContratacoesResponse createGetContratacoesResponse() {
        return new GetContratacoesResponse();
    }

    /**
     * Create an instance of {@link GetContratacoesFaturamentoAtualResponse }
     * 
     */
    public GetContratacoesFaturamentoAtualResponse createGetContratacoesFaturamentoAtualResponse() {
        return new GetContratacoesFaturamentoAtualResponse();
    }

    /**
     * Create an instance of {@link GetContratacoesAlteradas }
     * 
     */
    public GetContratacoesAlteradas createGetContratacoesAlteradas() {
        return new GetContratacoesAlteradas();
    }

    /**
     * Create an instance of {@link GetContratacoesFaturamentoAtual }
     * 
     */
    public GetContratacoesFaturamentoAtual createGetContratacoesFaturamentoAtual() {
        return new GetContratacoesFaturamentoAtual();
    }

    /**
     * Create an instance of {@link GetTermosAlterados }
     * 
     */
    public GetTermosAlterados createGetTermosAlterados() {
        return new GetTermosAlterados();
    }

    /**
     * Create an instance of {@link GetContratacoesAlteradasResponse }
     * 
     */
    public GetContratacoesAlteradasResponse createGetContratacoesAlteradasResponse() {
        return new GetContratacoesAlteradasResponse();
    }

    /**
     * Create an instance of {@link SOAPException }
     * 
     */
    public SOAPException createSOAPException() {
        return new SOAPException();
    }

    /**
     * Create an instance of {@link TermosView }
     * 
     */
    public TermosView createTermosView() {
        return new TermosView();
    }

    /**
     * Create an instance of {@link ContratacoesView }
     * 
     */
    public ContratacoesView createContratacoesView() {
        return new ContratacoesView();
    }

    /**
     * Create an instance of {@link GetTermosAlteradosResponse }
     * 
     */
    public GetTermosAlteradosResponse createGetTermosAlteradosResponse() {
        return new GetTermosAlteradosResponse();
    }

    /**
     * Create an instance of {@link GetTermosResponse }
     * 
     */
    public GetTermosResponse createGetTermosResponse() {
        return new GetTermosResponse();
    }

    /**
     * Create an instance of {@link GetTermos }
     * 
     */
    public GetTermos createGetTermos() {
        return new GetTermos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAPException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.sigct.caixa.gov.br/", name = "SOAPException")
    public JAXBElement<SOAPException> createSOAPException(SOAPException value) {
        return new JAXBElement<SOAPException>(_SOAPException_QNAME, SOAPException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTermosAlterados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.sigct.caixa.gov.br/", name = "getTermosAlterados")
    public JAXBElement<GetTermosAlterados> createGetTermosAlterados(GetTermosAlterados value) {
        return new JAXBElement<GetTermosAlterados>(_GetTermosAlterados_QNAME, GetTermosAlterados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContratacoesAlteradas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.sigct.caixa.gov.br/", name = "getContratacoesAlteradas")
    public JAXBElement<GetContratacoesAlteradas> createGetContratacoesAlteradas(GetContratacoesAlteradas value) {
        return new JAXBElement<GetContratacoesAlteradas>(_GetContratacoesAlteradas_QNAME, GetContratacoesAlteradas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContratacoes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.sigct.caixa.gov.br/", name = "getContratacoes")
    public JAXBElement<GetContratacoes> createGetContratacoes(GetContratacoes value) {
        return new JAXBElement<GetContratacoes>(_GetContratacoes_QNAME, GetContratacoes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContratacoesFaturamentoAtual }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.sigct.caixa.gov.br/", name = "getContratacoesFaturamentoAtual")
    public JAXBElement<GetContratacoesFaturamentoAtual> createGetContratacoesFaturamentoAtual(GetContratacoesFaturamentoAtual value) {
        return new JAXBElement<GetContratacoesFaturamentoAtual>(_GetContratacoesFaturamentoAtual_QNAME, GetContratacoesFaturamentoAtual.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContratacoesFaturamentoAtualResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.sigct.caixa.gov.br/", name = "getContratacoesFaturamentoAtualResponse")
    public JAXBElement<GetContratacoesFaturamentoAtualResponse> createGetContratacoesFaturamentoAtualResponse(GetContratacoesFaturamentoAtualResponse value) {
        return new JAXBElement<GetContratacoesFaturamentoAtualResponse>(_GetContratacoesFaturamentoAtualResponse_QNAME, GetContratacoesFaturamentoAtualResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContratacoesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.sigct.caixa.gov.br/", name = "getContratacoesResponse")
    public JAXBElement<GetContratacoesResponse> createGetContratacoesResponse(GetContratacoesResponse value) {
        return new JAXBElement<GetContratacoesResponse>(_GetContratacoesResponse_QNAME, GetContratacoesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTermosAlteradosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.sigct.caixa.gov.br/", name = "getTermosAlteradosResponse")
    public JAXBElement<GetTermosAlteradosResponse> createGetTermosAlteradosResponse(GetTermosAlteradosResponse value) {
        return new JAXBElement<GetTermosAlteradosResponse>(_GetTermosAlteradosResponse_QNAME, GetTermosAlteradosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTermosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.sigct.caixa.gov.br/", name = "getTermosResponse")
    public JAXBElement<GetTermosResponse> createGetTermosResponse(GetTermosResponse value) {
        return new JAXBElement<GetTermosResponse>(_GetTermosResponse_QNAME, GetTermosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContratacoesAlteradasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.sigct.caixa.gov.br/", name = "getContratacoesAlteradasResponse")
    public JAXBElement<GetContratacoesAlteradasResponse> createGetContratacoesAlteradasResponse(GetContratacoesAlteradasResponse value) {
        return new JAXBElement<GetContratacoesAlteradasResponse>(_GetContratacoesAlteradasResponse_QNAME, GetContratacoesAlteradasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTermos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.sigct.caixa.gov.br/", name = "getTermos")
    public JAXBElement<GetTermos> createGetTermos(GetTermos value) {
        return new JAXBElement<GetTermos>(_GetTermos_QNAME, GetTermos.class, null, value);
    }

}
