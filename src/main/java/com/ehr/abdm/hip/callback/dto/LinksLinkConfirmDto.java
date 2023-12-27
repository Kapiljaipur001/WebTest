package com.ehr.abdm.hip.callback.dto;

public class LinksLinkConfirmDto {
	private String requestId;
	private String timestamp;
	private Confirmation confirmation;

	// Getter and setter methods

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Confirmation getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(Confirmation confirmation) {
		this.confirmation = confirmation;
	}

	@Override
	public String toString() {
		return "ConfirmationRequest{" + "requestId='" + requestId + '\'' + ", timestamp='" + timestamp + '\''
				+ ", confirmation=" + confirmation + '}';
	}

	public static class Confirmation {
		private String linkRefNumber;
		private String token;

		// Getter and setter methods

		public String getLinkRefNumber() {
			return linkRefNumber;
		}

		public void setLinkRefNumber(String linkRefNumber) {
			this.linkRefNumber = linkRefNumber;
		}

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		@Override
		public String toString() {
			return "Confirmation{" + "linkRefNumber='" + linkRefNumber + '\'' + ", token='" + token + '\'' + '}';
		}
	}

}
