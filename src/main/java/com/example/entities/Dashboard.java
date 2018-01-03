package com.example.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


	@Entity


	public class Dashboard implements Serializable{
		private static final long serialVersionUID = 1L;

		@Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long refDashboard;

		public Long getRefDashboard() {
			return refDashboard;
		}

		public void setRefDashboard(Long refDashboard) {
			this.refDashboard = refDashboard;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public Dashboard(Long refDashboard) {
			super();
			this.refDashboard = refDashboard;
		}

		public Dashboard() {
			super();
			// TODO Auto-generated constructor stub
		}

		

	
}
