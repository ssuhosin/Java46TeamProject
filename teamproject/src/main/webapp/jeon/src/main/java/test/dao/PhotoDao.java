package test.dao;

import java.util.List;

import test.vo.Photo;

public interface PhotoDao {
	public List<Photo> selectListByLocation(int locationNo); 	
}







