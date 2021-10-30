package com.phs.myapplication.fragment

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmStatic

public data class TestFragmentArgs(
  public val a1: String = "default",
  public val a2: Int = 0
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("a1", this.a1)
    result.putInt("a2", this.a2)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): TestFragmentArgs {
      bundle.setClassLoader(TestFragmentArgs::class.java.classLoader)
      val __a1 : String?
      if (bundle.containsKey("a1")) {
        __a1 = bundle.getString("a1")
        if (__a1 == null) {
          throw IllegalArgumentException("Argument \"a1\" is marked as non-null but was passed a null value.")
        }
      } else {
        __a1 = "default"
      }
      val __a2 : Int
      if (bundle.containsKey("a2")) {
        __a2 = bundle.getInt("a2")
      } else {
        __a2 = 0
      }
      return TestFragmentArgs(__a1, __a2)
    }
  }
}
