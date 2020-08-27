package data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import static data.PetContract.PetsEntry.*;



public class PetsDbHelper extends SQLiteOpenHelper {

    public final static String DATABASE_NAME = "shelter.db";

    public final static int VERSION_NUMBER = 1;

    public PetsDbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION_NUMBER);
    }

//   public  static PetsDbHelper(Context context){
//       super(context, DATABASE_NAME, null, VERSION_NUMBER);
//   }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + _ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COLUMN_PET_NAME + "TEXT NOT NULL, "
                + COLUMN_PET_BREED + "TEXT, "
                + COLUMN_GENDER + "INTEGER NOT NULL, "
                + COLUMN_PET_WEIGHT + "INTEGER NOT NULL DEFAULT 0);";
        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
