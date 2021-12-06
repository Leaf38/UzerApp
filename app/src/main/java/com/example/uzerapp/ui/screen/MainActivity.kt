package com.example.uzerapp.ui.screen

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uzerapp.R
import com.example.uzerapp.data.ModelFilm


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set layout manager
        val mainRecyclerView : RecyclerView = findViewById(R.id.mainRecyclerView)
        mainRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL ,false)
        val firstRecyclerView: RecyclerView = findViewById(R.id.firstRecyclerView)
        firstRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL ,false)
        val secondRecyclerView: RecyclerView = findViewById(R.id.secondRecyclerView)
        secondRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL ,false)

        val titlesFilmsList1 = arrayListOf<String>(
            "Aline",
            "Ecanto",
            "SOS fantome",
            "Les bodins en thailande",
            "On est fait pour s'entendre"
        )
        val imageFilm1 = arrayListOf<String>(
            "https://images.app.goo.gl/867NZYfRQdeuMbGc6",
            "https://images.app.goo.gl/RdnvcWRskGvcqJsD9",
            "https://images.app.goo.gl/7Hd9YVEztiMUxCsy5",
            "https://images.app.goo.gl/mgK3doWgZYtzfkLEA",
            "https://images.app.goo.gl/naxw4gnsQaEPmdEu6"
        )
        val titlesFilmsList2 = arrayListOf<String>(
            "Clifford",
            "House of gucci",
            "Amants",
            "Resident evil",
            "Madness paralelas"
        )
        val imageFilm2 = arrayListOf<String>(
            "https://images.app.goo.gl/za1p7FuSN6Cwnwu6A",
            "https://images.app.goo.gl/irVpUMYyPci6QxeT7",
            "https://images.app.goo.gl/hEVFB3K6tuTvPoSZA",
            "https://images.app.goo.gl/N6ZyQpiDuXDM55sMA",
            "https://images.app.goo.gl/R38rhJ71eUJPVnZv5"
        )

        val titleView1: ListView = findViewById(R.id.firstsTitles)
        val adapter1 = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            titlesFilmsList1
        )
        titleView1.adapter = adapter1

        val titleView2: ListView = findViewById(R.id.firstsTitles)
        val adapter2 = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            titlesFilmsList2
        )
        titleView2.adapter = adapter2

        //to put in title and image film in scrollables horizontals listviews
        /*
        var listCustomView1 = ArrayList<ModelFilm>()
        for(i in 0..4)
            listCustomView1.add(ModelFilm(titlesFilmsList1[i], imageFilm1[i]))

        var listCustomView2 = ArrayList<ModelFilm>()
        for(i in 0..4)
            listCustomView2.add(ModelFilm(titlesFilmsList2[i], imageFilm2[i]))

         */

    }

}