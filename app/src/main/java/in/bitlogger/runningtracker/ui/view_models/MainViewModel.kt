package `in`.bitlogger.runningtracker.ui.view_models

import `in`.bitlogger.runningtracker.db.Run
import `in`.bitlogger.runningtracker.repo.MainRepository
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
  val mainRepo: MainRepository // Hilt will take automatically this because Main repo use 1 reunDao parameter only which can be fulfilled by HILT.
): ViewModel() {

}