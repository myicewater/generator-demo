package org.plasea.generator.service.service.student;

import java.io.Serializable;
import java.util.List;

import org.plasea.generator.model.student.Student;


/**
 * 业务层接口
 * @author 朱素海
 * 2015-12-10 16:49:58
 */
public interface StudentService {

	/**
	 * 添加记录
	 * @param student
	 */
	public void saveStudent(Student student);
	
	/**
	 * 删除记录
	 * @param student
	 */
	public void removeStudent(Student student);
	
	/**
	 * 更新记录
	 * @param student
	 */
	public void updateStudent(Student student);
	
	/**
	 * 根据Id查询记录
	 * @param entityClass
	 * @param id
	 */
	public Student findStudentById(Class<Student> entityClass,Serializable id);
	
	/**
	 * 增加或者更新记录
	 * @param student
	 */
	public void saveOrUpdateStudent(Student student);
	
	/**
	 * 根据sql查询实体List
	 * @param sql
	 * @return
	 */
	public List<Student> findStudentsBySql(String sql);
	
	/**
	 * 根据sql查询实体
	 * @param sql
	 * @return
	 */
	public Student findStudentBySql(String sql);
	
	/**
	 * 根据实体多个条件查询
	 * @param student
	 * @return
	 */
	public List<Student> findStudentByExample(Student student);
	
	/**
	 * 根据sql更新
	 * @return
	 */
	public int updateStudentBySql(String sql);
	
	
	/**
	 * 获取所有数据
	 * @return
	 */
	public List<Student> getAllStudent();
}
