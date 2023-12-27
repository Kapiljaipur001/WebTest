package com.ehr.abdm.hip.callback.dto;

public class HealthInformationHipRequestDto {
	private String requestId;
	private String timestamp;
	private String transactionId;
	private Consent consent;
	private DateRange dateRange;
	private String dataPushUrl;
	private KeyMaterial keyMaterial;

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

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Consent getConsent() {
		return consent;
	}

	public void setConsent(Consent consent) {
		this.consent = consent;
	}

	public DateRange getDateRange() {
		return dateRange;
	}

	public void setDateRange(DateRange dateRange) {
		this.dateRange = dateRange;
	}

	public String getDataPushUrl() {
		return dataPushUrl;
	}

	public void setDataPushUrl(String dataPushUrl) {
		this.dataPushUrl = dataPushUrl;
	}

	public KeyMaterial getKeyMaterial() {
		return keyMaterial;
	}

	public void setKeyMaterial(KeyMaterial keyMaterial) {
		this.keyMaterial = keyMaterial;
	}

	// toString method for debugging and logging

	@Override
	public String toString() {
		return "HiRequest{" + "requestId='" + requestId + '\'' + ", timestamp='" + timestamp + '\''
				+ ", transactionId='" + transactionId + '\'' + ", consent=" + consent + ", dateRange=" + dateRange
				+ ", dataPushUrl='" + dataPushUrl + '\'' + ", keyMaterial=" + keyMaterial + '}';
	}

	// Inner classes representing nested structures

	public static class Consent {
		private String id;

		// Constructors, getters, setters, and toString for Consent

		public Consent() {
		}

		public Consent(String id) {
			this.id = id;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "Consent{" + "id='" + id + '\'' + '}';
		}
	}

	public static class DateRange {
		private String from;
		private String to;

		// Constructors, getters, setters, and toString for DateRange

		public DateRange() {
		}

		public DateRange(String from, String to) {
			this.from = from;
			this.to = to;
		}

		public String getFrom() {
			return from;
		}

		public void setFrom(String from) {
			this.from = from;
		}

		public String getTo() {
			return to;
		}

		public void setTo(String to) {
			this.to = to;
		}

		@Override
		public String toString() {
			return "DateRange{" + "from='" + from + '\'' + ", to='" + to + '\'' + '}';
		}
	}

	public static class KeyMaterial {
		private String cryptoAlg;
		private String curve;
		private DHPublicKey dhPublicKey;
		private String nonce;

		// Constructors, getters, setters, and toString for KeyMaterial

		public KeyMaterial() {
		}

		public KeyMaterial(String cryptoAlg, String curve, DHPublicKey dhPublicKey, String nonce) {
			this.cryptoAlg = cryptoAlg;
			this.curve = curve;
			this.dhPublicKey = dhPublicKey;
			this.nonce = nonce;
		}

		public String getCryptoAlg() {
			return cryptoAlg;
		}

		public void setCryptoAlg(String cryptoAlg) {
			this.cryptoAlg = cryptoAlg;
		}

		public String getCurve() {
			return curve;
		}

		public void setCurve(String curve) {
			this.curve = curve;
		}

		public DHPublicKey getDhPublicKey() {
			return dhPublicKey;
		}

		public void setDhPublicKey(DHPublicKey dhPublicKey) {
			this.dhPublicKey = dhPublicKey;
		}

		public String getNonce() {
			return nonce;
		}

		public void setNonce(String nonce) {
			this.nonce = nonce;
		}

		@Override
		public String toString() {
			return "KeyMaterial{" + "cryptoAlg='" + cryptoAlg + '\'' + ", curve='" + curve + '\'' + ", dhPublicKey="
					+ dhPublicKey + ", nonce='" + nonce + '\'' + '}';
		}
	}

	public static class DHPublicKey {
		private String expiry;
		private String parameters;
		private String keyValue;

		// Constructors, getters, setters, and toString for DHPublicKey

		public DHPublicKey() {
		}

		public DHPublicKey(String expiry, String parameters, String keyValue) {
			this.expiry = expiry;
			this.parameters = parameters;
			this.keyValue = keyValue;
		}

		public String getExpiry() {
			return expiry;
		}

		public void setExpiry(String expiry) {
			this.expiry = expiry;
		}

		public String getParameters() {
			return parameters;
		}

		public void setParameters(String parameters) {
			this.parameters = parameters;
		}

		public String getKeyValue() {
			return keyValue;
		}

		public void setKeyValue(String keyValue) {
			this.keyValue = keyValue;
		}

		@Override
		public String toString() {
			return "DHPublicKey{" + "expiry='" + expiry + '\'' + ", parameters='" + parameters + '\'' + ", keyValue='"
					+ keyValue + '\'' + '}';
		}
	}
}
