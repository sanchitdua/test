package mypack;

import java.util.*;

public class LocationData {

	public static void main(String... x){
		List<TableClass> tcList = null;
		List<ColWithData> cwdList = null;
		tcList = new ArrayList<TableClass>();
		TableClass tClass = null;
//		ColWithData cwd = null;
//		
//		//1
//		
//		cwdList = new ArrayList<ColWithData>();
//		
//		cwd = new ColWithData();
//		cwd.setCol("JobTitleId");
//		cwd.setData("1");
//		cwdList.add(cwd);
//
//
//		cwd = new ColWithData();
//		cwd.setCol("DepartmentId");
//		cwd.setData("1");
//		cwdList.add(cwd);
//
//		cwd = new ColWithData();
//		cwd.setCol("LocationId");
//		cwd.setData("2");
//		cwdList.add(cwd);

		tClass = new TableClass();
//		tClass.setCwdList(cwdList);
		
		tClass.cwdMap = new LinkedHashMap<String, String>();
		
		tClass.cwdMap.put("JobTitleId", "1");
		tClass.cwdMap.put("DepartmentId", "2");
		tClass.cwdMap.put("LocationId", "2");
		
		tcList.add(tClass);

		
//		//2
//		
//		cwdList = new ArrayList<ColWithData>();
//		
//		cwd = new ColWithData();
//		cwd.setCol("JobTitleId");
//		cwd.setData("1");
//		cwdList.add(cwd);
//
//
//		cwd = new ColWithData();
//		cwd.setCol("DepartmentId");
//		cwd.setData("1");
//		cwdList.add(cwd);
//
//		cwd = new ColWithData();
//		cwd.setCol("LocationId");
//		cwd.setData("2");
//		cwdList.add(cwd);
//
//		tClass = new TableClass();
//		tClass.setCwdList(cwdList);
//		tcList.add(tClass);
//
//		
//		
//		
//		//3
//		
//		cwdList = new ArrayList<ColWithData>();
//		
//		cwd = new ColWithData();
//		cwd.setCol("JobTitleId");
//		cwd.setData("1");
//		cwdList.add(cwd);
//
//
//		cwd = new ColWithData();
//		cwd.setCol("DepartmentId");
//		cwd.setData("3");
//		cwdList.add(cwd);
//
//		cwd = new ColWithData();
//		cwd.setCol("LocationId");
//		cwd.setData("2");
//		cwdList.add(cwd);
//
//		tClass = new TableClass();
//		tClass.setCwdList(cwdList);
//		tcList.add(tClass);
//
//		
//		List<TableClass> tcList1 = new ArrayList<TableClass>();
//		
//		
//		
//		//1
//		
//		cwdList = new ArrayList<ColWithData>();
//		
//		cwd = new ColWithData();
//		cwd.setCol("JobTitleId");
//		cwd.setData("1");
//		cwdList.add(cwd);
//
//
//		cwd = new ColWithData();
//		cwd.setCol("DepartmentId");
//		cwd.setData("1");
//		cwdList.add(cwd);
//
//		cwd = new ColWithData();
//		cwd.setCol("LocationId");
//		cwd.setData("2");
//		cwdList.add(cwd);
//
//		tClass = new TableClass();
//		tClass.setCwdList(cwdList);
//		tcList1.add(tClass);
//
//		
//		//2
//		
//		cwdList = new ArrayList<ColWithData>();
//		
//		cwd = new ColWithData();
//		cwd.setCol("JobTitleId");
//		cwd.setData("1");
//		cwdList.add(cwd);
//
//
//		cwd = new ColWithData();
//		cwd.setCol("DepartmentId");
//		cwd.setData("1");
//		cwdList.add(cwd);
//
//		cwd = new ColWithData();
//		cwd.setCol("LocationId");
//		cwd.setData("2");
//		cwdList.add(cwd);
//
//		tClass = new TableClass();
//		tClass.setCwdList(cwdList);
//		tcList1.add(tClass);
//
//		
//		
//		
//		//3
//		
//		cwdList = new ArrayList<ColWithData>();
//		
//		cwd = new ColWithData();
//		cwd.setCol("JobTitleId");
//		cwd.setData("1");
//		cwdList.add(cwd);
//
//
//		cwd = new ColWithData();
//		cwd.setCol("DepartmentId");
//		cwd.setData("3");
//		cwdList.add(cwd);
//
//		cwd = new ColWithData();
//		cwd.setCol("LocationId");
//		cwd.setData("2");
//		cwdList.add(cwd);
//
//		tClass = new TableClass();
//		tClass.setCwdList(cwdList);
//		tcList1.add(tClass);
//		
		
		
		
		tClass = new TableClass();
//		tClass.setCwdList(cwdList);
		
		tClass.cwdMap = new LinkedHashMap<String, String>();
		
		tClass.cwdMap.put("JobTitleId", "1");
		tClass.cwdMap.put("DepartmentId", "2");
		tClass.cwdMap.put("LocationId", "2");
		
		tcList.add(tClass);
		
		
		
		tClass = new TableClass();
//		tClass.setCwdList(cwdList);
		
		tClass.cwdMap = new LinkedHashMap<String, String>();
		
		tClass.cwdMap.put("JobTitleId", "1");
		tClass.cwdMap.put("DepartmentId", "3");
		tClass.cwdMap.put("LocationId", "2");
		
		tcList.add(tClass);
		
		
		
		
		Map<TableClass, List<TableClass>> map = new LinkedHashMap<TableClass, List<TableClass>>();
		
//		for(TableClass tc: tcList){
//			for(TableClass tc1: tcList1){
//				if(tc.getCwdList().equals(tc1.getCwdList())){
//					System.out.println("inside if..");
//				}
//			}
//		}
		
		for(TableClass tc: tcList){
			List<TableClass> tList = null;
			if(map.get(tc) == null){
				tList = new ArrayList<TableClass>();
				tList.add(tc);
				map.put(tc, tList);
			}
			else{
				tList = map.get(tc);
				tList.add(tc);
				map.put(tc, tList);
			}
				
		}
		
		System.out.println("map.size(): "+map.size());
		if(map.size()>0){
			System.out.println("displaying the map...");
			for(Map.Entry<TableClass, List<TableClass>> entry: map.entrySet()){
				System.out.println("key contents... ");
				
					System.out.println("col with data pair: "+entry.getKey().getCwdMap());
				
				
				System.out.println("value contents...");
				for(TableClass tcClass: entry.getValue()){
					System.out.println("col with data pari: "+tcClass.getCwdMap());
				}
			}
			
			
			
						
		}
		
		
	}

}
