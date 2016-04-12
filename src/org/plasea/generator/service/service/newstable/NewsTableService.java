package org.plasea.generator.service.service.newstable;

import java.io.Serializable;
import java.util.List;

import org.plasea.generator.model.newstable.NewsTable;


/**
 * 新闻表业务层接口
 * @author 朱素海
 * 2015-12-10 16:49:58
 */
public interface NewsTableService {

	/**
	 * 添加记录
	 * @param newsTable
	 */
	public void saveNewsTable(NewsTable newsTable);
	
	/**
	 * 删除记录
	 * @param newsTable
	 */
	public void removeNewsTable(NewsTable newsTable);
	
	/**
	 * 更新记录
	 * @param newsTable
	 */
	public void updateNewsTable(NewsTable newsTable);
	
	/**
	 * 根据Id查询记录
	 * @param entityClass
	 * @param id
	 */
	public NewsTable findNewsTableById(Class<NewsTable> entityClass,Serializable id);
	
	/**
	 * 增加或者更新记录
	 * @param newsTable
	 */
	public void saveOrUpdateNewsTable(NewsTable newsTable);
	
	/**
	 * 根据sql查询实体List
	 * @param sql
	 * @return
	 */
	public List<NewsTable> findNewsTablesBySql(String sql);
	
	/**
	 * 根据sql查询实体
	 * @param sql
	 * @return
	 */
	public NewsTable findNewsTableBySql(String sql);
	
	/**
	 * 根据实体多个条件查询
	 * @param newsTable
	 * @return
	 */
	public List<NewsTable> findNewsTableByExample(NewsTable newsTable);
	
	/**
	 * 根据sql更新
	 * @return
	 */
	public int updateNewsTableBySql(String sql);
	
	
	/**
	 * 获取所有数据
	 * @return
	 */
	public List<NewsTable> getAllNewsTable();
}
