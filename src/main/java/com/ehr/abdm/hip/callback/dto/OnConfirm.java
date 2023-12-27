package com.ehr.abdm.hip.callback.dto;

import java.util.ArrayList;

public class OnConfirm {

	private String requestId;
	private String timestamp;
	private Auth auth;
	private Error error;
	private Resp resp;

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

	public Auth getAuth() {
		return auth;
	}

	public void setAuth(Auth auth) {
		this.auth = auth;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	public Resp getResp() {
		return resp;
	}

	public void setResp(Resp resp) {
		this.resp = resp;
	}

	@Override
	public String toString() {
		return "OnConfirm [requestId=" + requestId + ", timestamp=" + timestamp + ", auth=" + auth + ", error=" + error
				+ ", resp=" + resp + ", getRequestId()=" + getRequestId() + ", getTimestamp()=" + getTimestamp()
				+ ", getAuth()=" + getAuth() + ", getError()=" + getError() + ", getResp()=" + getResp()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
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
			return "Address [line=" + line + ", district=" + district + ", state=" + state + ", pincode=" + pincode
					+ ", getLine()=" + getLine() + ", getDistrict()=" + getDistrict() + ", getState()=" + getState()
					+ ", getPincode()=" + getPincode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}
	}

	public static class Auth {
		private String accessToken;
		private Validity validity;
		private Patient patient;

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
			return "Auth [accessToken=" + accessToken + ", validity=" + validity + ", patient=" + patient
					+ ", getAccessToken()=" + getAccessToken() + ", getValidity()=" + getValidity() + ", getPatient()="
					+ getPatient() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
	}

	public static class Error {
		private int code;
		private String message;

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		@Override
		public String toString() {
			return "Error [code=" + code + ", message=" + message + ", getCode()=" + getCode() + ", getMessage()="
					+ getMessage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
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
			return "Identifier [type=" + type + ", value=" + value + ", getType()=" + getType() + ", getValue()="
					+ getValue() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
	}

	public static class Patient {
		private String id;
		private String name;
		private String gender;
		private int yearOfBirth;
		private Address address;
		private ArrayList<Identifier> identifiers;

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

		public ArrayList<Identifier> getIdentifiers() {
			return identifiers;
		}

		public void setIdentifiers(ArrayList<Identifier> identifiers) {
			this.identifiers = identifiers;
		}

		@Override
		public String toString() {
			return "Patient [id=" + id + ", name=" + name + ", gender=" + gender + ", yearOfBirth=" + yearOfBirth
					+ ", address=" + address + ", identifiers=" + identifiers + ", getId()=" + getId() + ", getName()="
					+ getName() + ", getGender()=" + getGender() + ", getYearOfBirth()=" + getYearOfBirth()
					+ ", getAddress()=" + getAddress() + ", getIdentifiers()=" + getIdentifiers() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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
			return "Requester [type=" + type + ", id=" + id + ", getType()=" + getType() + ", getId()=" + getId()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
	}

	public static class Resp {
		private String requestId;

		public String getRequestId() {
			return requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		@Override
		public String toString() {
			return "Resp [requestId=" + requestId + ", getRequestId()=" + getRequestId() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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
			return "Validity [purpose=" + purpose + ", requester=" + requester + ", expiry=" + expiry + ", limit="
					+ limit + ", getPurpose()=" + getPurpose() + ", getRequester()=" + getRequester() + ", getExpiry()="
					+ getExpiry() + ", getLimit()=" + getLimit() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}
	}

}
