package com.dao;

import org.springframework.stereotype.Service;

import com.model.Category;
@Service
public interface CategoryDao 
{
	public void insertCategory(Category category);

}
