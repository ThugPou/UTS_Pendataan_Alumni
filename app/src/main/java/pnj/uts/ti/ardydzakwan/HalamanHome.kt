package pnj.uts.ti.ardydzakwan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View

class HalamanHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_home)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val log = Intent(this,LoginActivity::class.java);
//        val tambah = Intent(this,TambahDataAlumni::class.java);
//        val alumni = Intent(this,DataAlumni::class.java)

        when (item.itemId){
//            R.id.menu_tambah -> startActivity(tambah)
//            R.id.menu_alumni -> startActivity(alumni)
            R.id.menu_logout -> startActivity(log)
        }
        return super.onOptionsItemSelected(item)
    }

    fun clickBerita(view: View) {
        val ber = Intent(this,HalamanBerita::class.java);
        startActivity(ber);
    }

    fun clickHome(view: View) {
        val hom = Intent(this,HalamanHome::class.java);
        startActivity(hom);
    }

    fun clickProfile(view: View) {
        val prof = Intent(this,HalamanProfile::class.java);
        startActivity(prof);
    }
}