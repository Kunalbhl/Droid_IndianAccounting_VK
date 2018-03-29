package ro.trimec.victorhantelmann.droid_indianaccounting_vk;

/**
 * Created by shree on 7/16/2017.
 * This class contains only constants so the constructor for it is
 * the default one SQLite_Constants() {} which only creates the needed memory space
 * to hold all the constant values - no need to write it
 * Access to the variables is done by invoking them from the STATIC context
 * so SQLite_Constants.[variable name] will return the variable value that
 * is always the same
 */

public class SQLite_Constants {
    public static final int VERSION = 1;

    public static final String DB_NAME = "DB_SOME_NAME";
    public static final String DB_EXTENSION = ".db";

    public static final String SPACE = " ";
    public static final String COMMA = "," + SQLite_Constants.SPACE;
    public static final String DROP_TABLE_IF_EXISTS = "DROP TABLE IF EXISTS ";
    public static final String CREATE_TABLE = "CREATE TABLE ";

    public static final String IF_NOT_EXISTS = "IF NOT EXISTS ";
    public static final String TABLE_NAME = "OUR_TABLE";
    public static final String SQL_DROP_TABLE_IF_EXISTS_SOME_TABLE_NAME =
            SQLite_Constants.DROP_TABLE_IF_EXISTS +
                    SQLite_Constants.TABLE_NAME +
                    ";";
    public static final String SOME_TABLE_COL_ID_NAME = "ID";
    public static final String SOME_TABLE_COL_ID_TYPE = "INTEGER PRIMARY KEY AUTOINCREMENT";
    public static final String SOME_TABLE_COL_1_NAME = "COL_1";
    public static final String SOME_TABLE_COL_1_TYPE = "TEXT";
    public static final String SOME_TABLE_COL_2_NAME = "COL_2";
    public static final String SOME_TABLE_COL_2_TYPE = "INTEGER";
    public static final String SOME_TABLE_COL_3_NAME = "COL_3";
    public static final String SOME_TABLE_COL_3_TYPE = "REAL";
    public static final String SQL_CREATE_TABLE_SOME_TABLE_NAME =
            SQLite_Constants.CREATE_TABLE +
                    SQLite_Constants.IF_NOT_EXISTS +
                    SQLite_Constants.SPACE +
                    SQLite_Constants.TABLE_NAME +
                    SQLite_Constants.SPACE +
                    "(" +
                    SQLite_Constants.SOME_TABLE_COL_ID_NAME + SQLite_Constants.SPACE +
                    SQLite_Constants.SOME_TABLE_COL_ID_TYPE + // this part is for the primary key
                    SQLite_Constants.COMMA +
                    SQLite_Constants.SOME_TABLE_COL_1_NAME + SQLite_Constants.SPACE +
                    SQLite_Constants.SOME_TABLE_COL_1_TYPE +
                    SQLite_Constants.COMMA +
                    SQLite_Constants.SOME_TABLE_COL_2_NAME + SQLite_Constants.SPACE +
                    SQLite_Constants.SOME_TABLE_COL_2_TYPE +
                    SQLite_Constants.COMMA +
                    SQLite_Constants.SOME_TABLE_COL_3_NAME + SQLite_Constants.SPACE +
                    SQLite_Constants.SOME_TABLE_COL_3_TYPE +
                    ");";
    // INSERT INTO TABLE_NAME [(column1, column2, column3,...columnN) VALUES (value1, value2, value3,...valueN);
    // our column1 is the name that is SOME_TABLE_COL_1_NAME they are constant
    // our column2 is the name that is SOME_TABLE_COL_2_NAME they are constant
    // our column3 is the name that is SOME_TABLE_COL_3_NAME they are constant

    // we have the word VALUES ... you make it
    // you can't change it, that is the language that SQLite uses, if you ghange it, SQLite will generate an error, ok
    // just define a variable for it, same way I did ok got it
    public static final String VALUES = " VALUES "; // like so
    // now to use it for our table
    public static final String INSERT_IN_SOME_TABLE = "INSERT INTO " +
            SQLite_Constants.TABLE_NAME +
            "(" +
            SQLite_Constants.SOME_TABLE_COL_1_NAME +
            SQLite_Constants.SOME_TABLE_COL_2_NAME +
            SQLite_Constants.SOME_TABLE_COL_3_NAME +
            ")"
            + SQLite_Constants.VALUES + " (";
    // the class is SQLite_Constants, so I used the ready made variables, but INSERT is useless because we can move it as you could see
    // so I reused TABLE_NAME and I will reuse VALUES later
    // now do you get it ??? yep
    // since the rest are variable, then only one more thing is still constant that one
    // now we need to create the Insert function
}
