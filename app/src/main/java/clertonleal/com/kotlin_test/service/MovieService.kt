package clertonleal.com.kotlin_test.service

import clertonleal.com.kotlin_test.model.Movie
import clertonleal.com.kotlin_test.model.Page
import clertonleal.com.kotlin_test.retroft.MovieNetwork
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class MovieService(val movieNetwork: MovieNetwork) {

    fun getPopularMovies(): Single<Page<Movie>> {
        return movieNetwork.getPopularMovies().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
    }

}