package test.vo;

import java.io.Serializable;
import java.util.List;

public class Location implements Serializable{
  private static final long serialVersionUID = 1L;
	int 					no;
	String				title;
	String				substance;
	List<Photo> 	photoList;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubstance() {
		return substance;
	}
	public void setSubstance(String substance) {
		this.substance = substance;
	}
	public List<Photo> getPhotoList() {
		return photoList;
	}
	public void setPhotoList(List<Photo> photoList) {
		this.photoList = photoList;
	}
	@Override
  public String toString() {
	  return "Location [no=" + no + ", title=" + title + ", substance="
	      + substance + ", photoList=" + photoList + "]";
  }
	@Override
  public int hashCode() {
	  final int prime = 31;
	  int result = 1;
	  result = prime * result + no;
	  result = prime * result + ((photoList == null) ? 0 : photoList.hashCode());
	  result = prime * result + ((substance == null) ? 0 : substance.hashCode());
	  result = prime * result + ((title == null) ? 0 : title.hashCode());
	  return result;
  }
	@Override
  public boolean equals(Object obj) {
	  if (this == obj)
		  return true;
	  if (obj == null)
		  return false;
	  if (getClass() != obj.getClass())
		  return false;
	  Location other = (Location) obj;
	  if (no != other.no)
		  return false;
	  if (photoList == null) {
		  if (other.photoList != null)
			  return false;
	  } else if (!photoList.equals(other.photoList))
		  return false;
	  if (substance == null) {
		  if (other.substance != null)
			  return false;
	  } else if (!substance.equals(other.substance))
		  return false;
	  if (title == null) {
		  if (other.title != null)
			  return false;
	  } else if (!title.equals(other.title))
		  return false;
	  return true;
  }
}
