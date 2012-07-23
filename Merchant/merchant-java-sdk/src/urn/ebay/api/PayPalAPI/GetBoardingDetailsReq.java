package urn.ebay.api.PayPalAPI;
import urn.ebay.api.PayPalAPI.GetBoardingDetailsRequestType;

/**
 * No Document Comments
 */
public class GetBoardingDetailsReq{


	/**
	 * No Document Comments	 
	 */ 
	private GetBoardingDetailsRequestType GetBoardingDetailsRequest;

	

	/**
	 * Default Constructor
	 */
	public GetBoardingDetailsReq (){
	}	

	/**
	 * Getter for GetBoardingDetailsRequest
	 */
	 public GetBoardingDetailsRequestType getGetBoardingDetailsRequest() {
	 	return GetBoardingDetailsRequest;
	 }
	 
	/**
	 * Setter for GetBoardingDetailsRequest
	 */
	 public void setGetBoardingDetailsRequest(GetBoardingDetailsRequestType GetBoardingDetailsRequest) {
	 	this.GetBoardingDetailsRequest = GetBoardingDetailsRequest;
	 }
	 


	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<urn:GetBoardingDetailsReq>");
		if(GetBoardingDetailsRequest != null) {
			sb.append("<urn:GetBoardingDetailsRequest>");
			sb.append(GetBoardingDetailsRequest.toXMLString());
			sb.append("</urn:GetBoardingDetailsRequest>");
		}
		sb.append("</urn:GetBoardingDetailsReq>");
		return sb.toString();
	}

}