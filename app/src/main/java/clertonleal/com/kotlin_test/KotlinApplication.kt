package clertonleal.com.kotlin_test

import android.app.Application
import clertonleal.com.kotlin_test.dagger.DaggerMainComponent
import clertonleal.com.kotlin_test.dagger.MainComponent
import clertonleal.com.kotlin_test.dagger.MainModule


class KotlinApplication: Application() {

    companion object {
        @JvmStatic lateinit var graph: MainComponent
    }

    override fun onCreate() {
        super.onCreate()
        graph = DaggerMainComponent.builder().mainModule(MainModule()).build()
    }

}