package org.plasea.generator.dao.imp.newstable;

import java.io.Serializable;
import java.util.List;
import org.plasea.generator.dao.dao.newstable.NewsTableDao;
import org.plasea.generator.model.newstable.NewsTable;
import org.springframework.stereotype.Repository;
import org.plasea.generator.dao.base.BaseDao;
/**
 * 新闻表dao实现层
 * @author 朱素海
 * 2015-12-10 16:49:58
 */
@Repository
public class NewsTableDaoImp extends BaseDao<NewsTable> implements NewsTableDao{

	/**
	 * 添加记录
	 * @param newsTable
	 */
	@Override
	public void saveNewsTable(NewsTable newsTable) {
		this.saveEntity(newsTable);
	}

	/**
	 * 删除记录
	 * @param newsTable
	 */
	@Override
	public void removeNewsTable(NewsTable newsTable) {
		this.removeEntity(newsTable);
	}

	/**
	 * 更新记录
	 * @param newsTable
	 */
	@Override
	public void updateNewsTable(NewsTable newsTable) {
		this.updateEntity(newsTable);
	}

	/**
	 * 根据Id查询记录
	 * @param entityClass
	 * @param id
	 */
	@Override
	public NewsTable findNewsTableById(Class<NewsTable> entityClass, Serializable id) {
		return (NewsTable)this.findEntityById(entityClass, id);
	}

	/**
	 * 增加或者更新记录
	 * @param newsTable
	 */
	@Override
	public void saveOrUpdateNewsTable(NewsTable newsTable) {
		this.saveOrUpdateEntity(newsTable);
	}

	/**
	 * 根据sql查询实体List
	 * @param sql
	 * @return
	 */
	@Override
	public List<NewsTable> findNewsTablesBySql(String sql) {
		return (List<NewsTable>)this.findEntitiesBySql(sql);
	}

	/**
	 * 根据sql查询实体
	 * @param sql
	 * @return
	 */
	@Override
	public NewsTable findNewsTableBySql(String sql) {
		return (NewsTable)this.findEntityBysql(sql);
	}

	/**
	 * 根据实体多个条件查询
	 * @param newsTable
	 * @return
	 */
	@Override
	public List<NewsTable> findNewsTableByExample(NewsTable newsTable) {
		return (List<NewsTable>)this.findEntityByExample(newsTable);
	}

	/**
	 * 通过sql更新
	 */
	@Override
	public int updateNewsTableBySql(String sql) {
		return this.updateBySql(sql);
	}

	@Override
	public List<NewsTable> getAllNewsTable() {
		// TODO Auto-generated method stub
		return this.findNewsTablesBySql("from NewsTable");
	}
	
	

}
