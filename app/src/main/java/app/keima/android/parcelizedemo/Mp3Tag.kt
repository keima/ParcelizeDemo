package app.keima.android.parcelizedemo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.Date

@Parcelize
data class Mp3Tag(
    var artist: String = "",
    var album: String = "",
    var date: Date = Date()
) : Parcelable
