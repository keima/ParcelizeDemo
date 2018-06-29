package app.keima.android.parcelizedemo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.Date

class Mp3Tag {

  @Parcelize
  data class Album(
      var title: String = "",
      var artistName: String = "",
      var songs: List<Song> = emptyList(),
      var date: Date = Date()
  ) : Parcelable

  @Parcelize
  data class Song(
      var title: String = "",
      var genre: String = ""
  ) : Parcelable

}


