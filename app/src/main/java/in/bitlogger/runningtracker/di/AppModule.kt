package `in`.bitlogger.runningtracker.di

import `in`.bitlogger.runningtracker.db.RunningDatabase
import `in`.bitlogger.runningtracker.utils.Constants.RUNNING_DB_NAME
import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) // Tells the lifecycle of the module. When all these dependencies created and destroyed. ** module kab tk valid hai. **
/**
 * Module Classes are the manual which tells the dagger that how to create the instance.
 * */
class AppModule {

    @Provides // Tells the Hilt that it provides something and other classes can depend on this.
    @Singleton // This means that their will be only 1 instance of the database in complete lifetime of module.
    fun provideRunningDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        RunningDatabase::class.java,
        RUNNING_DB_NAME
    ).build()

    @Provides
    @Singleton
    fun provideRunningDao(runningDb: RunningDatabase) = runningDb.getRunningDao()
}