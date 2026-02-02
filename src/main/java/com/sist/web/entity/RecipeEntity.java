package com.sist.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "recipe2")
@Data
public class RecipeEntity {
	/*
	 * 이름         널? 유형             
---------- -- -------------- 
NO            NUMBER(38)     
TITLE         VARCHAR2(4000) 
POSTER        VARCHAR2(4000) 
CHEF          VARCHAR2(4000) 
LINK          VARCHAR2(26)   
HIT           NUMBER(38)     
LIKECOUNT     NUMBER(38)     
JJIMCOUNT     NUMBER(38)     
REPLYCOUNT    NUMBER(38)  
	 */
	@Id
	private int no;
	
	private String title,poster,chef,link;
	private int hit,likecount,jjimcount,replycount;
}
