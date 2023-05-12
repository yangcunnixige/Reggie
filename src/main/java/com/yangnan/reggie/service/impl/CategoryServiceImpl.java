package com.yangnan.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yangnan.reggie.entity.Category;
import com.yangnan.reggie.mapper.CategoryMapper;
import com.yangnan.reggie.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
}
