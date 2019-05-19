package bdbk.seckill.service;

import bdbk.seckill.dao.GoodsDao;
import bdbk.seckill.domain.SeckillGoods;
import bdbk.seckill.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  商品逻辑层
 */
@Service
public class GoodsService {
	
	@Autowired
	private GoodsDao goodsDao;
	
	public List<GoodsVo> listGoodsVo(){
		return goodsDao.listGoodsVo();
	}

	public GoodsVo getGoodsVoByGoodsId(long goodsId) {
		return goodsDao.getGoodsVoByGoodsId(goodsId);
	}

	/**
	 * 减库存 下订单 写入秒杀订单
	 */
	void reduceStock(GoodsVo goods) {
		SeckillGoods g = new SeckillGoods();
		g.setGoodsId(goods.getId());
		goodsDao.reduceStock(g);
	}
	
	
	
}
