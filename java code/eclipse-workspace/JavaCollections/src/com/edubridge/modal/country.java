package com.edubridge.modal;

public class country implements Comparable<country> {
        private int id;
		private String name;
		private int code;
		public country(int id, String name, int code) {
			super();
			this.id = id;
			this.name = name;
			this.code = code;
		
	
		

	}
		public country() {
			super();
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getCode() {
			return code;
		}
		public void setCode(int code) {
			this.code = code;
		}
		@Override
		public String toString() {
			return "country [id=" + id + ", name=" + name + ", code=" + code + "]";
		}
		@Override
		public int compareTo(country o) {
			// TODO Auto-generated method stub
			return Integer.compare(this.getId(), o.getId());
		}
		
		
		
}


