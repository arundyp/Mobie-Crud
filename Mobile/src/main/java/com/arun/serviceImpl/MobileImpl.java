package com.arun.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arun.entity.Mobile;
import com.arun.repository.MobileRepository;
import com.arun.service.MobileService;

@Service
public class MobileImpl implements MobileService {

	@Autowired
	private MobileRepository mobileRepository;

	@Override
	public Mobile CreateMobile(Mobile mob) {

		Mobile save = this.mobileRepository.save(mob);
		return save;
	}

	@Override
	public void deleteMobile(int id) {
		Mobile mobile = this.mobileRepository.findById(id).get();
		this.mobileRepository.delete(mobile);

	}

	@Override
	public Mobile singleMobile(int id) {
		Mobile mobile = this.mobileRepository.findById(id).get();
		return mobile;
	}

	@Override
	public List<Mobile> getAllMobile() {
		List<Mobile> all = this.mobileRepository.findAll();
		return all;
	}

	@Override
	public Mobile updateMobile(Mobile mob,int id) {
		Mobile oldMob = this.mobileRepository.findById(id).get();
		oldMob.setName(mob.getName()!=null ? mob.getName() :oldMob.getName());
		oldMob.setCompany(mob.getCompany()!=null ? mob.getCompany() :oldMob.getCompany());
		oldMob.setPrice(mob.getPrice()!=null ? mob.getPrice() :oldMob.getPrice());
		Mobile mobile = this.mobileRepository.save(oldMob);
		return mobile;
	}

}
