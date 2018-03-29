package ro.trimec.victorhantelmann.droid_indianaccounting_vk;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import static android.database.sqlite.SQLiteDatabase.CREATE_IF_NECESSARY;

/**
 * Created by Kunal on 6/7/2017.
 * https://github.com/victorhantelmann/Droid_IndianAccounting_VK/tree/master/Droid_IndianAccounting_VK/app/src/main/java/ro/trimec/victorhantelmann/droid_indianaccounting_vk
 */

public class MyDBHelper extends SQLiteOpenHelper {
    // below is the SQL instruction for the creation rules
    // !!! in this one I didn' included an unique ID column that
    // should be included so that we can have a way to uniquely
    // identify a row in the table (YOU SHOULD NOW START STUDYING because YOU NOW HAVE THE MAIN TOOLS)
    private boolean Error = true;

    public MyDBHelper(Context context) {
        // this gets the handle of the database named "DB_NAME"
        // this also connects to the database
        super(context, SQLite_Constants.DB_NAME + SQLite_Constants.DB_EXTENSION, null, SQLite_Constants.VERSION);
        // that on the internal storage can be found with the file name DB_SOME_NAME.db
    }

    public boolean isError() {
        return this.Error;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // this creates the table named TABLE_NAME in the database, and now we know that the table has been creeated
        // without any error
        if (this.CreateTable(db, SQLite_Constants.SQL_CREATE_TABLE_SOME_TABLE_NAME) == -1) {
            this.Error = true;
        } else {
            this.Error = false;
        }
    }

    public int CreateTable(SQLiteDatabase db, String inTableName) {
        try {
            db.execSQL(inTableName);
            return 0;
            // you can add some initial values down here with each creation of the table
        } catch (Exception ex) {
            return -1;
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQLite_Constants.SQL_DROP_TABLE_IF_EXISTS_SOME_TABLE_NAME); // next time when an update takes place, the table will be deleted
        onCreate(db); // and recreated
    }

    public int Insert(SQLiteDatabase db, SomeTable_A_Line inLine) {
        // this is the one
        // what we need is to tell what to insert, of course a Line that we feed as input variable
        // how is the Line made ???
        // I added the ID that was missing there and I also modified the constructors of the class
        // now is time to write our Insert, can you do it ??? not now still need time so u do it for now OK, but you will have to read those docs I pointed you tp
        // the database is the db object
        if (this.Connect() == -1) {
            System.out.println("Database: " + db.getPath() + " could not be connected");
            return -1;
        } else {
            db.execSQL(SQLite_Constants.INSERT_IN_SOME_TABLE +
                    "'" + inLine.getCol_1_value() + "'" + SQLite_Constants.COMMA +
                    inLine.getCol_2_value() + SQLite_Constants.COMMA +
                    inLine.getCol_3_value() +
                    ");");
            return 0;
        } //(one way of doing it) now you saw we have it // as you can see is missing here so we need to pass it as an function input variable
        // that is it but withut error checking ... Did you understand ?yes
        // now what are we missing ?
        // 1. we don' know if the database is open
        // 2. we don' know if the table is available
        // 3. we haven't initiated any values in the SomeTable_A_Line
        // ok im back
        // ok
        // so the things go this way ...
        // 1. open the database
        // 2. verifi if table is there
        // 3. insert the record
        // we need to do 1
        // that was Step 1, did you understood ? yo have some issue but will solved
        // what issues ?
        // how define to use comma and other things?

    }

    public int Delete() {
        return -1;
    }

    public int Update_values_at_ID() {
        return -1;
    }

    public int Select_all_by_Col_1() {
        return -1;
    }

    public int Select_all_by_Col_2() {
        return -1;
    }

    public int Select_all_by_Col_3() {
        return -1;
    }

    public int Select_by_ID() {
        return -1;
    }

    public int Connect() {
        // this is the place for step 1
        // how do we connect to the database ?
        // all the operations will happen in the given Context of the application
        // Cursor is important but for the moment I don' have the data from you about
        // what you need to process
        try {
            SQLiteDatabase.openDatabase(SQLite_Constants.DB_NAME + SQLite_Constants.DB_EXTENSION,
                    null, CREATE_IF_NECESSARY);
            return 0;
        } catch (SQLiteException ex) {
            System.out.println(ex.toString());
            return -1;
        }
    }

    public int Disconnect(Context context, SQLiteDatabase db) {
        // here is where we will disconnect after we are done
        return -1;
    }

    /* Here you can create an universal function to insert data in the table
     * by adding one row of data */
}
