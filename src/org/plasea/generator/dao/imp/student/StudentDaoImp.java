package org.plasea.generator.dao.imp.student;

import java.io.Serializable;
import java.util.List;
import org.plasea.generator.dao.dao.student.StudentDao;
import org.plasea.generator.model.student.Student;
import org.springframework.stereotype.Repository;
import org.plasea.generator.dao.base.BaseDao;
/**
 * dao实现层
 * @author 朱素海
 * 2015-12-10 16:49:58
 */
@Repository
public class StudentDaoImp extends BaseDao<Student> implements StudentDao{

	/**
	 * 添加记录
	 * @param student
	 */
	@Override
	public void saveStudent(Student student) {
		this.saveEntity(student);
	}

	/**
	 * 删除记录
	 * @param student
	 */
	@Override
	public void removeStudent(Student student) {
		this.removeEntity(student);
	}

	/**
	 * 更新记录
	 * @param student
	 */
	@Override
	public void updateStudent(Student student) {
		this.updateEntity(student);
	}

	/**
	 * 根据Id查询记录
	 * @param entityClass
	 * @param id
	 */
	@Override
	public Student findStudentById(Class<Student> entityClass, Serializable id) {
		return (Student)this.findEntityById(entityClass, id);
	}

	/**
	 * 增加或者更新记录
	 * @param student
	 */
	@Override
	public void saveOrUpdateStudent(Student student) {
		this.saveOrUpdateEntity(student);
	}

	/**
	 * 根据sql查询实体List
	 * @param sql
	 * @return
	 */
	@Override
	public List<Student> findStudentsBySql(String sql) {
		return (List<Student>)this.findEntitiesBySql(sql);
	}

	/**
	 * 根据sql查询实体
	 * @param sql
	 * @return
	 */
	@Override
	public Student findStudentBySql(String sql) {
		return (Student)this.findEntityBysql(sql);
	}

	/**
	 * 根据实体多个条件查询
	 * @param student
	 * @return
	 */
	@Override
	public List<Student> findStudentByExample(Student student) {
		return (List<Student>)this.findEntityByExample(student);
	}

	/**
	 * 通过sql更新
	 */
	@Override
	public int updateStudentBySql(String sql) {
		return this.updateBySql(sql);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return this.findStudentsBySql("from Student");
	}
	
	

}
