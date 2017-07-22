package clertonleal.com.kotlin_test

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import clertonleal.com.kotlin_test.application.KotlinApplication
import clertonleal.com.kotlin_test.service.MovieService
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var movieService: MovieService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        KotlinApplication.graph.inject(this)

        movieService.getPopularMovies().subscribe(
                { result -> text.text = result.toString() },
                { error -> Log.e("UI", error.message, error)
        })
    }
}
