package clertonleal.com.kotlin_test.retroft

import clertonleal.com.kotlin_test.model.Movie
import clertonleal.com.kotlin_test.model.Page
import io.reactivex.Single
import retrofit2.http.GET


interface MovieNetwork {

    @GET("discover/movie?api_key=eddb362a1742665362f8f056fe2b72ba")
    fun getPopularMovies(): Single<Page<Movie>>

}