package com.venky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venky.model.Amazon;
import com.venky.repo.AmazonRepo;
@Service
public class AmazonServiceImp implements AmazonService {
	@Autowired
	private AmazonRepo repo;

	@Override
	public Amazon saveAmazon(Amazon amazon) {
		double tot=0.0,gst=0.0,bill=0.0,dis=0.0;
		tot=amazon.getPrice()*amazon.getQuantity();
		if(tot<2500)
		{
			dis=tot*10/100;
		}
		else if(tot>=2500&&tot<5000)
		{
			dis=tot*15/100;
		}
		else
		{
			dis=tot*30/100;
		}
		gst=tot*18/100;
		bill=tot+gst-dis;
		amazon.setTotal(tot);
		amazon.setDiscount(dis);
		amazon.setGst(gst);
		amazon.setInvoice_bill(bill);
		return repo.save(amazon);
	}
	@Override
	public List<Amazon> getAllAmazon() {
		List<Amazon> listProducts=(List<Amazon>)repo.findAll();
		return listProducts;
	}
	@Override
	public Amazon getAmazon(int cid) {
		Amazon get=repo.findById(cid).get();
		return get;
	}

	@Override
	public Amazon updateAmazon(Amazon amazon, int cid) {
		double tot=0.0,gst=0.0,bill=0.0,dis=0.0;
		tot=amazon.getPrice()*amazon.getQuantity();
		
		if(tot<2500)
		{
			dis=tot*10/100;
		}
		else if(tot>=2500&&tot<5000)
		{
			dis=tot*15/100;
		}
		else
		{
			dis=tot*30/100;
		}
		gst=tot*18/100;
		bill=tot+gst-dis;
		amazon.setTotal(tot);
		amazon.setDiscount(dis);
		amazon.setGst(gst);
		amazon.setInvoice_bill(bill);
		return repo.save(amazon);
	}

	@Override
	public void deleteAmazon(int cid) {
		repo.deleteById(cid);

	}

	

	

}
