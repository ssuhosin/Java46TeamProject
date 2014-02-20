package test.controls;

import java.util.List;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import test.dao.LocationDao;
import test.dao.PhotoDao;
import test.vo.JsonResult;
import test.vo.Location;
import test.vo.Photo;

@Controller
@RequestMapping("/photo")
public class PhotoControl {
	Logger log = Logger.getLogger(PhotoControl.class);
	
	@Autowired
	ServletContext servletContext;
	
	@Autowired(required=false)
	PhotoDao photoDao;

	@Autowired(required=false)
	LocationDao locationDao;
	
	
	@RequestMapping("/view")
	public void viewPhotos(int no, Model model) throws Exception {
		no = 1;
		List<Photo> list = photoDao.selectListByLocation(no);
		model.addAttribute("photos", list);
	}
	
	@RequestMapping(value="/ajax/list", produces="application/json")
	public Object ajaxList() throws Exception {
    List<Location> locationList = locationDao.selectList();
    
    for(Location location:locationList) {
    	location.setPhotoList(photoDao.selectListByLocation(location.getNo()));
    }
		
		try {
			return new JsonResult().setResultStatus(JsonResult.SUCCESS) 
					.setData(locationList);
			
		} catch (Throwable ex) {
			return new JsonResult().setResultStatus(JsonResult.FAILURE)
					.setError(ex.getMessage());
		}
		
	}
//	@RequestMapping(value="/ajax/list", produces="application/json")
//	public Object ajaxList() throws Exception {
//		try {
//			return new JsonResult().setResultStatus(JsonResult.SUCCESS) 
//					.setData(photoDao.selectListByLocation(1));
//			
//		} catch (Throwable ex) {
//			return new JsonResult().setResultStatus(JsonResult.FAILURE)
//					.setError(ex.getMessage());
//		}
//	}
}










