package com.ehr.abdm.hip.callback.dto;

public class LinksContextOnOntifyDto {
	private String requestId;
	private String timestamp;
	private Acknowledgement acknowledgement;
	private ErrorDetails error;
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

	public Acknowledgement getAcknowledgement() {
		return acknowledgement;
	}

	public void setAcknowledgement(Acknowledgement acknowledgement) {
		this.acknowledgement = acknowledgement;
	}

	public ErrorDetails getError() {
		return error;
	}

	public void setError(ErrorDetails error) {
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
		return "ApiResponse{" + "requestId='" + requestId + '\'' + ", timestamp='" + timestamp + '\''
				+ ", acknowledgement=" + acknowledgement + ", error=" + error + ", resp=" + resp + '}';
	}

	public static class Acknowledgement {
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
			return "Acknowledgement{" + "status='" + status + '\'' + '}';
		}
	}

	public static class ErrorDetails {
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
			return "ErrorDetails{" + "code=" + code + ", message='" + message + '\'' + '}';
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
