package urn.ebay.api.PayPalAPI;
import urn.ebay.apis.eBLBaseComponents.RefundType;
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.RefundSourceCodeType;
import urn.ebay.apis.eBLBaseComponents.MerchantStoreDetailsType;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.InvoiceItemType;
import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

/**
 * Unique identifier of the transaction you are refunding.
 * Required Character length and limitations: 17 single-byte
 * alphanumeric characters 
 */
public class RefundTransactionRequestType extends AbstractRequestType {


	/**
	 * Unique identifier of the transaction you are refunding.
	 * Required Character length and limitations: 17 single-byte
	 * alphanumeric characters 	 
	 */ 
	private String TransactionID;

	/**
	 * Invoice number corresponding to transaction details for
	 * tracking the refund of a payment. This parameter is passed
	 * by the merchant or recipient while refunding the
	 * transaction. This parameter does not affect the business
	 * logic, it is persisted in the DB for transaction reference
	 * Optional 	 
	 */ 
	private String InvoiceID;

	/**
	 * Type of refund you are making Required 	 
	 */ 
	private RefundType RefundType;

	/**
	 * Refund amount. Amount is required if RefundType is Partial.
	 * NOTE: If RefundType is Full, do not set Amount.	 
	 */ 
	private BasicAmountType Amount;

	/**
	 * Custom memo about the refund. Optional Character length and
	 * limitations: 255 single-byte alphanumeric characters	 
	 */ 
	private String Memo;

	/**
	 * The maximum time till which refund must be tried. Optional 	 
	 */ 
	private String RetryUntil;

	/**
	 * The type of funding source for refund. Optional 	 
	 */ 
	private RefundSourceCodeType RefundSource;

	/**
	 * Flag to indicate that the customer was already given store
	 * credit for a given transaction. This will allow us to make
	 * sure we do not double refund. Optional 	 
	 */ 
	private Boolean RefundAdvice;

	/**
	 * To pass the Merchant store informationOptional 	 
	 */ 
	private MerchantStoreDetailsType MerchantStoreDetails;

	/**
	 * Information about the individual details of the items to be
	 * refunded.Optional 	 
	 */ 
	private List<InvoiceItemType> RefundItemDetails = new ArrayList<InvoiceItemType>();

	/**
	 * Unique id for each API request to prevent duplicate
	 * payments. Optional Character length and limits: 38
	 * single-byte characters maximum. 	 
	 */ 
	private String MsgSubID;

	

	/**
	 * Default Constructor
	 */
	public RefundTransactionRequestType (){
	}	

	/**
	 * Getter for TransactionID
	 */
	 public String getTransactionID() {
	 	return TransactionID;
	 }
	 
	/**
	 * Setter for TransactionID
	 */
	 public void setTransactionID(String TransactionID) {
	 	this.TransactionID = TransactionID;
	 }
	 
	/**
	 * Getter for InvoiceID
	 */
	 public String getInvoiceID() {
	 	return InvoiceID;
	 }
	 
	/**
	 * Setter for InvoiceID
	 */
	 public void setInvoiceID(String InvoiceID) {
	 	this.InvoiceID = InvoiceID;
	 }
	 
	/**
	 * Getter for RefundType
	 */
	 public RefundType getRefundType() {
	 	return RefundType;
	 }
	 
	/**
	 * Setter for RefundType
	 */
	 public void setRefundType(RefundType RefundType) {
	 	this.RefundType = RefundType;
	 }
	 
	/**
	 * Getter for Amount
	 */
	 public BasicAmountType getAmount() {
	 	return Amount;
	 }
	 
	/**
	 * Setter for Amount
	 */
	 public void setAmount(BasicAmountType Amount) {
	 	this.Amount = Amount;
	 }
	 
	/**
	 * Getter for Memo
	 */
	 public String getMemo() {
	 	return Memo;
	 }
	 
	/**
	 * Setter for Memo
	 */
	 public void setMemo(String Memo) {
	 	this.Memo = Memo;
	 }
	 
	/**
	 * Getter for RetryUntil
	 */
	 public String getRetryUntil() {
	 	return RetryUntil;
	 }
	 
	/**
	 * Setter for RetryUntil
	 */
	 public void setRetryUntil(String RetryUntil) {
	 	this.RetryUntil = RetryUntil;
	 }
	 
	/**
	 * Getter for RefundSource
	 */
	 public RefundSourceCodeType getRefundSource() {
	 	return RefundSource;
	 }
	 
	/**
	 * Setter for RefundSource
	 */
	 public void setRefundSource(RefundSourceCodeType RefundSource) {
	 	this.RefundSource = RefundSource;
	 }
	 
	/**
	 * Getter for RefundAdvice
	 */
	 public Boolean getRefundAdvice() {
	 	return RefundAdvice;
	 }
	 
	/**
	 * Setter for RefundAdvice
	 */
	 public void setRefundAdvice(Boolean RefundAdvice) {
	 	this.RefundAdvice = RefundAdvice;
	 }
	 
	/**
	 * Getter for MerchantStoreDetails
	 */
	 public MerchantStoreDetailsType getMerchantStoreDetails() {
	 	return MerchantStoreDetails;
	 }
	 
	/**
	 * Setter for MerchantStoreDetails
	 */
	 public void setMerchantStoreDetails(MerchantStoreDetailsType MerchantStoreDetails) {
	 	this.MerchantStoreDetails = MerchantStoreDetails;
	 }
	 
	/**
	 * Getter for RefundItemDetails
	 */
	 public List<InvoiceItemType> getRefundItemDetails() {
	 	return RefundItemDetails;
	 }
	 
	/**
	 * Setter for RefundItemDetails
	 */
	 public void setRefundItemDetails(List<InvoiceItemType> RefundItemDetails) {
	 	this.RefundItemDetails = RefundItemDetails;
	 }
	 
	/**
	 * Getter for MsgSubID
	 */
	 public String getMsgSubID() {
	 	return MsgSubID;
	 }
	 
	/**
	 * Setter for MsgSubID
	 */
	 public void setMsgSubID(String MsgSubID) {
	 	this.MsgSubID = MsgSubID;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toXMLString());
		if(TransactionID != null) {
			sb.append("<urn:TransactionID>").append(TransactionID);
			sb.append("</urn:TransactionID>");
		}
		if(InvoiceID != null) {
			sb.append("<urn:InvoiceID>").append(InvoiceID);
			sb.append("</urn:InvoiceID>");
		}
		if(RefundType != null) {
			sb.append("<urn:RefundType>").append(RefundType.getValue());
			sb.append("</urn:RefundType>");
		}
		if(Amount != null) {
			sb.append("<urn:Amount");
			sb.append(Amount.toXMLString());
			sb.append("</urn:Amount>");
		}
		if(Memo != null) {
			sb.append("<urn:Memo>").append(Memo);
			sb.append("</urn:Memo>");
		}
		if(RetryUntil != null) {
			sb.append("<urn:RetryUntil>").append(RetryUntil);
			sb.append("</urn:RetryUntil>");
		}
		if(RefundSource != null) {
			sb.append("<urn:RefundSource>").append(RefundSource.getValue());
			sb.append("</urn:RefundSource>");
		}
		if(RefundAdvice != null) {
			sb.append("<urn:RefundAdvice>").append(RefundAdvice);
			sb.append("</urn:RefundAdvice>");
		}
		if(MerchantStoreDetails != null) {
			sb.append("<ebl:MerchantStoreDetails>");
			sb.append(MerchantStoreDetails.toXMLString());
			sb.append("</ebl:MerchantStoreDetails>");
		}
		if(RefundItemDetails != null) {
			for(int i=0; i < RefundItemDetails.size(); i++) {
				sb.append("<ebl:RefundItemDetails>");
				sb.append(RefundItemDetails.get(i).toXMLString());
				sb.append("</ebl:RefundItemDetails>");
			}
		}
		if(MsgSubID != null) {
			sb.append("<urn:MsgSubID>").append(MsgSubID);
			sb.append("</urn:MsgSubID>");
		}
		return sb.toString();
	}

}