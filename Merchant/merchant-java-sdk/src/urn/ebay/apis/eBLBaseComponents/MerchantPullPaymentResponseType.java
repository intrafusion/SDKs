package urn.ebay.apis.eBLBaseComponents;
import urn.ebay.apis.eBLBaseComponents.PayerInfoType;
import urn.ebay.apis.eBLBaseComponents.PaymentInfoType;
import urn.ebay.apis.eBLBaseComponents.MerchantPullInfoType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.NamedNodeMap;
import java.io.FileInputStream;
import java.io.StringReader;
import java.io.IOException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * MerchantPullPaymentResponseType Response data from the
 * merchant pull. 
 */
public class MerchantPullPaymentResponseType{


	/**
	 * information about the customer	 
	 */ 
	private PayerInfoType PayerInfo;

	/**
	 * Information about the transaction 	 
	 */ 
	private PaymentInfoType PaymentInfo;

	/**
	 * Specific information about the preapproved payment 	 
	 */ 
	private MerchantPullInfoType MerchantPullInfo;

	

	/**
	 * Default Constructor
	 */
	public MerchantPullPaymentResponseType (){
	}	

	/**
	 * Getter for PayerInfo
	 */
	 public PayerInfoType getPayerInfo() {
	 	return PayerInfo;
	 }
	 
	/**
	 * Setter for PayerInfo
	 */
	 public void setPayerInfo(PayerInfoType PayerInfo) {
	 	this.PayerInfo = PayerInfo;
	 }
	 
	/**
	 * Getter for PaymentInfo
	 */
	 public PaymentInfoType getPaymentInfo() {
	 	return PaymentInfo;
	 }
	 
	/**
	 * Setter for PaymentInfo
	 */
	 public void setPaymentInfo(PaymentInfoType PaymentInfo) {
	 	this.PaymentInfo = PaymentInfo;
	 }
	 
	/**
	 * Getter for MerchantPullInfo
	 */
	 public MerchantPullInfoType getMerchantPullInfo() {
	 	return MerchantPullInfo;
	 }
	 
	/**
	 * Setter for MerchantPullInfo
	 */
	 public void setMerchantPullInfo(MerchantPullInfoType MerchantPullInfo) {
	 	this.MerchantPullInfo = MerchantPullInfo;
	 }
	 


	private  boolean isWhitespaceNode(Node n) {
		if (n.getNodeType() == Node.TEXT_NODE) {
			String val = n.getNodeValue();
			return val.trim().length() == 0;
		} else {
			return false;
		}
	}
	
	private String convertToXML(Node n){
		String name = n.getNodeName();
		short type = n.getNodeType();
		if (Node.CDATA_SECTION_NODE == type) {
			return "<![CDATA[" + n.getNodeValue() + "]]&gt;";
		}
		if (name.startsWith("#")) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		sb.append("<").append(name);
		NamedNodeMap attrs = n.getAttributes();
		if (attrs != null) {
			for (int i = 0; i < attrs.getLength(); i++) {
				Node attr = attrs.item(i);
				sb.append(" ").append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
			}
		}
		String textContent = null;
		NodeList children = n.getChildNodes();
		if (children.getLength() == 0) {
			if (((textContent = n.getTextContent())) != null && (!"".equals(textContent))) {
				sb.append(textContent).append("</").append(name).append(">");
			} else {
				sb.append("/>");
			}
		} else {
			sb.append(">");
			boolean hasValidChildren = false;
			for (int i = 0; i < children.getLength(); i++) {
				String childToString = convertToXML(children.item(i));
				if (!"".equals(childToString)) {
					sb.append(childToString);
					hasValidChildren = true;
				}
			}
			if (!hasValidChildren && ((textContent = n.getTextContent()) != null)) {
				sb.append(textContent);
			}
			sb.append("</").append(name).append(">");
		}
		return sb.toString();
	}
	
	public MerchantPullPaymentResponseType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if(document.getElementsByTagName("PayerInfo").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PayerInfo").item(0))) {
				nodeList = document.getElementsByTagName("PayerInfo");
				xmlString = convertToXML(nodeList.item(0));
				this.PayerInfo =  new PayerInfoType(xmlString);
			}
		}
		if(document.getElementsByTagName("PaymentInfo").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("PaymentInfo").item(0))) {
				nodeList = document.getElementsByTagName("PaymentInfo");
				xmlString = convertToXML(nodeList.item(0));
				this.PaymentInfo =  new PaymentInfoType(xmlString);
			}
		}
		if(document.getElementsByTagName("MerchantPullInfo").getLength()!=0) {
			if(!isWhitespaceNode(document.getElementsByTagName("MerchantPullInfo").item(0))) {
				nodeList = document.getElementsByTagName("MerchantPullInfo");
				xmlString = convertToXML(nodeList.item(0));
				this.MerchantPullInfo =  new MerchantPullInfoType(xmlString);
			}
		}
	}

}