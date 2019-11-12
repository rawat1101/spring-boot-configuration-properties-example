package com.boraji.tutorial.springboot.config;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Credential {
		@NotBlank
		private String userName;
		@Size(max = 15, min = 6)
		private String password;

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	}
