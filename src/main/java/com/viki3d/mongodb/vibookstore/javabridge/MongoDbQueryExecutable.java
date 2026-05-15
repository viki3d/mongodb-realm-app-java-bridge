package com.viki3d.mongodb.vibookstore.javabridge;

/**
 * Execute a query against MongoDB.
 */
public interface MongoDbQueryExecutable {

  /**
   * Execute MongoDB query, fulfilling RealmApp function.
   * Prints the MongoDB query result in JSON format in console. 
   * Errors are logged in JSON 'error' tag and system.err.
   *
   * @param args The java application input arguments
   * 
   */
  public void execute(String[] args);

}
