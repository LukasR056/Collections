package at.fh.swengb.viewsandactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_copy)
        Log.v("tag","created")
    }

    fun openNewActivity(v:View)
    {
        val intent = Intent(this,StudentDatabase::class.java)
        startActivity(intent)
    }


    override fun onStart()
    {
        super.onStart();
        Log.v("tag","start")
    }
    override fun onResume()
    {
        super.onResume();
        Log.v("tag","resume")
    }
    override fun onPause()
    {
        super.onPause();
        Log.v("tag","pause")
    }
    override fun onStop()
    {
        super.onStop();
        Log.v("tag","stop")
    }
    override fun onDestroy()
    {
        super.onDestroy();
        Log.v("tag","destroy")
    }

}
