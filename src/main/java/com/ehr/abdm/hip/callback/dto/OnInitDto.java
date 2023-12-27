package com.ehr.abdm.hip.callback.dto;

public class OnInitDto {
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
		return "OnInitDto [requestId=" + requestId + ", timestamp=" + timestamp + ", auth=" + auth + ", error=" + error
				+ ", resp=" + resp + ", getRequestId()=" + getRequestId() + ", getTimestamp()=" + getTimestamp()
				+ ", getAuth()=" + getAuth() + ", getError()=" + getError() + ", getResp()=" + getResp()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public static class Auth {
		private String transactionId;
		private String mode;
		private Meta meta;

		public String getTransactionId() {
			return transactionId;
		}

		public void setTransactionId(String transactionId) {
			this.transactionId = transactionId;
		}

		public String getMode() {
			return mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public Meta getMeta() {
			return meta;
		}

		public void setMeta(Meta meta) {
			this.meta = meta;
		}

		@Override
		public String toString() {
			return "Auth [transactionId=" + transactionId + ", mode=" + mode + ", meta=" + meta
					+ ", getTransactionId()=" + getTransactionId() + ", getMode()=" + getMode() + ", getMeta()="
					+ getMeta() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
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

	public static class Meta {
		private String hint;
		private String expiry;

		public String getHint() {
			return hint;
		}

		public void setHint(String hint) {
			this.hint = hint;
		}

		public String getExpiry() {
			return expiry;
		}

		public void setExpiry(String expiry) {
			this.expiry = expiry;
		}

		@Override
		public String toString() {
			return "Meta [hint=" + hint + ", expiry=" + expiry + ", getHint()=" + getHint() + ", getExpiry()="
					+ getExpiry() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
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

}
