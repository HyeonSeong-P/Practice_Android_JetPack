package com.phs.myapplication.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import com.phs.myapplication.R
import kotlin.Int
import kotlin.String

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeToTest(
    public val a1: String = "default",
    public val a2: Int = 0
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_home_to_test

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("a1", this.a1)
      result.putInt("a2", this.a2)
      return result
    }
  }

  public companion object {
    public fun actionHomeToTest(a1: String = "default", a2: Int = 0): NavDirections =
        ActionHomeToTest(a1, a2)
  }
}
