package `in`.bitlogger.runningtracker.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RunDao {

    @Insert
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    /**
     * This Function will not run in Coroutines because we can't get Live Data from Coroutines.
     * */
    @Query("SELECT * FROM running_table ORDER BY timeStamp DESC")
    fun getAllRunSortedByTimeStamp(): LiveData<List<Run>>

    @Query("SELECT SUM(totalTimeMilli) FROM running_table")
    fun getTotalRunningTime(): LiveData<Float>
}