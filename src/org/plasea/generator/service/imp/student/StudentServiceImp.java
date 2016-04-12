package org.plasea.generator.service.imp.student;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.plasea.generator.dao.dao.student.StudentDao;
import org.plasea.generator.model.student.Student;
import org.plasea.generator.service.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *  业务层实现
 * @author 朱素海
 *
 */
@Service
@Transactional
public class StudentServiceImp implements StudentService{

	/**
	 * 日志打印
	 */
	private static final Logger logger = Logger.getLogger(StudentServiceImp.class);
	
	@Autowired
	private StudentDao studentDaoImp;
	
	/**
	 * 添加记录
	 * @param student
	 */
	@Override
	public void saveStudent(Student student) {
		studentDaoImp.saveStudent(student);
	}

	/**
	 * 删除记录
	 * @param student
	 */
	@Override
	public void removeStudent(Student student) {
		studentDaoImp.removeStudent(student);
	}

	/**
	 * 更新记录
	 * @param student
	 */
	@Override
	public void updateStudent(Student student) {
		studentDaoImp.updateStudent(student);
	}

	/**
	 * 根据Id查询记录
	 * @param entityClass
	 * @param id
	 */
	@Override
	public Student findStudentById(Class<Student> entityClass, Serializable id) {
		return studentDaoImp.findStudentById(entityClass, id);
	}

	/**
	 * 增加或者更新记录
	 * @param student
	 */
	@Override
	public void saveOrUpdateStudent(Student student) {
		studentDaoImp.saveOrUpdateStudent(student);
	}

	/**
	 * 根据sql查询实体List
	 * sql应该设计在dao层的，这里只是表示dao层有此方法而已
	 * @param sql
	 * @return
	 */
	@Override
	public List<Student> findStudentsBySql(String sql) {
		return studentDaoImp.findStudentsBySql(sql);
	}

	/**
	 * 根据sql查询实体
	 * sql应该设计在dao层的，这里只是表示dao层有此方法而已
	 * @param sql
	 * @return
	 */
	@Override
	public Student findStudentBySql(String sql) {
		return studentDaoImp.findStudentBySql(sql);
	}

	/**
	 * 根据实体多个条件查询
	 * @param student
	 * @return
	 */
	@Override
	public List<Student> findStudentByExample(Student student) {
		return studentDaoImp.findStudentByExample(student);
	}

	/**
	 * 根据sql更新
	 * sql应该设计在dao层的，这里只是表示dao层有此方法而已
	 * @return
	 */
	@Override
	public int updateStudentBySql(String sql) {
		return studentDaoImp.updateStudentBySql(sql);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentDaoImp.getAllStudent();
	}
	
	
	
}
