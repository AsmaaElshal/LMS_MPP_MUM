package dataaccess;

public class DataAccessSingleton {
	private static DataAccess dataAccess = null;
	
	private DataAccessSingleton(){
		
	}
	
	public static DataAccess getDataAccess(){
		if(dataAccess == null){
			dataAccess = new DataAccessFacade();
		}
		return dataAccess;
	}
	
	public static void setDataAccess(DataAccess data){
		dataAccess = data;
	}

}
