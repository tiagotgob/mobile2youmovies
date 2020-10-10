package br.com.tgob.mobile2youmovies.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.tgob.mobile2youmovies.R
import br.com.tgob.mobile2youmovies.service.RetroFitConfig

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RetroFitConfig()
    }
}
