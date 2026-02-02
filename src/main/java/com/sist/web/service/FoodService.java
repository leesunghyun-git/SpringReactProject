package com.sist.web.service;
import java.util.*;


import com.sist.web.vo.*;
public interface FoodService {
	List<FoodListVO> foodListData(int start);
	int foodTotalPage();
}
