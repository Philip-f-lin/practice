package com.itheima.service;

import com.itheima.mapper.BrandMapper;
import com.itheima.pojo.Brand;
import com.itheima.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class BrandService {
    //獲取sqlSessionFactory對象
    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    //查詢所有
    public List<Brand> selectAll(){
        //調用BrandMapper.selectAll()

        //1. 創建sqlSession
        SqlSession sqlSession = factory.openSession();
        //2. 獲取BrandMapper
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //3. 調用方法
        List<Brand> brands = brandMapper.selectAll();

        //釋放資源
        sqlSession.close();

        return brands;
    }

    //添加
    public void add(Brand brand){
        //1. 創建sqlSession
        SqlSession sqlSession = factory.openSession();
        //2. 獲取BrandMapper
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //3.調用方法
        brandMapper.add(brand);

        //提交事務
        sqlSession.commit();
        //釋放資源
        sqlSession.close();

    }

    public Brand selectById(int id){
        //調用BrandMapper.selectAll()

        //1. 創建sqlSession
        SqlSession sqlSession = factory.openSession();
        //2. 獲取BrandMapper
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //3. 調用方法
        Brand brand = brandMapper.selectById(id);

        //釋放資源
        sqlSession.close();

        return brand;
    }

    //修改
    public void update(Brand brand){
        //1. 創建sqlSession
        SqlSession sqlSession = factory.openSession();
        //2. 獲取BrandMapper
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //3.調用方法
        brandMapper.update(brand);
        //提交事務
        sqlSession.commit();
        //釋放資源
        sqlSession.close();

    }
}
