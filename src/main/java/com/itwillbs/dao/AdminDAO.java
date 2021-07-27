package com.itwillbs.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.itwillbs.domain.CouponBean;
import com.itwillbs.domain.NoticeBean;
import com.itwillbs.domain.ProductBean;
import com.itwillbs.domain.ReviewBean;

public interface AdminDAO {
	
	public void insertNotice(NoticeBean noticeBean);

	public List<NoticeBean> getNoticeList();

	public void deleteNotice(int notice_idx);

	public NoticeBean getNotice(int notice_idx);

	public void noticeUpdate(NoticeBean nb);

	public List<ReviewBean> getReviewList();

	public void deleteReview(int review_idx);

	public List<CouponBean> getCouponList();


}
