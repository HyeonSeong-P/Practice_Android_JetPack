package com.phs.myapplication.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.phs.myapplication.R

public class TestFragmentDirections private constructor() {
  public companion object {
    public fun actionTestToJust(): NavDirections = ActionOnlyNavDirections(R.id.action_test_to_just)
  }
}
