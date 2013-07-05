package mypack;

import java.util.*;

public class CopyOfTableClass {
	public List<ColWithData> cwdList;

	public List<ColWithData> getCwdList() {
		return cwdList;
	}

	public void setCwdList(List<ColWithData> cwdList) {
		this.cwdList = cwdList;
	}

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("inside equals method.");
		CopyOfTableClass tClass = (CopyOfTableClass) obj;
		
		boolean returnVal = true;
		
		
//		for(int i=0; i<this.getCwdList().size(); i++){
//			if(this.getCwdList().get(i).getData().equalsIgnoreCase(tClass.getCwdList().get(i).getData())){
//				System.out.println("value matched for the data: "+this.getCwdList().get(i).getData());
//				
//			}
//		}
		
		for(ColWithData cwd: this.getCwdList()){
			for(ColWithData innerCwd: tClass.getCwdList()){
				if(cwd.getCol().equalsIgnoreCase(innerCwd.getCol())){
					if(!cwd.getData().equalsIgnoreCase(innerCwd.getData()))
						returnVal = false;
				}
			}
		}
		
		return returnVal;
	}

	@Override
	public int hashCode() {
		int hCode = 0;
		for(ColWithData cwd: this.getCwdList()){
			hCode = hCode+cwd.getData().hashCode();
		}
		
		return hCode;
	}
	
	
	
}
