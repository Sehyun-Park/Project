package com.itwillbs.service;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.itwillbs.dao.MemberDAO;
import com.itwillbs.dao.ProductDAO;
import com.itwillbs.domain.MemberBean;
import com.itwillbs.domain.ProductBean;

@Service
public class ProductServiceImpl implements ProductService {
	
	// xml에서 객체생성한것을 set 메서드를 통해서 부모인터페이스 멤버변수에 객체 생성한 것을 자동으로 전달 받기(Inject 사용)
	@Inject
	private ProductDAO productDAO;

	@Override
	public ArrayList<ProductBean> getProductAllList() {
		return (ArrayList)productDAO.getProductAllList();
	}

	@Override
	public ArrayList<ProductBean> getProductSitrusList() {
		return (ArrayList)productDAO.getProductSitrusList();
	}

	@Override
	public ArrayList<ProductBean> getProductAquaList() {
		return (ArrayList)productDAO.getProductAquaList();
	}

	@Override
	public ArrayList<ProductBean> getProductBestList() {
		return (ArrayList)productDAO.getProductBestList();
	}
	
	@Override
	public ProductBean view(int product_idx) {
		return productDAO.view(product_idx);
	}



	

	

}
