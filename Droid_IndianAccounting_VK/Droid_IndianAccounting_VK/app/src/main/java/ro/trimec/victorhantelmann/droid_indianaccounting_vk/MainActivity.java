package ro.trimec.victorhantelmann.droid_indianaccounting_vk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    Boolean isConnectionExist = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Button btnStatus = (Button) findViewById(R.id.btn_check);
        final Button btnOpenDB = (Button) findViewById(R.id.btn_opendb); // here the link with the XML declared object is made because of "@+id/btn_opendb"

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        //tv.setText(stringFromJNI());

        btnOpenDB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // here I defined a Click Listener object that will do the actions we request the button to do when the button is clicked

                // check if the dataBase is AVAILABLE
                if (dataBaseIsAvailable()) {

                    showAlertDialog(MainActivity.this, "Database",
                            "Database is AVAILABLE status OPEN", true);
                } else {
                    // database is NOT AVAILABLE
                    showAlertDialog(MainActivity.this, "Database",
                            "Database is NOT AVAILABLE status CLOSED", false);
                }
            }
        });

        btnStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check for Internet status
                if (isNetworkAvailable()) {

                    showAlertDialog(MainActivity.this, "Internet Connection",
                            "Your device has internet access", true);
                } else {
                    // Internet connection doesn't exist
                    showAlertDialog(MainActivity.this, "No Internet Connection",
                            "Your device doesn't have internet access", false);
                }
            }
        });
    }

    private boolean dataBaseIsAvailable() {
        // here is the connection point with the services provided by MyDBHelper object
        return false;
    }
    private boolean isNetworkAvailable() {
        ConnectivityManager cm = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
    }

    public void showAlertDialog(Context context, String title, String message, Boolean status) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(message).setTitle(title);
        builder.setIcon((status) ? R.mipmap.ic_thumb_up_black_24dp : R.mipmap.ic_thumb_down_black_24dp);
        builder.setNeutralButton("OK",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    //public native String stringFromJNI();
}
