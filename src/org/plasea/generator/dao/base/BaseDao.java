package org.plasea.generator.dao.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Hibernate操作数据库基础类
 * @author 朱素海
 *
 */
public abstract class BaseDao<T> {

	@Autowired
	private HibernateDao hibernateDao;
	
	
	
	
	/**
	 * 增加实体（标准）
	 * @param entity
	 * @return
	 */
	public Integer saveEntity(Object entity){
		return (Integer)this.getHibernateDao().getHibernateTemplate().save(entity);
	}
	
	/**
	 * 删除实体（标准）
	 * @param entity
	 */
	public void removeEntity(Object entity){
		 this.getHibernateDao().getHibernateTemplate().delete(entity);
	}
	
	/**
	 * 更新实体（标准）
	 * @param entity
	 */
	public void updateEntity(Object entity){
		this.getHibernateDao().getHibernateTemplate().update(entity);
	}
	
	/**
	 * 根据Id查询实体（标准）
	 * @param entityClass
	 * @param id
	 * @return
	 */
	public Object findEntityById(Class<?> entityClass,Serializable id){
		return (Object)this.getHibernateDao().getHibernateTemplate().get(entityClass, id);
	}


	/**
	 * 保存或更新实体,根据是否有主键Id 决定用save 或者update
	 * @param entity
	 */
	public void saveOrUpdateEntity(Object entity){
		this.getHibernateDao().getHibernateTemplate().saveOrUpdate(entity);
	}
	
	
	/**
	 * 通过sql查询多个实体，返回实体List
	 * @param sql
	 * @return
	 */
	public List<?> findEntitiesBySql(String sql){
		List<?> list = this.getHibernateDao().getHibernateTemplate().find(sql);
		return list;
	}
	
	
	/**
	 * 通过sql查询单个实体，返回实体
	 * @param sql
	 * @return
	 */
	public Object findEntityBysql(String sql){
		List<?> list = this.getHibernateDao().getHibernateTemplate().find(sql);
		if(list.size() <1){
			return null;
		}else if(list.size() > 1){
			throw new RuntimeException("查询多个结果："+sql);
		}else{
			return list.get(0);
		}
	}
	
	
	/**
	 * 根据实体多个条件查询
	 * @param object
	 * @return
	 */
	public List<?> findEntityByExample(Object object){
		List<?> list = this.getHibernateDao().getHibernateTemplate().findByExample(object);
		return list;
	}
	
	
	/**
	 * 更新操作
	 * @param sql
	 * @return
	 */
	public int updateBySql(String sql){
		int result = this.getHibernateDao().getHibernateTemplate().bulkUpdate(sql);
		//this.getHibernateDao().getSessionFactory().openSession().flush();
		return result;
		
	}
	
	
	
	/****************以下方法并没有在实体里添加*****************/
	
	/**
	 * 根据有参数的sql查询实体类
	 * @param sql
	 * @param paramName
	 * @param paramValue
	 * @return
	 */
	public List<?> findEntityByParamSql(String sql,String paramName,Object paramValue){
		List<?> list = this.getHibernateDao().getHibernateTemplate().findByNamedParam(sql, paramName, paramValue);
		return list;
	}
	
	/**
	 * 根据多个参数sql查询实体
	 * @param sql
	 * @param paramNames
	 * @param values
	 * @return
	 */
	public List<?> findEntityByParamsSql(String sql,String[] paramNames,Object[] values){
		List<?> list = this.getHibernateDao().getHibernateTemplate().findByNamedParam(sql, paramNames, values);
		return  list;
	}
	
	
	
	/**
	 * 根据sql语句查询任意东西，返回Map
	 * @param sql
	 * @return
	 */
	public Map<String,Object> findObjectBySql(String sql){
		List<?> list = this.getHibernateDao().getHibernateTemplate().find(sql);
		if(list.size() <1){
			return null;
		}else if(list.size() >1){
			throw new RuntimeException("查询多个结果："+sql);
		}else{
			return (Map<String, Object>) list.get(0);
		}
	}
	
	/**
	 * 根据sql语句查询，返回Maplist
	 * @param sql
	 * @return
	 */
	public List<Map<String,Object>> findListBySql(String sql){
		List<?> list = this.getHibernateDao().getHibernateTemplate().find(sql);
		return (List<Map<String, Object>>) list;
	}
	
	/**
	 * 返回当前session
	 * @return
	 */
	public Session getCurrentSession(){
		Session session = this.getHibernateDao().getHibernateTemplate().getSessionFactory().getCurrentSession();
		return session;
	}


	public HibernateDao getHibernateDao() {
		return hibernateDao;
	}




	public void setHibernateDao(HibernateDao hibernateDao) {
		this.hibernateDao = hibernateDao;
	}
	
}
