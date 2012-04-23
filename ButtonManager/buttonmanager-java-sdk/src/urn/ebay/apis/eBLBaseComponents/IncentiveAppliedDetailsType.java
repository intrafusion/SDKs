
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;


/**
 * Details of incentive application on individual bucket/item.  
 */
public class IncentiveAppliedDetailsType {

	/**
	 * PaymentRequestID uniquely identifies a bucket. It is the "bucket id" in the world of EC API.
	 */
	private String PaymentRequestID;
	public String getPaymentRequestID() {
		return PaymentRequestID;
	}
	public void setPaymentRequestID(String value) {
		this.PaymentRequestID = value;
	}

	/**
	 * The item id passed through by the merchant. 
	 */
	private String ItemId;
	public String getItemId() {
		return ItemId;
	}
	public void setItemId(String value) {
		this.ItemId = value;
	}

	/**
	 * The item transaction id passed through by the merchant. 
	 */
	private String ExternalTxnId;
	public String getExternalTxnId() {
		return ExternalTxnId;
	}
	public void setExternalTxnId(String value) {
		this.ExternalTxnId = value;
	}

	/**
	 * Discount offerred for this bucket or item. 
	 */
	private BasicAmountType DiscountAmount;
	public BasicAmountType getDiscountAmount() {
		return DiscountAmount;
	}
	public void setDiscountAmount(BasicAmountType value) {
		this.DiscountAmount = value;
	}

	/**
	 * SubType for coupon. 
	 */
	private String SubType;
	public String getSubType() {
		return SubType;
	}
	public void setSubType(String value) {
		this.SubType = value;
	}


	public IncentiveAppliedDetailsType() {
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
		 sb.append('<').append(name);
		 NamedNodeMap attrs = n.getAttributes();
		 if (attrs != null) { 
		  for (int i = 0; i < attrs.getLength(); i++) { 
			    Node attr = attrs.item(i);
			    sb.append(' ').append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
		  }
		 } 
		 String textContent = null; 
		 NodeList children = n.getChildNodes(); 
		 if (children.getLength() == 0) { 
		  if ((textContent = n.getTextContent()) != null && !"".equals(textContent)) {
		    sb.append(textContent).append("</").append(name).append('>'); 
		  } else { 
		    sb.append("/>"); 
		  } 
		 } else { 
		  sb.append('>'); 
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
		  sb.append("</").append(name).append('>');
		 }
		 return sb.toString();
	 } 
	 public IncentiveAppliedDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("PaymentRequestID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentRequestID").item(0))){ 
		 this.PaymentRequestID =(String)document.getElementsByTagName("PaymentRequestID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ItemId").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ItemId").item(0))){ 
		 this.ItemId =(String)document.getElementsByTagName("ItemId").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ExternalTxnId").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ExternalTxnId").item(0))){ 
		 this.ExternalTxnId =(String)document.getElementsByTagName("ExternalTxnId").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("DiscountAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("DiscountAmount").item(0))){ 
		 nodeList = document.getElementsByTagName("DiscountAmount");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.DiscountAmount =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("SubType").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("SubType").item(0))){ 
		 this.SubType =(String)document.getElementsByTagName("SubType").item(0).getTextContent();

}
	}
	}
}