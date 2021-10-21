package `in`.bitlogger.runningtracker.db

import `in`.bitlogger.runningtracker.utils.Converters
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Run::class], version = 1)
// It tells the location of converter to room.
@TypeConverters(Converters::class)
abstract class RunningDatabase: RoomDatabase() {

    abstract fun getRunningDao(): RunDao
}