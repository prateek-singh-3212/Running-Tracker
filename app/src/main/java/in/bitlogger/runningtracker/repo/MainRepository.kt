package `in`.bitlogger.runningtracker.repo

import `in`.bitlogger.runningtracker.db.Run
import `in`.bitlogger.runningtracker.db.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(
   val runDao: RunDao
) {

    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getTotalRunningTime() = runDao.getTotalRunningTime()

    fun getAllRunSortedByTimeStamp() = runDao.getAllRunSortedByTimeStamp()
}