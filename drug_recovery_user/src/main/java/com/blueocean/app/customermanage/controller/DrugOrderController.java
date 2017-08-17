package com.blueocean.app.customermanage.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueocean.app.customermanage.dto.DrugOrderDo;
import com.blueocean.app.customermanage.entity.PharmacyResponseDTO;
import com.blueocean.app.customermanage.service.DrugOrderInfo;
import com.blueocean.app.customermanage.service.PharmacyManageInfo;
import com.blueocean.common.annotation.isNotDecrypt;
import com.blueocean.common.util.RetInfoUtil;
import com.blueocean.common.vo.RetInfo;




@RequestMapping(value = "DrugOrderAction")
@RestController
public class DrugOrderController {

	@Resource
	private DrugOrderInfo drugOrderInfo;
	@Resource
	private PharmacyManageInfo pharmacyManageInfo;

	/**
	 * @author zhangyalin
	 * 
	 * @return
	 */
	@isNotDecrypt
	@RequestMapping(value = "addOrder")
	public RetInfo addOrder(@RequestBody DrugOrderDo record) {
		RetInfo ret = RetInfoUtil.initRetInfo4Succ();
		drugOrderInfo.addOrder(record);
		// ��ȡ���յ�����
		PharmacyResponseDTO data = pharmacyManageInfo.getDrugRecycleInfo(record.getDrugRecycleSiteId());
		if (data != null) {
			ret.setData(String.format("两小时内，店员%s(%s)会与您联系。优惠券在完成药品回收1分钟内会发到您手机上。", data.getContactName(),
					data.getContactPhone()));
		} else {
			ret.setData("两小时内，店员会与您联系。优惠券在完成药品回收1分钟内会发到您手机上。");
		}
		return ret;
	}

	/**
	 * @author zhangyalin 
	 * 
	 * @return
	 */
	@RequestMapping(value = "updateOrder")
	public RetInfo updateOrder(@RequestBody DrugOrderDo record) {
		RetInfo ret = RetInfoUtil.initRetInfo4Succ();
		drugOrderInfo.updateOrder(record);
		return ret;

	}

}
