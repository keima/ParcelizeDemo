package app.keima.android.parcelizedemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import app.keima.android.parcelizedemo.databinding.ActivityMainBinding
import com.evernote.android.state.State
import java.util.*

class MainActivity : AppCompatActivity() {

  companion object {
    private const val TAG = "MainActivity"

    private val songTitlePlaceholders = arrayOf(
        "lorem", "ipsum", "dolor", "sit amet", "consectetur", "adipiscing elit"
    )
    private val songGenrePlaceholders = arrayOf(
        "Pop", "Metal", "Rock", "EDM", "Jazz"
    )
  }

  private lateinit var binding: ActivityMainBinding

  @State()
  var album = Mp3Tag.Album()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    binding.model = album

    binding.saveButton.setOnClickListener {
      album.date = Date()
      Log.d(TAG, "album: $album")
    }

    binding.addSongButton.setOnClickListener {
      album.songs += Mp3Tag.Song(
          title = songTitlePlaceholders.random(),
          genre = songGenrePlaceholders.random()
      )
      Log.d(TAG, "album: $album")
    }

    Log.d(TAG, "album: $album")
  }

}

private fun Array<String>.random(): String {
  val index = Random().nextInt((this.size))
  return this[index]
}
