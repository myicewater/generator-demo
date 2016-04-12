package org.plasea.generator.service.imp.newstable;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.plasea.generator.dao.dao.newstable.NewsTableDao;
import org.plasea.generator.model.newstable.NewsTable;
import org.plasea.generator.service.service.newstable.NewsTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 * 新闻表 业务层实现
 * @author 朱素海
 *
 */
@Service
@Transactional
public class NewsTableServiceImp implements NewsTableService{

	/**
	 * 日志打印
	 */
	private static final Logger logger = Logger.getLogger(NewsTableServiceImp.class);
	
	@Autowired
	private NewsTableDao newsTableDaoImp;
	
	/**
	 * 添加记录
	 * @param newsTable
	 */
	@Override
	public void saveNewsTable(NewsTable newsTable) {
		newsTableDaoImp.saveNewsTable(newsTable);
	}

	/**
	 * 删除记录
	 * @param newsTable
	 */
	@Override
	public void removeNewsTable(NewsTable newsTable) {
		newsTableDaoImp.removeNewsTable(newsTable);
	}

	/**
	 * 更新记录
	 * @param newsTable
	 */
	@Override
	public void updateNewsTable(NewsTable newsTable) {
		newsTableDaoImp.updateNewsTable(newsTable);
	}

	/**
	 * 根据Id查询记录
	 * @param entityClass
	 * @param id
	 */
	@Override
	public NewsTable findNewsTableById(Class<NewsTable> entityClass, Serializable id) {
		return newsTableDaoImp.findNewsTableById(entityClass, id);
	}

	/**
	 * 增加或者更新记录
	 * @param newsTable
	 */
	@Override
	public void saveOrUpdateNewsTable(NewsTable newsTable) {
		newsTableDaoImp.saveOrUpdateNewsTable(newsTable);
	}

	/**
	 * 根据sql查询实体List
	 * sql应该设计在dao层的，这里只是表示dao层有此方法而已
	 * @param sql
	 * @return
	 */
	@Override
	public List<NewsTable> findNewsTablesBySql(String sql) {
		return newsTableDaoImp.findNewsTablesBySql(sql);
	}

	/**
	 * 根据sql查询实体
	 * sql应该设计在dao层的，这里只是表示dao层有此方法而已
	 * @param sql
	 * @return
	 */
	@Override
	public NewsTable findNewsTableBySql(String sql) {
		return newsTableDaoImp.findNewsTableBySql(sql);
	}

	/**
	 * 根据实体多个条件查询
	 * @param newsTable
	 * @return
	 */
	@Override
	public List<NewsTable> findNewsTableByExample(NewsTable newsTable) {
		return newsTableDaoImp.findNewsTableByExample(newsTable);
	}

	/**
	 * 根据sql更新
	 * sql应该设计在dao层的，这里只是表示dao层有此方法而已
	 * @return
	 */
	@Override
	public int updateNewsTableBySql(String sql) {
		return newsTableDaoImp.updateNewsTableBySql(sql);
	}

	@Override
	public List<NewsTable> getAllNewsTable() {
		return newsTableDaoImp.getAllNewsTable();
	}
	
	
	
}
