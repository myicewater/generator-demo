package org.plasea.generator.model.newstable;  
  

import java.util.Date;  
  
import java.io.Serializable;  
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * 新闻表
 * @author 朱素海
 * 2015-12-10 16:49:58
 */
@Entity  
@Table(name="news_table")
public class NewsTable implements Serializable{


  

	/**
	 * id主键
	 */
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id; 
     

	/**
	 * 标题
	 */
	@Column(name="title")
    private String title; 
     

	/**
	 * 内容
	 */
	@Column(name="content")
    private String content; 
     

	/**
	 * 创建时间
	 */
	@Column(name="create_time")
    private Date createTime; 
     
      
    public void setId(Integer id){  
        this.id=id;  
    }  
      
    public Integer getId(){  
        return this.id;  
    }  
      
    public void setTitle(String title){  
        this.title=title;  
    }  
      
    public String getTitle(){  
        return this.title;  
    }  
      
    public void setContent(String content){  
        this.content=content;  
    }  
      
    public String getContent(){  
        return this.content;  
    }  
      
    public void setCreateTime(Date createTime){  
        this.createTime=createTime;  
    }  
      
    public Date getCreateTime(){  
        return this.createTime;  
    }  
      
}  