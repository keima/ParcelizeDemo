package app.keima.android.parcelizedemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import app.keima.android.parcelizedemo.databinding.ActivityMainBinding
import com.evernote.android.state.State
import java.util.Date

class MainActivity : AppCompatActivity() {

  companion object {
    private const val TAG = "MainActivity"
  }

  private lateinit var binding: ActivityMainBinding

  @State
  var mp3Tag = Mp3Tag()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    binding.model = mp3Tag

    binding.saveButton.setOnClickListener {
      mp3Tag.date = Date()
      Log.d(TAG, "*_mp3tag: $mp3Tag")
    }

    Log.d(TAG, "mp3tag: $mp3Tag")
  }

}
