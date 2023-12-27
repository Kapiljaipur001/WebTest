package com.ehr.abdm.hip.callback.dto;

import java.util.List;

public class CareContextsDiscoverDto {

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
		return "PatientInfo{" + "requestId='" + requestId + '\'' + ", timestamp='" + timestamp + '\''
				+ ", transactionId='" + transactionId + '\'' + ", patient=" + patient + '}';
	}

	public static class Patient {
		private String id;
		private List<Identifier> verifiedIdentifiers;
		private List<Identifier> unverifiedIdentifiers;
		private String name;
		private String gender;
		private int yearOfBirth;

		// Getter and setter methods

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<Identifier> getVerifiedIdentifiers() {
			return verifiedIdentifiers;
		}

		public void setVerifiedIdentifiers(List<Identifier> verifiedIdentifiers) {
			this.verifiedIdentifiers = verifiedIdentifiers;
		}

		public List<Identifier> getUnverifiedIdentifiers() {
			return unverifiedIdentifiers;
		}

		public void setUnverifiedIdentifiers(List<Identifier> unverifiedIdentifiers) {
			this.unverifiedIdentifiers = unverifiedIdentifiers;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public int getYearOfBirth() {
			return yearOfBirth;
		}

		public void setYearOfBirth(int yearOfBirth) {
			this.yearOfBirth = yearOfBirth;
		}

		@Override
		public String toString() {
			return "Patient{" + "id='" + id + '\'' + ", verifiedIdentifiers=" + verifiedIdentifiers
					+ ", unverifiedIdentifiers=" + unverifiedIdentifiers + ", name='" + name + '\'' + ", gender='"
					+ gender + '\'' + ", yearOfBirth=" + yearOfBirth + '}';
		}
	}

	public static class Identifier {
		private String type;
		private String value;

		// Getter and setter methods

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "Identifier{" + "type='" + type + '\'' + ", value='" + value + '\'' + '}';
		}
	}

}
