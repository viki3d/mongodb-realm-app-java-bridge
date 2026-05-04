package com.viki3d.mongodb.vibookstore.javabridge;

//import com.viki3d.mongodb.vibookstore.javabridge.MongoDbQueryExecutor;

/**
 * The 'Realm Web SDK' (distributed as the realm-web package) was stopped. So all web applications,
 * based on Realm stopped working. The 'vibookstore' ReactJS app used Realm as bridge to MongoDB on
 * Atlas Cloud. And as result stopped working. Since hosting specifics didn't allow phpX-mongodb 
 * module to be installed - this java bridge implementation was prioritized.
 * 
 * @author viki3d
 */
public class Main {

  /**
   * The main entry point.
   * 
   */
  public static void main(String[] args) {

    //new MongoDbQueryExecutor().execute(args);

  }

}
