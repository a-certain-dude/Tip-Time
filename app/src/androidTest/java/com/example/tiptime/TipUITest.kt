package com.example.tiptime

import androidx.compose.ui.test.junit4.createComposeRule
import com.example.tiptime.ui.theme.TipTimeTheme
import org.junit.Rule
import org.junit.Test

class TipUITest {

    @get: Rule
      val composeTestRule = createComposeRule()

    @Test
        fun calculate_20_percent_tip(){
            composeTestRule.setContent { TipTimeTheme { TipTimeLayout()  } }
        }

}