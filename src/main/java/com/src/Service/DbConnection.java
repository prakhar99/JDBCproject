package com.src.Service;
import java.sql.Connection;
/**
 * @author Prakhar.Saxena
 *
 */
public interface DbConnection {

	public void registerConnection();
	public Connection makeConnection();
	
}
