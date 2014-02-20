package test.vo;

import java.io.Serializable;

public class Photo implements Serializable {
  private static final long serialVersionUID = 1L;
  int 			no;
  String		substance;
  String		path;
  
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSubstance() {
		return substance;
	}
	public void setSubstance(String substance) {
		this.substance = substance;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	@Override
  public String toString() {
	  return "Photo [no=" + no + ", substance=" + substance + ", path=" + path
	      + "]";
  }
	@Override
  public int hashCode() {
	  final int prime = 31;
	  int result = 1;
	  result = prime * result + no;
	  result = prime * result + ((path == null) ? 0 : path.hashCode());
	  result = prime * result + ((substance == null) ? 0 : substance.hashCode());
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
	  Photo other = (Photo) obj;
	  if (no != other.no)
		  return false;
	  if (path == null) {
		  if (other.path != null)
			  return false;
	  } else if (!path.equals(other.path))
		  return false;
	  if (substance == null) {
		  if (other.substance != null)
			  return false;
	  } else if (!substance.equals(other.substance))
		  return false;
	  return true;
  }
}
