package clertonleal.com.kotlin_test.dagger

import clertonleal.com.kotlin_test.MainActivity
import dagger.Component

@Component(modules = arrayOf(MainModule::class))
interface MainComponent {

    fun inject(mainActivity: MainActivity)

}
