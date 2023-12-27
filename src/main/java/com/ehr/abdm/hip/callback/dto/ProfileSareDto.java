package com.ehr.abdm.hip.callback.dto;

import java.util.List;

public class ProfileSareDto {
	private String requestId;
	private String timestamp;
	private Intent intent;
	private Location location;
	private Profile profile;

	// Getters and setters for all fields

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

	public Intent getIntent() {
		return intent;
	}

	public void setIntent(Intent intent) {
		this.intent = intent;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	// toString method for debugging and logging

	@Override
	public String toString() {
		return "RequestData{" + "requestId='" + requestId + '\'' + ", timestamp='" + timestamp + '\'' + ", intent="
				+ intent + ", location=" + location + ", profile=" + profile + '}';
	}

	public static class Intent {
		private String type;

		// Constructors, getters, setters, and toString for Intent

		public Intent() {
		}

		public Intent(String type) {
			this.type = type;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		@Override
		public String toString() {
			return "Intent{" + "type='" + type + '\'' + '}';
		}
	}

	public static class Location {
		private String latitude;
		private String longitude;

		// Constructors, getters, setters, and toString for Location

		public Location() {
		}

		public Location(String latitude, String longitude) {
			this.latitude = latitude;
			this.longitude = longitude;
		}

		public String getLatitude() {
			return latitude;
		}

		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}

		public String getLongitude() {
			return longitude;
		}

		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}

		@Override
		public String toString() {
			return "Location{" + "latitude='" + latitude + '\'' + ", longitude='" + longitude + '\'' + '}';
		}
	}

	public static class Profile {
		private String hipCode;
		private Patient patient;

		// Constructors, getters, setters, and toString for Profile

		public Profile() {
		}

		public Profile(String hipCode, Patient patient) {
			this.hipCode = hipCode;
			this.patient = patient;
		}

		public String getHipCode() {
			return hipCode;
		}

		public void setHipCode(String hipCode) {
			this.hipCode = hipCode;
		}

		public Patient getPatient() {
			return patient;
		}

		public void setPatient(Patient patient) {
			this.patient = patient;
		}

		@Override
		public String toString() {
			return "Profile{" + "hipCode='" + hipCode + '\'' + ", patient=" + patient + '}';
		}
	}

	public static class Patient {
		private String healthId;
		private String healthIdNumber;
		private String name;
		private String gender;
		private Address address;
		private int yearOfBirth;
		private int dayOfBirth;
		private int monthOfBirth;
		private List<Identifier> identifiers;

		// Constructors, getters, setters, and toString for Patient

		public Patient() {
		}

		public Patient(String healthId, String healthIdNumber, String name, String gender, Address address,
				int yearOfBirth, int dayOfBirth, int monthOfBirth, List<Identifier> identifiers) {
			this.healthId = healthId;
			this.healthIdNumber = healthIdNumber;
			this.name = name;
			this.gender = gender;
			this.address = address;
			this.yearOfBirth = yearOfBirth;
			this.dayOfBirth = dayOfBirth;
			this.monthOfBirth = monthOfBirth;
			this.identifiers = identifiers;
		}

		public String getHealthId() {
			return healthId;
		}

		public void setHealthId(String healthId) {
			this.healthId = healthId;
		}

		public String getHealthIdNumber() {
			return healthIdNumber;
		}

		public void setHealthIdNumber(String healthIdNumber) {
			this.healthIdNumber = healthIdNumber;
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

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public int getYearOfBirth() {
			return yearOfBirth;
		}

		public void setYearOfBirth(int yearOfBirth) {
			this.yearOfBirth = yearOfBirth;
		}

		public int getDayOfBirth() {
			return dayOfBirth;
		}

		public void setDayOfBirth(int dayOfBirth) {
			this.dayOfBirth = dayOfBirth;
		}

		public int getMonthOfBirth() {
			return monthOfBirth;
		}

		public void setMonthOfBirth(int monthOfBirth) {
			this.monthOfBirth = monthOfBirth;
		}

		public List<Identifier> getIdentifiers() {
			return identifiers;
		}

		public void setIdentifiers(List<Identifier> identifiers) {
			this.identifiers = identifiers;
		}

		@Override
		public String toString() {
			return "Patient{" + "healthId='" + healthId + '\'' + ", healthIdNumber='" + healthIdNumber + '\''
					+ ", name='" + name + '\'' + ", gender='" + gender + '\'' + ", address=" + address
					+ ", yearOfBirth=" + yearOfBirth + ", dayOfBirth=" + dayOfBirth + ", monthOfBirth=" + monthOfBirth
					+ ", identifiers=" + identifiers + '}';
		}
	}

	public static class Address {
		private String line;
		private String district;
		private String state;
		private String pincode;

		// Constructors, getters, setters, and toString for Address

		public Address() {
		}

		public Address(String line, String district, String state, String pincode) {
			this.line = line;
			this.district = district;
			this.state = state;
			this.pincode = pincode;
		}

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

		// Constructors, getters, setters, and toString for Identifier

		public Identifier() {
		}

		public Identifier(String type, String value) {
			this.type = type;
			this.value = value;
		}

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
