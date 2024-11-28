package com.arun.service;

import java.util.List;

import com.arun.entity.Mobile;

public interface MobileService {
	
	Mobile CreateMobile(Mobile mob);
	void deleteMobile(int id);
	Mobile singleMobile(int id);
	List<Mobile> getAllMobile();
	Mobile updateMobile(Mobile mob, int id);

}
