package org.plasea.generator.model.student;  
  

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
 * 
 * @author 朱素海
 * 2015-12-10 16:49:58
 */
@Entity  
@Table(name="student")
public class Student implements Serializable{


  

	/**
	 * 
	 */
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id; 
     

	/**
	 * 
	 */
	@Column(name="name")
    private String name; 
     

	/**
	 * 性别
	 */
	@Column(name="gender")
    private Boolean gender; 
     

	/**
	 * 
	 */
	@Column(name="bithday")
    private Date bithday; 
     

	/**
	 * 
	 */
	@Column(name="age")
    private Integer age; 
     
      
    public void setId(Integer id){  
        this.id=id;  
    }  
      
    public Integer getId(){  
        return this.id;  
    }  
      
    public void setName(String name){  
        this.name=name;  
    }  
      
    public String getName(){  
        return this.name;  
    }  
      
    public void setGender(Boolean gender){  
        this.gender=gender;  
    }  
      
    public Boolean getGender(){  
        return this.gender;  
    }  
      
    public void setBithday(Date bithday){  
        this.bithday=bithday;  
    }  
      
    public Date getBithday(){  
        return this.bithday;  
    }  
      
    public void setAge(Integer age){  
        this.age=age;  
    }  
      
    public Integer getAge(){  
        return this.age;  
    }  
      
}  