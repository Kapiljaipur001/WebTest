package com.ehr.abdm.hip.callback.dto;

import java.util.List;

public class AuthNotifyDto {
	private String transactionId;
	private Status status;
	private String accessToken;
	private Validity validity;
	private Patient patient;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Validity getValidity() {
		return validity;
	}

	public void setValidity(Validity validity) {
		this.validity = validity;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "AuthResponse{" + "transactionId='" + transactionId + '\'' + ", status=" + status + ", accessToken='"
				+ accessToken + '\'' + ", validity=" + validity + ", patient=" + patient + '}';
	}

	public static class Status {
		private String transactionId;
		private String status;

		public String getTransactionId() {
			return transactionId;
		}

		public void setTransactionId(String transactionId) {
			this.transactionId = transactionId;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "Status{" + "transactionId='" + transactionId + '\'' + ", status='" + status + '\'' + '}';
		}
	}

	public static class Validity {
		private String purpose;
		private Requester requester;
		private String expiry;
		private String limit;

		public String getPurpose() {
			return purpose;
		}

		public void setPurpose(String purpose) {
			this.purpose = purpose;
		}

		public Requester getRequester() {
			return requester;
		}

		public void setRequester(Requester requester) {
			this.requester = requester;
		}

		public String getExpiry() {
			return expiry;
		}

		public void setExpiry(String expiry) {
			this.expiry = expiry;
		}

		public String getLimit() {
			return limit;
		}

		public void setLimit(String limit) {
			this.limit = limit;
		}

		@Override
		public String toString() {
			return "Validity{" + "purpose='" + purpose + '\'' + ", requester=" + requester + ", expiry='" + expiry
					+ '\'' + ", limit='" + limit + '\'' + '}';
		}
	}

	public static class Requester {
		private String type;
		private int id;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "Requester{" + "type='" + type + '\'' + ", id=" + id + '}';
		}
	}

	public static class Patient {
		private String id;
		private String name;
		private String gender;
		private int yearOfBirth;
		private Address address;
		private List<Identifier> identifiers;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
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

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public List<Identifier> getIdentifiers() {
			return identifiers;
		}

		public void setIdentifiers(List<Identifier> identifiers) {
			this.identifiers = identifiers;
		}

		@Override
		public String toString() {
			return "Patient{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", gender='" + gender + '\''
					+ ", yearOfBirth=" + yearOfBirth + ", address=" + address + ", identifiers=" + identifiers + '}';
		}
	}

	public static class Address {
		private String line;
		private String district;
		private String state;
		private String pincode;

		public String getLine() {
			return line;
		}

		public void setLine(String line) {
			this.line = line;
		}

		public String getDistrict() {
			return district;
		}

		public void setDistrict(String district) {
			this.district = district;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getPincode() {
			return pincode;
		}

		public void setPincode(String pincode) {
			this.pincode = pincode;
		}

		@Override
		public String toString() {
			return "Address{" + "line='" + line + '\'' + ", district='" + district + '\'' + ", state='" + state + '\''
					+ ", pincode='" + pincode + '\'' + '}';
		}
	}

	public static class Identifier {
		private String type;
		private String value;

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
