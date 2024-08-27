package com.venky.service;

import java.util.List;

import com.venky.model.Amazon;

public interface AmazonService {
	public Amazon saveAmazon(Amazon amazon);
	public Amazon updateAmazon(Amazon amazon,int cid);
	public void deleteAmazon(int cid);
	public Amazon getAmazon(int cid);
	public List<Amazon> getAllAmazon();

}
