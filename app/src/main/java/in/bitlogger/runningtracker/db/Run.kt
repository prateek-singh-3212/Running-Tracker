package `in`.bitlogger.runningtracker.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
data class Run(
    var previewImage: Bitmap? = null,
    var timeStamp: Long = 0L,
    var avgSpeedKMH: Float = 0f,
    var distanceM: Float = 0f,
    var totalTimeMilli: Long = 0L,
    var caloriesBurned: Float = 0f,
    ) {

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}