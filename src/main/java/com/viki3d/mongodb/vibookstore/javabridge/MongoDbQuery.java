package com.viki3d.mongodb.vibookstore.javabridge;

/**
 * After RealmApp discontinuation we replace it with this Java bridge app.
 * This enum represents RealmApp functions, defined before in the Cloud.
 */
public enum MongoDbQuery {

  GET_ALL_BOOKS("get-all-books"),
  GET_ALL_AUTHORS("get-all-authors"),
  GET_ALL_COUNTRIES("get-all-countries"),
  GET_AUTHORS_BY_COUNTRY("get-authors-by-country"),
  GET_BOOKS_BY_AUTHOR("get-books-by-author"),
  GET_COUNT_OF_BOOKS_PER_AUTHOR("get-count-of-books-per-author"),
  GET_COUNT_OF_BOOKS_PER_YEAR("get-count-of-books-per-year")
//  NONE("none")
  ;

  private final String value;

  MongoDbQuery(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }

  /**
   * Creates a {@MongoDbQuery} from a string.
   *
   * @param text The string to be parsed.
   * 
   * @return {@MongoDbQuery} value.
   */
  public static MongoDbQuery fromString(String text) {
    for (MongoDbQuery q : MongoDbQuery.values()) {
      if (q.value.equalsIgnoreCase(text)) {
        return q;
      }
    }
    throw new IllegalArgumentException("No MongoDbQuery found for string: " + text);
  }

}