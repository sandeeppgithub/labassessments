package com.casestudy;


	
	public class Dept {
		protected int departmentId, managerId;
		protected String departmentName;

		public int getDepartmentId() {
			return departmentId;
		}

		public void setDepartmentId(int departmentId) {
			this.departmentId = departmentId;
		}

		public int getManagerId() {
			return managerId;
		}

		public void setManagerId(int managerId) {
			this.managerId = managerId;
		}

		public String getDepartmentName() {
			return departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}

		@Override
		public String toString() {
			return "Department [departmentId=" + departmentId + ", managerId=" + managerId + ", departmentName="
					+ departmentName + "]";
		}

		public Dept(int departmentId, int managerId, String departmentName) {
			super();
			this.departmentId = departmentId;
			this.managerId = managerId;
			this.departmentName = departmentName;
		}

	}


