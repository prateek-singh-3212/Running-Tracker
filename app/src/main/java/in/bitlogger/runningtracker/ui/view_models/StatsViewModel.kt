package `in`.bitlogger.runningtracker.ui.view_models

import `in`.bitlogger.runningtracker.repo.MainRepository
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StatsViewModel @Inject constructor(
    val mainRepo: MainRepository
): ViewModel() {

    fun getTotalDuration() = mainRepo.getTotalRunningTime()
}