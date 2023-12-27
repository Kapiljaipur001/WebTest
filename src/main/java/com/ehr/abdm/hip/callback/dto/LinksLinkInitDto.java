package com.ehr.abdm.hip.callback.dto;

import java.util.List;

public class LinksLinkInitDto {

	private String requestId;
	private String timestamp;
	private String transactionId;
	private Patient patient;

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

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "PatientRequest{" + "requestId='" + requestId + '\'' + ", timestamp='" + timestamp + '\''
				+ ", transactionId='" + transactionId + '\'' + ", patient=" + patient + '}';
	}

	public static class Patient {
		private String id;
		private String referenceNumber;
		private List<CareContext> careContexts;

		// Getter and setter methods

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getReferenceNumber() {
			return referenceNumber;
		}

		public void setReferenceNumber(String referenceNumber) {
			this.referenceNumber = referenceNumber;
		}

		public List<CareContext> getCareContexts() {
			return careContexts;
		}

		public void setCareContexts(List<CareContext> careContexts) {
			this.careContexts = careContexts;
		}

		@Override
		public String toString() {
			return "Patient{" + "id='" + id + '\'' + ", referenceNumber='" + referenceNumber + '\'' + ", careContexts="
					+ careContexts + '}';
		}
	}

	public static class CareContext {
		private String referenceNumber;

		// Getter and setter methods

		public String getReferenceNumber() {
			return referenceNumber;
		}

		public void setReferenceNumber(String referenceNumber) {
			this.referenceNumber = referenceNumber;
		}

		@Override
		public String toString() {
			return "CareContext{" + "referenceNumber='" + referenceNumber + '\'' + '}';
		}
	}

}
