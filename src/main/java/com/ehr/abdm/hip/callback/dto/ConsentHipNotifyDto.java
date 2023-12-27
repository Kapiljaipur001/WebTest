package com.ehr.abdm.hip.callback.dto;

import java.util.List;

public class ConsentHipNotifyDto {
	private String requestId;
	private String timestamp;
	private Notification notification;

	// Getter and Setter methods

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

	public Notification getNotification() {
		return notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

	@Override
	public String toString() {
		return "ConsentNotification{" + "requestId='" + requestId + '\'' + ", timestamp='" + timestamp + '\''
				+ ", notification=" + notification + '}';
	}

	public static class Notification {
		private String status;
		private String consentId;
		private ConsentDetail consentDetail;
		private String signature;
		private boolean grantAcknowledgement;

		// Getter and Setter methods

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getConsentId() {
			return consentId;
		}

		public void setConsentId(String consentId) {
			this.consentId = consentId;
		}

		public ConsentDetail getConsentDetail() {
			return consentDetail;
		}

		public void setConsentDetail(ConsentDetail consentDetail) {
			this.consentDetail = consentDetail;
		}

		public String getSignature() {
			return signature;
		}

		public void setSignature(String signature) {
			this.signature = signature;
		}

		public boolean isGrantAcknowledgement() {
			return grantAcknowledgement;
		}

		public void setGrantAcknowledgement(boolean grantAcknowledgement) {
			this.grantAcknowledgement = grantAcknowledgement;
		}

		@Override
		public String toString() {
			return "Notification{" + "status='" + status + '\'' + ", consentId='" + consentId + '\''
					+ ", consentDetail=" + consentDetail + ", signature='" + signature + '\''
					+ ", grantAcknowledgement=" + grantAcknowledgement + '}';
		}
	}

	public static class ConsentDetail {
		private String schemaVersion;
		private String consentId;
		private String createdAt;
		private Patient patient;
		private List<CareContext> careContexts;
		private Purpose purpose;
		private Hip hip;
		private ConsentManager consentManager;
		private List<String> hiTypes;
		private Permission permission;

		// Getter and Setter methods

		public String getSchemaVersion() {
			return schemaVersion;
		}

		public void setSchemaVersion(String schemaVersion) {
			this.schemaVersion = schemaVersion;
		}

		public String getConsentId() {
			return consentId;
		}

		public void setConsentId(String consentId) {
			this.consentId = consentId;
		}

		public String getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public Patient getPatient() {
			return patient;
		}

		public void setPatient(Patient patient) {
			this.patient = patient;
		}

		public List<CareContext> getCareContexts() {
			return careContexts;
		}

		public void setCareContexts(List<CareContext> careContexts) {
			this.careContexts = careContexts;
		}

		public Purpose getPurpose() {
			return purpose;
		}

		public void setPurpose(Purpose purpose) {
			this.purpose = purpose;
		}

		public Hip getHip() {
			return hip;
		}

		public void setHip(Hip hip) {
			this.hip = hip;
		}

		public ConsentManager getConsentManager() {
			return consentManager;
		}

		public void setConsentManager(ConsentManager consentManager) {
			this.consentManager = consentManager;
		}

		public List<String> getHiTypes() {
			return hiTypes;
		}

		public void setHiTypes(List<String> hiTypes) {
			this.hiTypes = hiTypes;
		}

		public Permission getPermission() {
			return permission;
		}

		public void setPermission(Permission permission) {
			this.permission = permission;
		}

		@Override
		public String toString() {
			return "ConsentDetail{" + "schemaVersion='" + schemaVersion + '\'' + ", consentId='" + consentId + '\''
					+ ", createdAt='" + createdAt + '\'' + ", patient=" + patient + ", careContexts=" + careContexts
					+ ", purpose=" + purpose + ", hip=" + hip + ", consentManager=" + consentManager + ", hiTypes="
					+ hiTypes + ", permission=" + permission + '}';
		}
	}

	public static class Patient {
		private String id;

		// Getter and Setter methods

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "Patient{" + "id='" + id + '\'' + '}';
		}
	}

	public static class CareContext {
		private String patientReference;
		private String careContextReference;

		// Getter and Setter methods

		public String getPatientReference() {
			return patientReference;
		}

		public void setPatientReference(String patientReference) {
			this.patientReference = patientReference;
		}

		public String getCareContextReference() {
			return careContextReference;
		}

		public void setCareContextReference(String careContextReference) {
			this.careContextReference = careContextReference;
		}

		@Override
		public String toString() {
			return "CareContext{" + "patientReference='" + patientReference + '\'' + ", careContextReference='"
					+ careContextReference + '\'' + '}';
		}
	}

	public static class Purpose {
		private String text;
		private String code;
		private String refUri;

		// Getter and Setter methods

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getRefUri() {
			return refUri;
		}

		public void setRefUri(String refUri) {
			this.refUri = refUri;
		}

		@Override
		public String toString() {
			return "Purpose{" + "text='" + text + '\'' + ", code='" + code + '\'' + ", refUri='" + refUri + '\'' + '}';
		}
	}

	public static class Hip {
		private String id;
		private String name;

		// Getter and Setter methods

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

		@Override
		public String toString() {
			return "Hip{" + "id='" + id + '\'' + ", name='" + name + '\'' + '}';
		}
	}

	public static class ConsentManager {
		private String id;

		// Getter and Setter methods

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "ConsentManager{" + "id='" + id + '\'' + '}';
		}
	}

	public static class Permission {
		private String accessMode;
		private DateRange dateRange;
		private String dataEraseAt;
		private Frequency frequency;

		// Getter and Setter methods

		public String getAccessMode() {
			return accessMode;
		}

		public void setAccessMode(String accessMode) {
			this.accessMode = accessMode;
		}

		public DateRange getDateRange() {
			return dateRange;
		}

		public void setDateRange(DateRange dateRange) {
			this.dateRange = dateRange;
		}

		public String getDataEraseAt() {
			return dataEraseAt;
		}

		public void setDataEraseAt(String dataEraseAt) {
			this.dataEraseAt = dataEraseAt;
		}

		public Frequency getFrequency() {
			return frequency;
		}

		public void setFrequency(Frequency frequency) {
			this.frequency = frequency;
		}

		@Override
		public String toString() {
			return "Permission{" + "accessMode='" + accessMode + '\'' + ", dateRange=" + dateRange + ", dataEraseAt='"
					+ dataEraseAt + '\'' + ", frequency=" + frequency + '}';
		}
	}

	public static class DateRange {
		private String from;
		private String to;

		// Getter and Setter methods

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

	public static class Frequency {
		private String unit;
		private int value;
		private int repeats;

		// Getter and Setter methods

		public String getUnit() {
			return unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public int getRepeats() {
			return repeats;
		}

		public void setRepeats(int repeats) {
			this.repeats = repeats;
		}

		@Override
		public String toString() {
			return "Frequency{" + "unit='" + unit + '\'' + ", value=" + value + ", repeats=" + repeats + '}';
		}
	}
}
