package `in`.bitlogger.runningtracker.utils

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import java.io.ByteArrayOutputStream

class Converters {

    @TypeConverter
    fun convertByteArrayToBitmap(byteArray: ByteArray): Bitmap {
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
    }

    /**
     * Helps to store the Bitmap to the database.
     * It Stores the bitmap in the form of ByteArray i.e in the format of 0s and 1s.
     * TypeConverter converts tells the ROOM to find and convert the unspecified datatype to its favourite datatype.
     * */
    @TypeConverter
    fun convertBitmapToByteArray(bitmap: Bitmap): ByteArray {
        val outputStream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
        return outputStream.toByteArray()
    }
}