package com.offcn.pojo;

import java.io.Serializable;
import java.util.Date;


public class Orders implements Serializable{
	private static final long serialVersionUID = 1L;

		private Integer id;

	    private String number;

	    private Date createtime;
	    
	    private String note;    
	   
	    private User user;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public Date getCreatetime() {
			return createtime;
		}

		public void setCreatetime(Date createtime) {
			this.createtime = createtime;
		}

		public String getNote() {
			return note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		@Override
		public String toString() {
			return "Orders [id=" + id + ", number=" + number + ", createtime="
					+ createtime + ", note=" + note + "]";
		}
	    
	     
	    
}
