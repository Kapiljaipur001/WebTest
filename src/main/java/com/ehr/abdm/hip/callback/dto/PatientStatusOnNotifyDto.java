package com.ehr.abdm.hip.callback.dto;

public class PatientStatusOnNotifyDto {
	private String requestId;
	private String timestamp;
	private Acknowledgment acknowledgment;
	private ErrorData error;
	private Resp resp;

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

	public Acknowledgment getAcknowledgment() {
		return acknowledgment;
	}

	public void setAcknowledgment(Acknowledgment acknowledgment) {
		this.acknowledgment = acknowledgment;
	}

	public ErrorData getError() {
		return error;
	}

	public void setError(ErrorData error) {
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
		return "ResponseData{" + "requestId='" + requestId + '\'' + ", timestamp='" + timestamp + '\''
				+ ", acknowledgment=" + acknowledgment + ", error=" + error + ", resp=" + resp + '}';
	}

	public static class Acknowledgment {
		private String status;

		// Getter and setter methods

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "Acknowledgment{" + "status='" + status + '\'' + '}';
		}
	}

	public static class ErrorData {
		private int code;
		private String message;

		// Getter and setter methods

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
			return "ErrorData{" + "code=" + code + ", message='" + message + '\'' + '}';
		}
	}

	public static class Resp {
		private String requestId;

		// Getter and setter methods

		public String getRequestId() {
			return requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		@Override
		public String toString() {
			return "Resp{" + "requestId='" + requestId + '\'' + '}';
		}
	}
}
