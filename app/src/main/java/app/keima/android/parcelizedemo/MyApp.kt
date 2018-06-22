package app.keima.android.parcelizedemo

import android.app.Application
import com.evernote.android.state.StateSaver

class MyApp : Application() {

  override fun onCreate() {
    super.onCreate()
    StateSaver.setEnabledForAllActivitiesAndSupportFragments(this, true)
  }

}
