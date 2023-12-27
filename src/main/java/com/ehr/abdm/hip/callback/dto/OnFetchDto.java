package com.ehr.abdm.hip.callback.dto;

import java.util.ArrayList;

public class OnFetchDto {

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

	public static class Auth {
		private String purpose;
		private ArrayList<String> modes;

		public String getPurpose() {
			return purpose;
		}

		public void setPurpose(String purpose) {
			this.purpose = purpose;
		}

		public ArrayList<String> getModes() {
			return modes;
		}

		public void setModes(ArrayList<String> modes) {
			this.modes = modes;
		}

		@Override
		public String toString() {
			return "Auth [purpose=" + purpose + ", modes=" + modes + ", getPurpose()=" + getPurpose() + ", getModes()="
					+ getModes() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
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

	@Override
	public String toString() {
		return "OnFetchDto [requestId=" + requestId + ", timestamp=" + timestamp + ", auth=" + auth + ", error=" + error
				+ ", resp=" + resp + ", getRequestId()=" + getRequestId() + ", getTimestamp()=" + getTimestamp()
				+ ", getAuth()=" + getAuth() + ", getError()=" + getError() + ", getResp()=" + getResp()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
